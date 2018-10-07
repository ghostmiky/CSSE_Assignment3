package com.sql.csse.EntityManager;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Payments")
public class Payment {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Payment_id")
    private int paymantId;

    @Column(name = "Account")
    @ElementCollection(targetClass = Account.class)
    private List<Account> accounts;

    @Column(name = "Payment_method")
    private String PaymentMethod;

    @Column(name = "Total_Amount")
    private float TotalAmount;

    public Payment(int paymantId, List<Account> accounts, String paymentMethod, float totalAmount) {
        this.paymantId = paymantId;
        this.accounts = accounts;
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

    public List<Account> getAccount() {
        return accounts;
    }

    public void setAccount(List<Account> account) {
        this.accounts = account;
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
