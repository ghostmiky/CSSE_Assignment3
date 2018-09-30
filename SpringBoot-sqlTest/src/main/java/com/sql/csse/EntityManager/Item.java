/*
* This Entity manages the Item Class
* Author : It16153028
*
* */


package com.sql.csse.EntityManager;

import javax.persistence.*;

@Entity
@Table(name = "Items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Item_Id")
    private int IId;


    @Column(name = "Item_Name")
    private String ItemName;

    @Column(name = "catagory_Name")
    private String CatagoryName;

    @Column(name = "price")
    private float price;

    @Column(name = "DelivaryInfo")
    private String DelivaryInfo;

    public Item(String itemName, String catagoryName, float price, String delivaryInfo, boolean isRestricted) {
        ItemName = itemName;
        CatagoryName = catagoryName;
        this.price = price;
        DelivaryInfo = delivaryInfo;
        this.isRestricted = isRestricted;
    }

    public Item() {
    }

    public int getIId() {
        return IId;
    }

    public void setIId(int IId) {
        this.IId = IId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getCatagoryName() {
        return CatagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        CatagoryName = catagoryName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDelivaryInfo() {
        return DelivaryInfo;
    }

    public void setDelivaryInfo(String delivaryInfo) {
        DelivaryInfo = delivaryInfo;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public void setRestricted(boolean restricted) {
        isRestricted = restricted;
    }

    @Column(name = "isRestricted")
    private boolean isRestricted;




}
