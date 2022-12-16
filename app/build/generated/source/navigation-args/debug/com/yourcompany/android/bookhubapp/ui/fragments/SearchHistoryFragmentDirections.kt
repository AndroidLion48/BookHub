package com.yourcompany.android.bookhubapp.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.yourcompany.android.bookhubapp.R

public class SearchHistoryFragmentDirections private constructor() {
  public companion object {
    public fun actionSearchHistoryFragmentToSearchFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_searchHistoryFragment_to_searchFragment)
  }
}
