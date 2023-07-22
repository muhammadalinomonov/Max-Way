package uz.gita.my_max_way_uz.data.source.local.room.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FoodDao_Impl implements FoodDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FoodEntity> __insertionAdapterOfFoodEntity;

  private final EntityDeletionOrUpdateAdapter<FoodEntity> __deletionAdapterOfFoodEntity;

  private final EntityDeletionOrUpdateAdapter<FoodEntity> __updateAdapterOfFoodEntity;

  private final SharedSQLiteStatement __preparedStmtOfClearTable;

  public FoodDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFoodEntity = new EntityInsertionAdapter<FoodEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `foods` (`id`,`name`,`price`,`count`,`description`,`imageUrl`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FoodEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getPrice());
        stmt.bindLong(4, value.getCount());
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImageUrl());
        }
      }
    };
    this.__deletionAdapterOfFoodEntity = new EntityDeletionOrUpdateAdapter<FoodEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `foods` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FoodEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfFoodEntity = new EntityDeletionOrUpdateAdapter<FoodEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `foods` SET `id` = ?,`name` = ?,`price` = ?,`count` = ?,`description` = ?,`imageUrl` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FoodEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getPrice());
        stmt.bindLong(4, value.getCount());
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImageUrl());
        }
        stmt.bindLong(7, value.getId());
      }
    };
    this.__preparedStmtOfClearTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE  FROM foods";
        return _query;
      }
    };
  }

  @Override
  public void insertFood(final FoodEntity foodEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFoodEntity.insert(foodEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteFood(final FoodEntity foodEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfFoodEntity.handle(foodEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateFood(final FoodEntity foodEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfFoodEntity.handle(foodEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clearTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearTable.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearTable.release(_stmt);
    }
  }

  @Override
  public Flow<List<FoodEntity>> getFoods() {
    final String _sql = "SELECT * FROM foods";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"foods"}, new Callable<List<FoodEntity>>() {
      @Override
      public List<FoodEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final List<FoodEntity> _result = new ArrayList<FoodEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FoodEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final long _tmpPrice;
            _tmpPrice = _cursor.getLong(_cursorIndexOfPrice);
            final int _tmpCount;
            _tmpCount = _cursor.getInt(_cursorIndexOfCount);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            _item = new FoodEntity(_tmpId,_tmpName,_tmpPrice,_tmpCount,_tmpDescription,_tmpImageUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<FoodEntity> checkFood(final String name, final int count) {
    final String _sql = "SELECT * FROM foods where name = ? AND count = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, count);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"foods"}, new Callable<FoodEntity>() {
      @Override
      public FoodEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final FoodEntity _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final long _tmpPrice;
            _tmpPrice = _cursor.getLong(_cursorIndexOfPrice);
            final int _tmpCount;
            _tmpCount = _cursor.getInt(_cursorIndexOfCount);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            _result = new FoodEntity(_tmpId,_tmpName,_tmpPrice,_tmpCount,_tmpDescription,_tmpImageUrl);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
