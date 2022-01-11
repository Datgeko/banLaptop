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
public class OrderTicketDetail {
     private int orderTicketDetail;
    private int orderTicketId;
    private int productId;
    private String productName;
    private int productQuantity;
    private float productPrice;
    private float totalPrice;

    public OrderTicketDetail() {
    }

    public OrderTicketDetail(int orderTicketDetail, int orderTicketId, int productId, String productName, int productQuantity, float productPrice, float totalPrice) {
        this.orderTicketDetail = orderTicketDetail;
        this.orderTicketId = orderTicketId;
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.totalPrice = totalPrice;
    }

    public int getOrderTicketDetail() {
        return orderTicketDetail;
    }

    public void setOrderTicketDetail(int orderTicketDetail) {
        this.orderTicketDetail = orderTicketDetail;
    }

    public int getOrderTicketId() {
        return orderTicketId;
    }

    public void setOrderTicketId(int orderTicketId) {
        this.orderTicketId = orderTicketId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "OrderTicketDetail{" + "orderTicketDetail=" + orderTicketDetail + ", orderTicketId=" + orderTicketId + ", productId=" + productId + ", productName=" + productName + ", productQuantity=" + productQuantity + ", productPrice=" + productPrice + ", totalPrice=" + totalPrice + '}';
    }
    
}
