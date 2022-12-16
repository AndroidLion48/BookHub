// Generated by view binder compiler. Do not edit!
package com.yourcompany.android.bookhubapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yourcompany.android.bookhubapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BookItemLayoutBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView authorTextView;

  @NonNull
  public final ImageView bookImageView;

  @NonNull
  public final TextView bookTitleTextView;

  @NonNull
  public final TextView pageCountTextView;

  @NonNull
  public final TextView publishingInfoTextView;

  private BookItemLayoutBinding(@NonNull CardView rootView, @NonNull TextView authorTextView,
      @NonNull ImageView bookImageView, @NonNull TextView bookTitleTextView,
      @NonNull TextView pageCountTextView, @NonNull TextView publishingInfoTextView) {
    this.rootView = rootView;
    this.authorTextView = authorTextView;
    this.bookImageView = bookImageView;
    this.bookTitleTextView = bookTitleTextView;
    this.pageCountTextView = pageCountTextView;
    this.publishingInfoTextView = publishingInfoTextView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static BookItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BookItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.book_item_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BookItemLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.authorTextView;
      TextView authorTextView = ViewBindings.findChildViewById(rootView, id);
      if (authorTextView == null) {
        break missingId;
      }

      id = R.id.bookImageView;
      ImageView bookImageView = ViewBindings.findChildViewById(rootView, id);
      if (bookImageView == null) {
        break missingId;
      }

      id = R.id.bookTitleTextView;
      TextView bookTitleTextView = ViewBindings.findChildViewById(rootView, id);
      if (bookTitleTextView == null) {
        break missingId;
      }

      id = R.id.pageCountTextView;
      TextView pageCountTextView = ViewBindings.findChildViewById(rootView, id);
      if (pageCountTextView == null) {
        break missingId;
      }

      id = R.id.publishingInfoTextView;
      TextView publishingInfoTextView = ViewBindings.findChildViewById(rootView, id);
      if (publishingInfoTextView == null) {
        break missingId;
      }

      return new BookItemLayoutBinding((CardView) rootView, authorTextView, bookImageView,
          bookTitleTextView, pageCountTextView, publishingInfoTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}