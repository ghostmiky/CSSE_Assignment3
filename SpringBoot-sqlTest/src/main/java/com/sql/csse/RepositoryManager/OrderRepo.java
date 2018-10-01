/*
* This Interface manages the table creation in the database.
* And  built in methods in this interface can be used to manage the basic CRUD operations for a table
*
* */


package com.sql.csse.RepositoryManager;

import com.sql.csse.EntityManager.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {


    /*
    * This is a specified query.
    * which will get all the orders that were delivered to the site.
    *
    * */

    @Query(value = "SELECT o FROM Order o WHERE lower(o.order_status) = lower('delivered') ",nativeQuery = true)
    public ArrayList<Order> findDelivered( );
}
