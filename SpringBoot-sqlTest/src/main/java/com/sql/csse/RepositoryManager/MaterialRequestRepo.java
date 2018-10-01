package com.sql.csse.RepositoryManager;

import com.sql.csse.EntityManager.MaterialRequest;
import com.sql.csse.EntityManager.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface MaterialRequestRepo extends JpaRepository<MaterialRequest, Integer>{


    @Query(value = "SELECT m FROM material__requests m WHERE lower(m.status) = lower('pending') ",nativeQuery = true)
    public ArrayList<Order> findpendingRequests( );
}
