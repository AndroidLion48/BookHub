package com.yourcompany.android.bookhubapp.data.local.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/yourcompany/android/bookhubapp/data/local/dao/UserSearchDao;", "", "getUserSearches", "", "Lcom/yourcompany/android/bookhubapp/data/local/model/UserSearch;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSearchTerm", "", "userSearch", "(Lcom/yourcompany/android/bookhubapp/data/local/model/UserSearch;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserSearchDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object saveSearchTerm(@org.jetbrains.annotations.NotNull()
    com.yourcompany.android.bookhubapp.data.local.model.UserSearch userSearch, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM user_searches")
    public abstract java.lang.Object getUserSearches(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.yourcompany.android.bookhubapp.data.local.model.UserSearch>> continuation);
}