/*

            This Entity is to manage the Order details
            Author : It16153028
* */




package com.sql.csse.EntityManager;


import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;


@Entity
@Table(name="Orders")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Order_id")
    private int OrderId;

    @Column(name = "Sequential_ref")
    private int Seq_Ref;

    @Column(name = "Item_quantity")
    private ArrayList<Item_Quantity> item_q;

    @Column(name = "Order_status")
    private String Order_status;

    @Column(name = "Order_date")
    private Date Order_date;

    @Column(name = "IsDraftPurchaseOrder")
    private boolean IsDraftPurchaseOrder;

    @Column(name = "onHold")
    private boolean onHold;


    public Order(int seq_Ref, ArrayList<Item_Quantity> item_q, String order_status, Date order_date, boolean isDraftPurchaseOrder, boolean onHold) {
        this.Seq_Ref = seq_Ref;
        this.item_q = item_q;
        this.Order_status = order_status;
        this.Order_date = order_date;
        this.IsDraftPurchaseOrder = isDraftPurchaseOrder;
        this.onHold = onHold;
    }

    public Order() {
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        this.OrderId = orderId;
    }

    public int getSeq_Ref() {
        return Seq_Ref;
    }

    public void setSeq_Ref(int seq_Ref) {
        this.Seq_Ref = seq_Ref;
    }

    public ArrayList<Item_Quantity> getItem_q() {
        return item_q;
    }

    public void setItem_q(ArrayList<Item_Quantity> item_q) {
        this.item_q = item_q;
    }

    public String getOrder_status() {
        return Order_status;
    }

    public void setOrder_status(String order_status) {
        this.Order_status = order_status;
    }

    public Date getOrder_date() {
        return Order_date;
    }

    public void setOrder_date(Date order_date) {
        this.Order_date = order_date;
    }

    public boolean isDraftPurchaseOrder() {
        return IsDraftPurchaseOrder;
    }

    public void setDraftPurchaseOrder(boolean draftPurchaseOrder) {
        this.IsDraftPurchaseOrder = draftPurchaseOrder;
    }

    public boolean isOnHold() {
        return onHold;
    }

    public void setOnHold(boolean onHold) {
        this.onHold = onHold;
    }
}
