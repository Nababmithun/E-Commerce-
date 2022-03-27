package com.aman.ecommerce.persistant;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\'J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\'J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/aman/ecommerce/persistant/ProductDao;", "", "deleteProduct", "", "person", "Lcom/aman/ecommerce/data/model/Products$Product;", "getAllProducts", "", "getProduct", "id", "", "insertMultipleProduct", "insertProduct", "updateProduct", "app_debug"})
public abstract interface ProductDao {
    
    @androidx.room.Insert()
    public abstract void insertProduct(@org.jetbrains.annotations.NotNull()
    com.aman.ecommerce.data.model.Products.Product person);
    
    @androidx.room.Insert()
    public abstract void insertMultipleProduct(@org.jetbrains.annotations.NotNull()
    java.util.List<com.aman.ecommerce.data.model.Products.Product> person);
    
    @androidx.room.Update()
    public abstract void updateProduct(@org.jetbrains.annotations.NotNull()
    com.aman.ecommerce.data.model.Products.Product person);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM PRODUCT WHERE id = :id")
    public abstract com.aman.ecommerce.data.model.Products.Product getProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM PRODUCT ORDER BY id")
    public abstract java.util.List<com.aman.ecommerce.data.model.Products.Product> getAllProducts();
    
    @androidx.room.Delete()
    public abstract void deleteProduct(@org.jetbrains.annotations.NotNull()
    com.aman.ecommerce.data.model.Products.Product person);
}