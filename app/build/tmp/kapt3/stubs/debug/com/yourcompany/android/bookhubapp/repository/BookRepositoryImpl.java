package com.yourcompany.android.bookhubapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/yourcompany/android/bookhubapp/repository/BookRepositoryImpl;", "Lcom/yourcompany/android/bookhubapp/repository/BookRepository;", "apiService", "Lcom/yourcompany/android/bookhubapp/data/remote/ApiService;", "dao", "Lcom/yourcompany/android/bookhubapp/data/local/dao/UserSearchDao;", "(Lcom/yourcompany/android/bookhubapp/data/remote/ApiService;Lcom/yourcompany/android/bookhubapp/data/local/dao/UserSearchDao;)V", "TAG", "", "getBookInfo", "Lcom/yourcompany/android/bookhubapp/data/remote/models/BookInfo;", "searchTerm", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserSearches", "", "Lcom/yourcompany/android/bookhubapp/data/local/model/UserSearch;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSearchTerm", "", "app_debug"})
public final class BookRepositoryImpl implements com.yourcompany.android.bookhubapp.repository.BookRepository {
    private final com.yourcompany.android.bookhubapp.data.remote.ApiService apiService = null;
    private final com.yourcompany.android.bookhubapp.data.local.dao.UserSearchDao dao = null;
    private final java.lang.String TAG = "BookRepositoryImpl";
    
    public BookRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.yourcompany.android.bookhubapp.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.yourcompany.android.bookhubapp.data.local.dao.UserSearchDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getBookInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yourcompany.android.bookhubapp.data.remote.models.BookInfo> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveSearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserSearches(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.yourcompany.android.bookhubapp.data.local.model.UserSearch>> continuation) {
        return null;
    }
}