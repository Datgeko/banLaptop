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
public class OrderTicket {
    
    private int orderTicketId;
    private int accountId;
    private Date createDate;
    private String paymentType;
    private int accountPhone;
    private int accountAddress;
    private int accountBankInformation;
    private float totalPrice;

    public OrderTicket() {
    }

    public OrderTicket(int orderTicketId, int accountId, Date createDate, String paymentType, int accountPhone, int accountAddress, int accountBankInformation, float totalPrice) {
        this.orderTicketId = orderTicketId;
        this.accountId = accountId;
        this.createDate = createDate;
        this.paymentType = paymentType;
        this.accountPhone = accountPhone;
        this.accountAddress = accountAddress;
        this.accountBankInformation = accountBankInformation;
        this.totalPrice = totalPrice;
    }

    public int getOrderTicketId() {
        return orderTicketId;
    }

    public void setOrderTicketId(int orderTicketId) {
        this.orderTicketId = orderTicketId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getAccountPhone() {
        return accountPhone;
    }

    public void setAccountPhone(int accountPhone) {
        this.accountPhone = accountPhone;
    }

    public int getAccountAddress() {
        return accountAddress;
    }

    public void setAccountAddress(int accountAddress) {
        this.accountAddress = accountAddress;
    }

    public int getAccountBankInformation() {
        return accountBankInformation;
    }

    public void setAccountBankInformation(int accountBankInformation) {
        this.accountBankInformation = accountBankInformation;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "OrderTicket{" + "orderTicketId=" + orderTicketId + ", accountId=" + accountId + ", createDate=" + createDate + ", paymentType=" + paymentType + ", accountPhone=" + accountPhone + ", accountAddress=" + accountAddress + ", accountBankInformation=" + accountBankInformation + ", totalPrice=" + totalPrice + '}';
    }
    

}
