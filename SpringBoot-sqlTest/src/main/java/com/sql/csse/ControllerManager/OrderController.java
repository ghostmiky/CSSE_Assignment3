package com.sql.csse.ControllerManager;

import com.sql.csse.EntityManager.Item_Quantity;
import com.sql.csse.EntityManager.Order;
import com.sql.csse.RepositoryManager.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/Order")
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

    protected ArrayList<Order> AllOrders;
    protected ArrayList<Order> orders;

    /*
    * This method will invoke the 'findDelivered' method in the OrderRepo class.
    * and will return a list of Orders that has the OrderStatus as 'Delivered'
    *
    * */

    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Order>  getOrdersDelivered(){

            return orderRepo.findDelivered();


    }



}
