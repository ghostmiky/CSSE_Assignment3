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
    @Query(value = "SELECT * FROM material_requests m WHERE m.status = 'Pending' ",nativeQuery = true)
     ArrayList<MaterialRequest> findpendingRequests();


    /*
     * This query is used for select the
     * mgr accepted request details
     * */
    @Query(value = "SELECT * FROM material_requests m WHERE m.satatus = 'Accepted by Site Manager' ",nativeQuery = true)
    ArrayList<MaterialRequest> findMgracceptedRequests();

    /*
     * This query is used for select the
     * proc accepted request details
     * */
    @Query(value = "SELECT * FROM material_requests m WHERE m.satatus = 'Accepted by Site Proc Staff' ",nativeQuery = true)
    ArrayList<MaterialRequest> findProcacceptedRequests();


    /*
     * This query is used for select the
     * mgr rejected request details
     * */
    @Query(value = "SELECT * FROM material_requests m WHERE m.satatus = 'Rejected by Site Manager' ",nativeQuery = true)
    ArrayList<MaterialRequest> findMgrrejectedRequests();

    /*
     * This query is used for select the
     * proc rejected request details
     * */
    @Query(value = "SELECT * FROM material_requests m WHERE m.satatus = 'Rejected by Site Proc Staff' ",nativeQuery = true)
    ArrayList<MaterialRequest> findProcrejectedRequests();


    /*
    * This query is used for
    * update request details
    * */

    @Modifying
    @Transactional
    @Query(value = "UPDATE material_requests m SET m.mid = :mid ,m.material_quantity=:material_quantity, m.requested_date=:requested_date, m.order_date=:order_date, m.status=:status WHERE m.rid = :rid", nativeQuery = true)
    void updateRequest(@Param("rid") int rid, @Param("mid") int mid, @Param("material_quantity") double material_quantity, @Param("requested_date") String requested_date, @Param("order_date") String order_date, @Param("status") String status);


    /*
     * This query is used for
     * update status SITEMANAGER
     * */
    @Modifying
    @Transactional
    @Query(value = "UPDATE material_requests m SET m.status='Accepted by Site Manager' WHERE m.rid = :rid", nativeQuery = true)
    void acceptRequestStatusBYsitemgr(@Param("rid") int rid);

    @Modifying
    @Transactional
    @Query(value = "UPDATE material_requests m SET m.status='Rejected by Site Manager' WHERE m.rid = :rid", nativeQuery = true)
    void rejectRequestStatusBYsitemgr(@Param("rid") int rid);


    /*
     * This query is used for
     * update status PROCUMENTSTAFF
     * */
    @Modifying
    @Transactional
    @Query(value = "UPDATE material_requests m SET m.status='Accepted by Site Proc Staff' WHERE m.rid = :rid", nativeQuery = true)
    void acceptRequestStatusBYproc(@Param("rid") int rid);

    @Modifying
    @Transactional
    @Query(value = "UPDATE material_requests m SET m.status='Rejected by Site Proc Staff' WHERE m.rid = :rid", nativeQuery = true)
    void rejectRequestStatusBYproc(@Param("rid") int rid);




}
