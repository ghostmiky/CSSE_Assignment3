package com.sql.csse.EntityManager;
/*
* This Entity Manages the Supplier Class
* Author : It16153028
*
* */


import javax.persistence.*;
import java.util.List;

//Declares that this class is a entity class
@Entity
//Specify the name of the table name to be created in the database
@Table(name ="supplier")
public class Supplier {

    @Id
    @Column(name = "Supplier_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int SupplierID;


    @Column(name = "Supplier_Name")
    private String SupplierName;

    @Column(name = "Bank_Acc_number")
    private Long BankAccNumber;

    @Column(name = "Address")
    private String Address;

    @Column(name = "Email")
    private String Email;

    @Column(name = "phone")
    private String phoneNumber;

    @Column(name = "Items")
    @ElementCollection(targetClass=Item.class)
    private List<Item> items;

    @Column(name = "Availability")
    private boolean availability;

    public Supplier(String supplierName, Long bankAccNumber, String address, String email, String phoneNumber, List<Item> items, boolean availability) {


        this.SupplierName = supplierName;
        this.BankAccNumber = bankAccNumber;
        this.Address = address;
        this.Email = email;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.availability = availability;
    }

    public Supplier() {
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        this.SupplierID = supplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String supplierName) {
        this.SupplierName = supplierName;
    }

    public Long getBankAccNumber() {
        return BankAccNumber;
    }

    public void setBankAccNumber(Long bankAccNumber) {
        this.BankAccNumber = bankAccNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }




}
