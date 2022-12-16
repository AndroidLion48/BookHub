/*
 * Copyright (c) 2022 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.yourcompany.android.bookhubapp.ui.fragments

import android.app.Activity
import android.content.res.Configuration
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.yourcompany.android.bookhubapp.R
import com.yourcompany.android.bookhubapp.databinding.FragmentSearchBinding
import com.yourcompany.android.bookhubapp.ui.BookViewModel
import com.yourcompany.android.bookhubapp.ui.adapter.BooksAdapter
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class SearchFragment : Fragment() {

    private var binding: FragmentSearchBinding? = null
    private val searchBinding get() = binding!!
    private val bookCountKey = "bookCountKey"
    var searchTerm = ""
    var booksCount = 0
    private val bookViewModel: BookViewModel by sharedViewModel()
    private lateinit var booksAdapter: BooksAdapter
    private lateinit var layoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        layoutManager = LinearLayoutManager(requireContext())
        searchBinding.booksRecyclerView.layoutManager = layoutManager

        setTextChangedListener()
        onSearchBtnClicked()
        //  Call observeBooks() method
        observeBooks()


        val view = searchBinding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_items, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.searchHistory -> {
                goToSearchHistory()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun goToSearchHistory() {
        val directions = SearchFragmentDirections.actionSearchFragmentToSearchHistoryFragment()
        findNavController().navigate(directions)
    }


    private fun hideKeyboard(view: View) {
        val inputMethodManager = requireContext().getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun setTextChangedListener() {
        searchBinding.searchTermInputField.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun afterTextChanged(input: Editable?) {
                val text = input.toString()
                if (text.isNotEmpty()) {
                    searchTerm = text
                }
            }
        })
    }

    private fun onSearchBtnClicked() {
        with(searchBinding) {
            searchBtn.setOnClickListener {
                hideKeyboard(searchBinding.root)
                progressIndicator.visibility = View.VISIBLE
                bookViewModel.getBooks(searchTerm)
                // TODO 4
                bookViewModel.saveSearchTerm(searchTerm)

            }
        }
    }

    // Implement saving state in an instance state
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(bookCountKey, booksCount)
    }

    //  Implement restoring state from instance state
    private fun restoreCount(savedInstanceState: Bundle?) {
        // 1
        booksCount = savedInstanceState?.getInt(bookCountKey) ?: 0
        // 2
        searchBinding.bookCountTextView.text = booksCount.toString()
    }

    // Observe books LiveData instance
    private fun observeBooks() {
        bookViewModel.bookItems.observe(viewLifecycleOwner) { books ->
            with(searchBinding) {
                progressIndicator.visibility = View.GONE
                if (books != null) {
                    booksAdapter = BooksAdapter(books = books)
                    booksRecyclerView.adapter = booksAdapter
                }
            }
        }
    }
    // Implement onConfigurationChanged() method
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        context?.let {
            val colorPink = ContextCompat.getColor(it, R.color.pink)
            val colorOrange = ContextCompat.getColor(it, R.color.colorAccent)
            if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                searchBinding.searchBtn.setBackgroundColor(colorPink)
            } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
                searchBinding.searchBtn.setBackgroundColor(colorOrange)
            }
        }
    }
}
