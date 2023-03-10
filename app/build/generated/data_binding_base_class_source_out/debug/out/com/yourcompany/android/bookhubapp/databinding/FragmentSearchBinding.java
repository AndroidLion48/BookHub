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
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.yourcompany.android.bookhubapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView bookCountTextView;

  @NonNull
  public final RecyclerView booksRecyclerView;

  @NonNull
  public final TextView labelTextView;

  @NonNull
  public final CircularProgressIndicator progressIndicator;

  @NonNull
  public final MaterialButton searchBtn;

  @NonNull
  public final ConstraintLayout searchInputLayout;

  @NonNull
  public final TextInputEditText searchTermInputField;

  @NonNull
  public final TextInputLayout searchTil;

  private FragmentSearchBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView bookCountTextView, @NonNull RecyclerView booksRecyclerView,
      @NonNull TextView labelTextView, @NonNull CircularProgressIndicator progressIndicator,
      @NonNull MaterialButton searchBtn, @NonNull ConstraintLayout searchInputLayout,
      @NonNull TextInputEditText searchTermInputField, @NonNull TextInputLayout searchTil) {
    this.rootView = rootView;
    this.bookCountTextView = bookCountTextView;
    this.booksRecyclerView = booksRecyclerView;
    this.labelTextView = labelTextView;
    this.progressIndicator = progressIndicator;
    this.searchBtn = searchBtn;
    this.searchInputLayout = searchInputLayout;
    this.searchTermInputField = searchTermInputField;
    this.searchTil = searchTil;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bookCountTextView;
      TextView bookCountTextView = ViewBindings.findChildViewById(rootView, id);
      if (bookCountTextView == null) {
        break missingId;
      }

      id = R.id.booksRecyclerView;
      RecyclerView booksRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (booksRecyclerView == null) {
        break missingId;
      }

      id = R.id.labelTextView;
      TextView labelTextView = ViewBindings.findChildViewById(rootView, id);
      if (labelTextView == null) {
        break missingId;
      }

      id = R.id.progressIndicator;
      CircularProgressIndicator progressIndicator = ViewBindings.findChildViewById(rootView, id);
      if (progressIndicator == null) {
        break missingId;
      }

      id = R.id.searchBtn;
      MaterialButton searchBtn = ViewBindings.findChildViewById(rootView, id);
      if (searchBtn == null) {
        break missingId;
      }

      id = R.id.searchInputLayout;
      ConstraintLayout searchInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (searchInputLayout == null) {
        break missingId;
      }

      id = R.id.searchTermInputField;
      TextInputEditText searchTermInputField = ViewBindings.findChildViewById(rootView, id);
      if (searchTermInputField == null) {
        break missingId;
      }

      id = R.id.searchTil;
      TextInputLayout searchTil = ViewBindings.findChildViewById(rootView, id);
      if (searchTil == null) {
        break missingId;
      }

      return new FragmentSearchBinding((ConstraintLayout) rootView, bookCountTextView,
          booksRecyclerView, labelTextView, progressIndicator, searchBtn, searchInputLayout,
          searchTermInputField, searchTil);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
