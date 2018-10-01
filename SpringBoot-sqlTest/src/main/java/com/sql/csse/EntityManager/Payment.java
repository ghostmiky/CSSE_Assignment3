package com.sql.csse.EntityManager;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Payments")
public class Payment {


    private int paymantId;

    private Account account;

    private String PaymentMethod;

    private float TotalAmount;

    public Payment(int paymantId, Account account, String paymentMethod, float totalAmount) {
        this.paymantId = paymantId;
        this.account = account;
        this.PaymentMethod = paymentMethod;
        this.TotalAmount = totalAmount;
    }

    public Payment() {
    }

    public int getPaymantId() {
        return paymantId;
    }

    public void setPaymantId(int paymantId) {
        this.paymantId = paymantId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.PaymentMethod = paymentMethod;
    }

    public float getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.TotalAmount = totalAmount;
    }

    public void makepayment(){}
}
