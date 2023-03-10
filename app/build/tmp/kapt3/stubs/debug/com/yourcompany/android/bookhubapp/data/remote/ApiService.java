package com.yourcompany.android.bookhubapp.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/yourcompany/android/bookhubapp/data/remote/ApiService;", "", "getBooks", "Lcom/yourcompany/android/bookhubapp/data/remote/models/BookInfo;", "searchTerm", "", "items", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "volumes")
    public abstract java.lang.Object getBooks(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String searchTerm, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "items")
    java.lang.String items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yourcompany.android.bookhubapp.data.remote.models.BookInfo> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}