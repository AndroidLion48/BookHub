package com.yourcompany.android.bookhubapp.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020 H\u0002J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\'H\u0016J\u0012\u0010(\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0018\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J&\u00100\u001a\u0004\u0018\u00010#2\u0006\u0010.\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00104\u001a\u00020 H\u0016J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020*H\u0016J\b\u0010;\u001a\u00020 H\u0002J\u0012\u0010<\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\b\u0010=\u001a\u00020 H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006>"}, d2 = {"Lcom/yourcompany/android/bookhubapp/ui/fragments/SearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/yourcompany/android/bookhubapp/databinding/FragmentSearchBinding;", "bookCountKey", "", "bookViewModel", "Lcom/yourcompany/android/bookhubapp/ui/BookViewModel;", "getBookViewModel", "()Lcom/yourcompany/android/bookhubapp/ui/BookViewModel;", "bookViewModel$delegate", "Lkotlin/Lazy;", "booksAdapter", "Lcom/yourcompany/android/bookhubapp/ui/adapter/BooksAdapter;", "booksCount", "", "getBooksCount", "()I", "setBooksCount", "(I)V", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "searchBinding", "getSearchBinding", "()Lcom/yourcompany/android/bookhubapp/databinding/FragmentSearchBinding;", "searchTerm", "getSearchTerm", "()Ljava/lang/String;", "setSearchTerm", "(Ljava/lang/String;)V", "goToSearchHistory", "", "hideKeyboard", "view", "Landroid/view/View;", "observeBooks", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onSaveInstanceState", "outState", "onSearchBtnClicked", "restoreCount", "setTextChangedListener", "app_debug"})
public final class SearchFragment extends androidx.fragment.app.Fragment {
    private com.yourcompany.android.bookhubapp.databinding.FragmentSearchBinding binding;
    private final java.lang.String bookCountKey = "bookCountKey";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String searchTerm = "";
    private int booksCount = 0;
    private final kotlin.Lazy bookViewModel$delegate = null;
    private com.yourcompany.android.bookhubapp.ui.adapter.BooksAdapter booksAdapter;
    private androidx.recyclerview.widget.LinearLayoutManager layoutManager;
    
    public SearchFragment() {
        super();
    }
    
    private final com.yourcompany.android.bookhubapp.databinding.FragmentSearchBinding getSearchBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchTerm() {
        return null;
    }
    
    public final void setSearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getBooksCount() {
        return 0;
    }
    
    public final void setBooksCount(int p0) {
    }
    
    private final com.yourcompany.android.bookhubapp.ui.BookViewModel getBookViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void goToSearchHistory() {
    }
    
    private final void hideKeyboard(android.view.View view) {
    }
    
    private final void setTextChangedListener() {
    }
    
    private final void onSearchBtnClicked() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void restoreCount(android.os.Bundle savedInstanceState) {
    }
    
    private final void observeBooks() {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
}