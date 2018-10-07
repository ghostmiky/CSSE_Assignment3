package com.sql.csse.EntityManager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

    //defines that a class can be mapped to a table
    @Entity

    //The name of the Table
    @Table(name = "blacklist_constructor")

    public class BlacklistCon {


        @Id
        @Column(name = "cid")
        private int CID;

        @Column(name = "name")
        private String name;

        @Column(name = "site_id")
        private int site_id;

        @Column(name = "phone")
        private int phone;

        @Column(name = "reason")
        private String reason;

        public BlacklistCon(int CID, String name, int site_id, int phone, String reason) {
            this.CID = CID;
            this.name = name;
            this.site_id = site_id;
            this.phone = phone;
            this.reason = reason;
        }

        public int getCID() {
            return CID;
        }

        public void setCID(int CID) {
            this.CID = CID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSite_id() {
            return site_id;
        }

        public void setSite_id(int site_id) {
            this.site_id = site_id;
        }

        public int getPhone() {
            return phone;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }

