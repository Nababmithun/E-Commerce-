package com.aman.ecommerce.persistant;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.aman.ecommerce.data.model.Products;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDao_Impl implements ProductDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Products.Product> __insertionAdapterOfProduct;

  private final EntityDeletionOrUpdateAdapter<Products.Product> __deletionAdapterOfProduct;

  private final EntityDeletionOrUpdateAdapter<Products.Product> __updateAdapterOfProduct;

  public ProductDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProduct = new EntityInsertionAdapter<Products.Product>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `product` (`id`,`image`,`name`,`price`,`special`,`quantity`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Products.Product value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getImage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImage());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPrice());
        }
        if (value.getSpecial() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSpecial());
        }
        if (value.getQuantity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getQuantity());
        }
      }
    };
    this.__deletionAdapterOfProduct = new EntityDeletionOrUpdateAdapter<Products.Product>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `product` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Products.Product value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfProduct = new EntityDeletionOrUpdateAdapter<Products.Product>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `product` SET `id` = ?,`image` = ?,`name` = ?,`price` = ?,`special` = ?,`quantity` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Products.Product value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getImage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImage());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPrice());
        }
        if (value.getSpecial() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSpecial());
        }
        if (value.getQuantity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getQuantity());
        }
        if (value.getId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getId());
        }
      }
    };
  }

  @Override
  public void insertProduct(final Products.Product person) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfProduct.insert(person);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertMultipleProduct(final List<Products.Product> person) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfProduct.insert(person);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteProduct(final Products.Product person) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfProduct.handle(person);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateProduct(final Products.Product person) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfProduct.handle(person);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Products.Product getProduct(final String id) {
    final String _sql = "SELECT * FROM PRODUCT WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfSpecial = CursorUtil.getColumnIndexOrThrow(_cursor, "special");
      final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
      final Products.Product _result;
      if(_cursor.moveToFirst()) {
        _result = new Products.Product();
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        _result.setImage(_tmpImage);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result.setName(_tmpName);
        final String _tmpPrice;
        _tmpPrice = _cursor.getString(_cursorIndexOfPrice);
        _result.setPrice(_tmpPrice);
        final String _tmpSpecial;
        _tmpSpecial = _cursor.getString(_cursorIndexOfSpecial);
        _result.setSpecial(_tmpSpecial);
        final Integer _tmpQuantity;
        if (_cursor.isNull(_cursorIndexOfQuantity)) {
          _tmpQuantity = null;
        } else {
          _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
        }
        _result.setQuantity(_tmpQuantity);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Products.Product> getAllProducts() {
    final String _sql = "SELECT * FROM PRODUCT ORDER BY id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfSpecial = CursorUtil.getColumnIndexOrThrow(_cursor, "special");
      final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
      final List<Products.Product> _result = new ArrayList<Products.Product>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Products.Product _item;
        _item = new Products.Product();
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        _item.setImage(_tmpImage);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpPrice;
        _tmpPrice = _cursor.getString(_cursorIndexOfPrice);
        _item.setPrice(_tmpPrice);
        final String _tmpSpecial;
        _tmpSpecial = _cursor.getString(_cursorIndexOfSpecial);
        _item.setSpecial(_tmpSpecial);
        final Integer _tmpQuantity;
        if (_cursor.isNull(_cursorIndexOfQuantity)) {
          _tmpQuantity = null;
        } else {
          _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
        }
        _item.setQuantity(_tmpQuantity);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
