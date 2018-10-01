package com.sql.csse.RepositoryManager;

import com.sql.csse.EntityManager.MaterialRequest;
import com.sql.csse.EntityManager.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface MaterialRequestRepo extends JpaRepository<MaterialRequest, Integer>{


    @Query(value = "SELECT * FROM material_requests m WHERE m.satatus = 'pending' ",nativeQuery = true)
    public ArrayList<MaterialRequest> findpendingRequests( );
}
