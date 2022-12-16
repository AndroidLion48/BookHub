// Generated by view binder compiler. Do not edit!
package com.yourcompany.android.bookhubapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.yourcompany.android.bookhubapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchHistoryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView historyRecycleView;

  @NonNull
  public final CircularProgressIndicator progressIndicatorHistory;

  @NonNull
  public final TextView titleTextView;

  private FragmentSearchHistoryBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView historyRecycleView,
      @NonNull CircularProgressIndicator progressIndicatorHistory,
      @NonNull TextView titleTextView) {
    this.rootView = rootView;
    this.historyRecycleView = historyRecycleView;
    this.progressIndicatorHistory = progressIndicatorHistory;
    this.titleTextView = titleTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.historyRecycleView;
      RecyclerView historyRecycleView = ViewBindings.findChildViewById(rootView, id);
      if (historyRecycleView == null) {
        break missingId;
      }

      id = R.id.progressIndicatorHistory;
      CircularProgressIndicator progressIndicatorHistory = ViewBindings.findChildViewById(rootView, id);
      if (progressIndicatorHistory == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      TextView titleTextView = ViewBindings.findChildViewById(rootView, id);
      if (titleTextView == null) {
        break missingId;
      }

      return new FragmentSearchHistoryBinding((ConstraintLayout) rootView, historyRecycleView,
          progressIndicatorHistory, titleTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
