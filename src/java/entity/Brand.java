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
public class Brand {
     private String brandName;
    private int brandId;
    private boolean isActive;

    public Brand(String brandName, int brandId, boolean isActive) {
        this.brandName = brandName;
        this.brandId = brandId;
        this.isActive = isActive;
    }

    public Brand() {
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Brand{" + "brandName=" + brandName + ", brandId=" + brandId + ", isActive=" + isActive + '}';
    }
    
}
