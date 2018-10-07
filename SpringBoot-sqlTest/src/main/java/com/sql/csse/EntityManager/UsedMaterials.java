package com.sql.csse.EntityManager;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "used_materials")
public class UsedMaterials {

    @Id
    @Column(name = "uid")
    private int UID;

    @Column(name = "mid")
    private int MID;

    @Column(name = "material_name")
    private String material_name;

    @Column(name = "used_quantity")
    private double used_quantity;

    @Column(name = "used_date")
    private String used_date;

    public UsedMaterials(int UID, int MID, String material_name, double used_quantity, String used_date) {
        this.UID = UID;
        this.MID = MID;
        this.material_name = material_name;
        this.used_quantity = used_quantity;
        this.used_date = used_date;
    }

    public UsedMaterials() {
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public int getMID() {
        return MID;
    }

    public void setMID(int MID) {
        this.MID = MID;
    }

    public String getMaterial_name() {
        return material_name;
    }

    public void setMaterial_name(String material_name) {
        this.material_name = material_name;
    }

    public double getUsed_quantity() {
        return used_quantity;
    }

    public void setUsed_quantity(double used_quantity) {
        this.used_quantity = used_quantity;
    }

    public String getUsed_date() {
        return used_date;
    }

    public void setUsed_date(String used_date) {
        this.used_date = used_date;
    }
}
