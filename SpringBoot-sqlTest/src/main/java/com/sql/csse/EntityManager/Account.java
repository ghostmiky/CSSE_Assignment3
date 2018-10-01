package com.sql.csse.EntityManager;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Accounts")
public class Account {

    private int accountNo;

    private String Bank;

    public Account(int accountNo, String bank) {
        this.accountNo = accountNo;
        this.Bank = bank;
    }

    public Account() {
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        this.Bank = bank;
    }
}
