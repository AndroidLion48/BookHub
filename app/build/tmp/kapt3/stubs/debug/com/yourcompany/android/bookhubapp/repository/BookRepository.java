package com.yourcompany.android.bookhubapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/yourcompany/android/bookhubapp/repository/BookRepository;", "", "getBookInfo", "Lcom/yourcompany/android/bookhubapp/data/remote/models/BookInfo;", "searchTerm", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserSearches", "", "Lcom/yourcompany/android/bookhubapp/data/local/model/UserSearch;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSearchTerm", "", "app_debug"})
public abstract interface BookRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBookInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yourcompany.android.bookhubapp.data.remote.models.BookInfo> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveSearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserSearches(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.yourcompany.android.bookhubapp.data.local.model.UserSearch>> continuation);
}