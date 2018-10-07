package com.sql.csse.EntityManager;


import javax.persistence.*;

//defines that a class can be mapped to a table
@Entity

//Name of the table
@Table(name="Sites")
public class Site {

    @Id
    //ID is auto generated
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "SiteID")
    private int SiteID;

    @Column(name="SiteName")
    private String SiteName;

    @Column(name="Address")
    private String Address;


    @Column(name="StorageCapacity")
    private float storageCap;

    @Column(name="CurrentCapacity")
    private float currentCap;

    @Column(name="ManagerId")
    private String ManagerId;


    public Site(String siteName, String address, float storageCap, float currentCap, String ManagerId) {
        this.SiteName = siteName;
        this.Address = address;
        this.storageCap = storageCap;
        this.currentCap = currentCap;
        this.ManagerId=ManagerId;

    }

    public Site(){

    }


    public int getSiteID() {

        return SiteID;
    }

    public void setSiteID(int siteID) {

        SiteID = siteID;
    }

    public String getSiteName() {

        return SiteName;
    }

    public void setSiteName(String siteName) {

        SiteName = siteName;
    }

    public String getAddress() {

        return Address;
    }


    public void setAddress(String address) {

        Address = address;
    }

    public float getStorageCapacity() {

        return storageCap;
    }

    public void setStorageCap(
            float storageCap) {
        storageCap = storageCap;
    }

    public float getCurrentCapacity() {

        return currentCap;
    }

    public void setCurrentCap(
            float currentCap) {
        currentCap = currentCap;
    }

    public String getManagerId() {

        return ManagerId;
    }

    public void setManagerId(String managerId) {
        ManagerId = managerId;
    }
}
