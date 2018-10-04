/*
* This Controller class handles the requests regarding the Orders
* Author:IT16153028
* */


package com.sql.csse.ControllerManager;


import com.google.gson.Gson;
import com.sql.csse.EntityManager.Order;
import com.sql.csse.EntityManager.Supplier;
import com.sql.csse.RepositoryManager.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Order")
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

    protected ArrayList<Order> AllOrders;
    protected ArrayList<Order> orders;

    protected Order order;

    /*
    * This method will invoke the 'findDelivered' method in the OrderRepo class.
    * and will return a list of Orders that has the OrderStatus as 'Delivered'
    *
    * */

    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Order>  getOrdersDelivered(){

            return orderRepo.findDelivered();


    }

    @RequestMapping(method = RequestMethod.POST , value = "/save" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Order> SaveOrder(@RequestBody String ord){

        try{
            Gson gson = new Gson();

            order =  gson.fromJson(ord,Order.class);
            orderRepo.save(order);
        }catch (Exception e){
            e.printStackTrace();
        }

        return orderRepo.findAll();
    }



}
