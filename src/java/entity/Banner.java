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
public class Banner {
     private String bannerName;
    private int bannerId;
    private String linkimage;
    private boolean isActive;

    public Banner() {
    }

    public Banner(String bannerName, int bannerId, String linkimage, boolean isActive) {
        this.bannerName = bannerName;
        this.bannerId = bannerId;
        this.linkimage = linkimage;
        this.isActive = isActive;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    public String getLinkimage() {
        return linkimage;
    }

    public void setLinkimage(String linkimage) {
        this.linkimage = linkimage;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Banner{" + "bannerName=" + bannerName + ", bannerId=" + bannerId + ", linkimage=" + linkimage + ", isActive=" + isActive + '}';
    }

   
    
}
