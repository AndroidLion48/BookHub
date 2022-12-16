package com.yourcompany.android.bookhubapp.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yourcompany.android.bookhubapp.data.local.model.UserSearch;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserSearchDao_Impl implements UserSearchDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserSearch> __insertionAdapterOfUserSearch;

  public UserSearchDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserSearch = new EntityInsertionAdapter<UserSearch>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user_searches` (`id`,`searchTerm`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserSearch value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getSearchTerm() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSearchTerm());
        }
      }
    };
  }

  @Override
  public Object saveSearchTerm(final UserSearch userSearch,
      final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfUserSearch.insertAndReturnId(userSearch);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getUserSearches(final Continuation<? super List<UserSearch>> continuation) {
    final String _sql = "SELECT * FROM user_searches";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<UserSearch>>() {
      @Override
      public List<UserSearch> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSearchTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "searchTerm");
          final List<UserSearch> _result = new ArrayList<UserSearch>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserSearch _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpSearchTerm;
            if (_cursor.isNull(_cursorIndexOfSearchTerm)) {
              _tmpSearchTerm = null;
            } else {
              _tmpSearchTerm = _cursor.getString(_cursorIndexOfSearchTerm);
            }
            _item = new UserSearch(_tmpId,_tmpSearchTerm);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
