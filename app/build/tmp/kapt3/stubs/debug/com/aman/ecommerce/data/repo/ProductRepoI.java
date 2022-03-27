package com.aman.ecommerce.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/aman/ecommerce/data/repo/ProductRepoI;", "", "getLocalProductList", "Lio/reactivex/Single;", "", "Lcom/aman/ecommerce/data/model/Products$Product;", "database", "Lcom/aman/ecommerce/persistant/AppDatabase;", "getProductList", "Lcom/aman/ecommerce/data/model/Products;", "app_debug"})
public abstract interface ProductRepoI {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.aman.ecommerce.data.model.Products> getProductList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.aman.ecommerce.data.model.Products.Product>> getLocalProductList(@org.jetbrains.annotations.NotNull()
    com.aman.ecommerce.persistant.AppDatabase database);
}