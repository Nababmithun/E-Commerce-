package com.aman.ecommerce.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B%\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/aman/ecommerce/ui/adapter/ProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/aman/ecommerce/ui/adapter/ProductAdapter$ProductVH;", "results", "", "Lcom/aman/ecommerce/data/model/Products$Product;", "appDatabase", "Lcom/aman/ecommerce/persistant/AppDatabase;", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/List;Lcom/aman/ecommerce/persistant/AppDatabase;Ljava/util/concurrent/Executor;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProductVH", "app_debug"})
public final class ProductAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.aman.ecommerce.ui.adapter.ProductAdapter.ProductVH> {
    private final java.util.List<com.aman.ecommerce.data.model.Products.Product> results = null;
    private final com.aman.ecommerce.persistant.AppDatabase appDatabase = null;
    private final java.util.concurrent.Executor executor = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.aman.ecommerce.ui.adapter.ProductAdapter.ProductVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.aman.ecommerce.ui.adapter.ProductAdapter.ProductVH holder, int position) {
    }
    
    public ProductAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.aman.ecommerce.data.model.Products.Product> results, @org.jetbrains.annotations.NotNull()
    com.aman.ecommerce.persistant.AppDatabase appDatabase, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor executor) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/aman/ecommerce/ui/adapter/ProductAdapter$ProductVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "db", "Lcom/aman/ecommerce/persistant/AppDatabase;", "executor", "Ljava/util/concurrent/Executor;", "(Landroid/view/View;Lcom/aman/ecommerce/persistant/AppDatabase;Ljava/util/concurrent/Executor;)V", "bind", "", "result", "Lcom/aman/ecommerce/data/model/Products$Product;", "hideAddButton", "onClicks", "showAddButton", "updateView", "quantity", "", "app_debug"})
    public static final class ProductVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.view.View view = null;
        private final com.aman.ecommerce.persistant.AppDatabase db = null;
        private final java.util.concurrent.Executor executor = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.aman.ecommerce.data.model.Products.Product result) {
        }
        
        private final void onClicks(com.aman.ecommerce.data.model.Products.Product result) {
        }
        
        private final void updateView(int quantity) {
        }
        
        private final void showAddButton() {
        }
        
        private final void hideAddButton() {
        }
        
        public ProductVH(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.aman.ecommerce.persistant.AppDatabase db, @org.jetbrains.annotations.NotNull()
        java.util.concurrent.Executor executor) {
            super(null);
        }
    }
}