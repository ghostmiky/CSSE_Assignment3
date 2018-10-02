package com.sql.csse.EntityManager;

/*
 * Author S.S. Abeydeera
 * IT16119468
 */

import javax.persistence.*;

@Entity

@Table(name ="material_requests")
public class MaterialRequest {

    @Id
    @Column(name = "RID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int RID;


    @Column(name = "MID")
    private int MID;

    @Column(name = "material_name")
    private String material_name;

    @Column(name = "material_quantity")
    private double material_quantity;

    @Column(name = "requested_date")
    private String requested_date;

    @Column(name = "order_date")
    private String order_date;

    @Column(name = "satatus")
    private String status;


    public MaterialRequest(int MID, String material_name, double material_quantity, String requested_date, String order_date, String status) {
        this.MID = MID;
        this.material_name = material_name;
        this.material_quantity = material_quantity;
        this.requested_date = requested_date;
        this.order_date = order_date;
        this.status = status;

    }

    public MaterialRequest() {
    }

    public int getRID() {
        return RID;
    }

    public void setRID(int RID) {
        this.RID = RID;
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

    public double getMaterial_quantity() {
        return material_quantity;
    }

    public void setMaterial_quantity(double material_quantity) {
        this.material_quantity = material_quantity;
    }

    public String getRequested_date() {
        return requested_date;
    }

    public void setRequested_date(String requested_date) {
        this.requested_date = requested_date;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
