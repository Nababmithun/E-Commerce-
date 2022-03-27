package com.aman.ecommerce.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001d\u0010\t\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/aman/ecommerce/data/model/Products;", "", "products", "", "Lcom/aman/ecommerce/data/model/Products$Product;", "(Ljava/util/List;)V", "getProducts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Product", "app_debug"})
public final class Products {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "products")
    private final java.util.List<com.aman.ecommerce.data.model.Products.Product> products = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.aman.ecommerce.data.model.Products.Product> getProducts() {
        return null;
    }
    
    public Products(@org.jetbrains.annotations.Nullable()
    java.util.List<com.aman.ecommerce.data.model.Products.Product> products) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.aman.ecommerce.data.model.Products.Product> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.aman.ecommerce.data.model.Products copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.aman.ecommerce.data.model.Products.Product> products) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlinx.android.parcel.Parcelize()
    @androidx.room.Entity(tableName = "product")
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u00a9\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0015\u0010\r\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010\u0018\u00010\u000e\u0012\u0015\u0010\u0011\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0016J\t\u00101\u001a\u00020\u0004H\u00c6\u0003J\u0018\u00102\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u000b\u0010<\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0018\u0010>\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010\u0018\u00010\u000eH\u00c6\u0003J\u00ce\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u0017\b\u0002\u0010\r\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010\u0018\u00010\u000e2\u0017\b\u0002\u0010\u0011\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0002\u0010@J\t\u0010A\u001a\u00020\nH\u00d6\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010E\u001a\u00020\nH\u00d6\u0001J\t\u0010F\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\nH\u00d6\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001cR%\u0010\r\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R \u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001cR%\u0010\u0011\u001a\u0011\u0012\u000b\u0012\t\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R \u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018R \u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001cR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0018R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0018\u00a8\u0006L"}, d2 = {"Lcom/aman/ecommerce/data/model/Products$Product;", "Landroid/os/Parcelable;", "()V", "id", "", "image", "name", "price", "special", "quantity", "", "description", "href", "images", "", "", "Lkotlinx/android/parcel/RawValue;", "options", "productId", "sku", "thumb", "zoomThumb", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getHref", "getId", "setId", "(Ljava/lang/String;)V", "getImage", "setImage", "getImages", "()Ljava/util/List;", "getName", "setName", "getOptions", "getPrice", "setPrice", "getProductId", "getQuantity", "()Ljava/lang/Integer;", "setQuantity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSku", "getSpecial", "setSpecial", "getThumb", "getZoomThumb", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/aman/ecommerce/data/model/Products$Product;", "describeContents", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class Product implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        @androidx.room.PrimaryKey()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.String id;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.ColumnInfo(name = "image")
        @com.google.gson.annotations.SerializedName(value = "image")
        private java.lang.String image;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.ColumnInfo(name = "name")
        @com.google.gson.annotations.SerializedName(value = "name")
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.ColumnInfo(name = "price")
        @com.google.gson.annotations.SerializedName(value = "price")
        private java.lang.String price;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.ColumnInfo(name = "special")
        @com.google.gson.annotations.SerializedName(value = "special")
        private java.lang.String special;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.ColumnInfo(name = "quantity")
        @com.google.gson.annotations.SerializedName(value = "quantity")
        private java.lang.Integer quantity;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Ignore()
        @com.google.gson.annotations.SerializedName(value = "description")
        private final java.lang.String description = null;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Ignore()
        @com.google.gson.annotations.SerializedName(value = "href")
        private final java.lang.String href = null;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Ignore()
        @com.google.gson.annotations.SerializedName(value = "images")
        private final java.util.List<java.lang.Object> images = null;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Ignore()
        @com.google.gson.annotations.SerializedName(value = "options")
        private final java.util.List<java.lang.Object> options = null;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Ignore()
        @com.google.gson.annotations.SerializedName(value = "product_id")
        private final java.lang.String productId = null;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Ignore()
        @com.google.gson.annotations.SerializedName(value = "sku")
        private final java.lang.String sku = null;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Ignore()
        @com.google.gson.annotations.SerializedName(value = "thumb")
        private final java.lang.String thumb = null;
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Ignore()
        @com.google.gson.annotations.SerializedName(value = "zoom_thumb")
        private final java.lang.String zoomThumb = null;
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImage() {
            return null;
        }
        
        public final void setImage(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPrice() {
            return null;
        }
        
        public final void setPrice(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSpecial() {
            return null;
        }
        
        public final void setSpecial(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getQuantity() {
            return null;
        }
        
        public final void setQuantity(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getHref() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.Object> getImages() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.Object> getOptions() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getProductId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSku() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getThumb() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getZoomThumb() {
            return null;
        }
        
        public Product(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String image, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String price, @org.jetbrains.annotations.Nullable()
        java.lang.String special, @org.jetbrains.annotations.Nullable()
        java.lang.Integer quantity, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String href, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends java.lang.Object> images, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends java.lang.Object> options, @org.jetbrains.annotations.Nullable()
        java.lang.String productId, @org.jetbrains.annotations.Nullable()
        java.lang.String sku, @org.jetbrains.annotations.Nullable()
        java.lang.String thumb, @org.jetbrains.annotations.Nullable()
        java.lang.String zoomThumb) {
            super();
        }
        
        public Product() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.Object> component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.Object> component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.aman.ecommerce.data.model.Products.Product copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String image, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String price, @org.jetbrains.annotations.Nullable()
        java.lang.String special, @org.jetbrains.annotations.Nullable()
        java.lang.Integer quantity, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String href, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends java.lang.Object> images, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends java.lang.Object> options, @org.jetbrains.annotations.Nullable()
        java.lang.String productId, @org.jetbrains.annotations.Nullable()
        java.lang.String sku, @org.jetbrains.annotations.Nullable()
        java.lang.String thumb, @org.jetbrains.annotations.Nullable()
        java.lang.String zoomThumb) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Object[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
}