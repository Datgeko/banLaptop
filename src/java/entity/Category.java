/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author DatGeko
 */
public class Category {
     private String categoryName;
    private int categoryId;
    private boolean isActive;

    public Category() {
    }

    public Category(String categoryName, int categoryId, boolean isActive) {
        this.categoryName = categoryName;
        this.categoryId = categoryId;
        this.isActive = isActive;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Category{" + "categoryName=" + categoryName + ", categoryId=" + categoryId + ", isActive=" + isActive + '}';
    }
    
}
