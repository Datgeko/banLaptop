/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;




/**
 *
 * @author DatGeko
 */
public class Product {
    private String productName;
    private int productId;
    private int quantity;
    private float price;
    private String productImage;
    private int CategoryId;
    private int brandId;
    private int commentId;
    private Date sellDate;
    private boolean isActive;

    public Product() {
    }

    public Product(String productName, int productId, int quantity, float price, String productImage, int CategoryId, int brandId, int commentId, Date sellDate, boolean isActive) {
        this.productName = productName;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.productImage = productImage;
        this.CategoryId = CategoryId;
        this.brandId = brandId;
        this.commentId = commentId;
        this.sellDate = sellDate;
        this.isActive = isActive;
    }

   

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int CategoryId) {
        this.CategoryId = CategoryId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public Date getSellDate() {
        return sellDate;
    }

    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", productId=" + productId + ", quantity=" + quantity + ", price=" + price + ", productImage=" + productImage + ", CategoryId=" + CategoryId + ", brandId=" + brandId + ", commentId=" + commentId + ", sellDate=" + sellDate + ", isActive=" + isActive + '}';
    }

     
}
