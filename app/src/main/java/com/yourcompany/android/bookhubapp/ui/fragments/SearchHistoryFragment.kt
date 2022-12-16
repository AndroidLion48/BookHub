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

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.yourcompany.android.bookhubapp.databinding.FragmentSearchHistoryBinding
import com.yourcompany.android.bookhubapp.ui.BookViewModel
import com.yourcompany.android.bookhubapp.ui.adapter.SearchHistoryAdapter
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class SearchHistoryFragment : Fragment() {

    private var binding: FragmentSearchHistoryBinding? = null
    private val historyBinding get() = binding!!
    private val bookViewModel: BookViewModel by sharedViewModel()
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var searchAdapter: SearchHistoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchHistoryBinding.inflate(inflater, container, false)
        layoutManager = LinearLayoutManager(requireContext())
        historyBinding.historyRecycleView.layoutManager = layoutManager

        getSearchHistory()
        observeSearchHistory()

        val view = historyBinding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun observeSearchHistory() {
        bookViewModel.searchHistory.observe(viewLifecycleOwner) { searchHistory ->
            if (searchHistory.isEmpty()) {
                historyBinding.titleTextView.text = "No searches"
            } else {
                searchAdapter = SearchHistoryAdapter(
                    searchHistory,
                    clickListener = { term ->
                        historyBinding.progressIndicatorHistory.visibility = View.VISIBLE
                        bookViewModel.getBooks(term)
                        observeBooks()

                    }
                )
                historyBinding.historyRecycleView.adapter = searchAdapter
            }
        }
    }


    private fun goToMainScreen() {
        val directions = SearchHistoryFragmentDirections.actionSearchHistoryFragmentToSearchFragment()
        findNavController().navigate(directions)
    }

    // Call method to get search history
    private fun getSearchHistory() {
        bookViewModel.getUserSearches()
    }
    // Observe books result
    private fun observeBooks() {
        // Listens to changes in the bookItems LiveData object.
        bookViewModel.bookItems.observe(viewLifecycleOwner) { books ->
            with(historyBinding) {
                progressIndicatorHistory.visibility = View.GONE
                // Navigates to main screen to display the list of books fetched from the remote API.
                goToMainScreen()
            }
        }
    }

}
