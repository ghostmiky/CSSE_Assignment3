package com.sql.csse.RepositoryManager;

/*
 * Author S.S. Abeydeera
 * IT16119468
 */

import com.sql.csse.EntityManager.MaterialRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.ArrayList;

public interface MaterialRequestRepo extends JpaRepository<MaterialRequest, Integer>{


    /*
    * This query is used for select the
    * pending request details
    * */
    @Query(value = "SELECT * FROM material_requests m WHERE m.satatus = 'pending' ",nativeQuery = true)
     ArrayList<MaterialRequest> findpendingRequests( );

    /*
    * This query is used for
    * update request details
    * */

    @Modifying
    @Transactional
    @Query(value = "UPDATE materila_requests m SET m.mid = :mid ,m.material_name=:material_name, m.material_quantity=:material_quantity, m.requested_date=:requested_date, m.order_date=:order_date, m.status=:status WHERE m.rid = :rid", nativeQuery = true)
    void updateRequest(@Param("rid") int rid, @Param("mid") int mid, @Param("material_name") String material_name, @Param("material_quantity") double material_quantity, @Param("requested_date") String requested_date, @Param("order_date") String order_date, @Param("status") String status);

     /*
     * This query is used for select the
     * approved request details
     * */
    @Query(value = "SELECT * FROM material_requests m WHERE m.status = 'approved' ",nativeQuery = true)
    ArrayList<MaterialRequest> findApprovedRequests( );

}
