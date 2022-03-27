package com.aman.ecommerce.ui.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\fH\u0014J\b\u0010\u0014\u001a\u00020\fH\u0002J\u0016\u0010\u0015\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0003J\b\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\fH\u0002J\u0012\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/aman/ecommerce/ui/cart/CartActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "executor", "Ljava/util/concurrent/Executor;", "mDB", "Lcom/aman/ecommerce/persistant/AppDatabase;", "productRepo", "Lcom/aman/ecommerce/data/repo/ProductRepo;", "viewModel", "Lcom/aman/ecommerce/ui/cart/CartViewModel;", "hideLoading", "", "init", "loadProducts", "onClicks", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setObserver", "setProductRecyclerView", "products", "", "Lcom/aman/ecommerce/data/model/Products$Product;", "showError", "showLoading", "updateView", "state", "Lcom/aman/ecommerce/ui/cart/CartState;", "Companion", "app_debug"})
public final class CartActivity extends androidx.appcompat.app.AppCompatActivity {
    private final com.aman.ecommerce.data.repo.ProductRepo productRepo = null;
    private com.aman.ecommerce.ui.cart.CartViewModel viewModel;
    private com.aman.ecommerce.persistant.AppDatabase mDB;
    private java.util.concurrent.Executor executor;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "CartActivity";
    public static final com.aman.ecommerce.ui.cart.CartActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void setObserver() {
    }
    
    private final void loadProducts() {
    }
    
    private final void onClicks() {
    }
    
    private final void updateView(com.aman.ecommerce.ui.cart.CartState state) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void setProductRecyclerView(java.util.List<com.aman.ecommerce.data.model.Products.Product> products) {
    }
    
    private final void showError() {
    }
    
    private final void showLoading() {
    }
    
    private final void hideLoading() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public CartActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/aman/ecommerce/ui/cart/CartActivity$Companion;", "", "()V", "TAG", "", "start", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}