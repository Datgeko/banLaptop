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
public class Cart {
     private int cartName;
    private int accountId;
    private int productId;
    private int productQuantity;
    private float productPrice;

    public Cart() {
    }

    public Cart(int cartName, int accountId, int productId, int productQuantity, float productPrice) {
        this.cartName = cartName;
        this.accountId = accountId;
        this.productId = productId;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public int getCartName() {
        return cartName;
    }

    public void setCartName(int cartName) {
        this.cartName = cartName;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Cart{" + "cartName=" + cartName + ", accountId=" + accountId + ", productId=" + productId + ", productQuantity=" + productQuantity + ", productPrice=" + productPrice + '}';
    }
    
    

}
