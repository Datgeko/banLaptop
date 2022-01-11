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
public class Account {
     private String accountName;
    private int accountId;
    private String password;
    private String phone;
    private String productImage;
    private String email;
    private int address;
    private int bankInformation;
    private boolean isActive;

    public Account() {
    }

    public Account(String accountName, int accountId, String password, String phone, String productImage, String email, int address, int bankInformation, boolean isActive) {
        this.accountName = accountName;
        this.accountId = accountId;
        this.password = password;
        this.phone = phone;
        this.productImage = productImage;
        this.email = email;
        this.address = address;
        this.bankInformation = bankInformation;
        this.isActive = isActive;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getBankInformation() {
        return bankInformation;
    }

    public void setBankInformation(int bankInformation) {
        this.bankInformation = bankInformation;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Account{" + "accountName=" + accountName + ", accountId=" + accountId + ", password=" + password + ", phone=" + phone + ", productImage=" + productImage + ", email=" + email + ", address=" + address + ", bankInformation=" + bankInformation + ", isActive=" + isActive + '}';
    }
    
}
