package com.sql.csse.EntityManager;

import javax.persistence.*;

//defines that a class can be mapped to a table
@Entity

//name of the table
@Table(name ="blacklist_supplier")

public class BlacklistSup {


        @Id
        @Column(name = "Supplier_ID")
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

        @Column(name = "reason")
        private String reason;


        public BlacklistSup(String supplierName, Long bankAccNumber, String address, String email, String phoneNumber, String reason) {


            this.SupplierName = supplierName;
            this.BankAccNumber = bankAccNumber;
            this.Address = address;
            this.Email = email;
            this.phoneNumber = phoneNumber;
            this.reason=reason;

        }

        public BlacklistSup() {
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

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }
