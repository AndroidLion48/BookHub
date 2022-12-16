// Generated by view binder compiler. Do not edit!
package com.yourcompany.android.bookhubapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class SearchHistoryItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView historyItemTextView;

  @NonNull
  public final CardView itemCardView;

  private SearchHistoryItemBinding(@NonNull CardView rootView,
      @NonNull TextView historyItemTextView, @NonNull CardView itemCardView) {
    this.rootView = rootView;
    this.historyItemTextView = historyItemTextView;
    this.itemCardView = itemCardView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static SearchHistoryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SearchHistoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.search_history_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SearchHistoryItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.historyItemTextView;
      TextView historyItemTextView = ViewBindings.findChildViewById(rootView, id);
      if (historyItemTextView == null) {
        break missingId;
      }

      CardView itemCardView = (CardView) rootView;

      return new SearchHistoryItemBinding((CardView) rootView, historyItemTextView, itemCardView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}