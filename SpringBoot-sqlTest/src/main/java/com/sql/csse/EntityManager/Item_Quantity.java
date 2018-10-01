
/*

        This Entity class is to store items and their quantities in the process of Order.
*       The Order class will create a instance of this class and use it to store the items and quantities in the order
*         Author : It16153028
*
*
* */

package com.sql.csse.EntityManager;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item_Quantity {

    @Id
    private int IQ_id;

    private String item_name;

    private float quantity;

    public Item_Quantity(String item, float quantity) {
        this.item_name = item;
        this.quantity = quantity;
    }

    public Item_Quantity() {
    }

    public String getItem() {
        return item_name;
    }

    public void setItem(String item) {
        this.item_name = item;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
