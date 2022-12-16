package com.yourcompany.android.bookhubapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/yourcompany/android/bookhubapp/ui/BookViewModel;", "Landroidx/lifecycle/ViewModel;", "bookRepository", "Lcom/yourcompany/android/bookhubapp/repository/BookRepository;", "(Lcom/yourcompany/android/bookhubapp/repository/BookRepository;)V", "bookItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/yourcompany/android/bookhubapp/data/remote/models/Item;", "getBookItems", "()Landroidx/lifecycle/MutableLiveData;", "items", "searchHistory", "Lcom/yourcompany/android/bookhubapp/data/local/model/UserSearch;", "getSearchHistory", "userSearches", "getBooks", "", "searchTerm", "", "getUserSearches", "saveSearchTerm", "app_debug"})
public final class BookViewModel extends androidx.lifecycle.ViewModel {
    private final com.yourcompany.android.bookhubapp.repository.BookRepository bookRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.yourcompany.android.bookhubapp.data.local.model.UserSearch>> userSearches = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.yourcompany.android.bookhubapp.data.remote.models.Item>> items = null;
    
    public BookViewModel(@org.jetbrains.annotations.NotNull()
    com.yourcompany.android.bookhubapp.repository.BookRepository bookRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.yourcompany.android.bookhubapp.data.local.model.UserSearch>> getSearchHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.yourcompany.android.bookhubapp.data.remote.models.Item>> getBookItems() {
        return null;
    }
    
    public final void getBooks(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm) {
    }
    
    public final void saveSearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm) {
    }
    
    public final void getUserSearches() {
    }
}