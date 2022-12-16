package com.yourcompany.android.bookhubapp.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.yourcompany.android.bookhubapp.R

public class SearchFragmentDirections private constructor() {
  public companion object {
    public fun actionSearchFragmentToSearchHistoryFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_searchFragment_to_searchHistoryFragment)
  }
}
