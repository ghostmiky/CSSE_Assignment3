package com.sql.csse.RepositoryManager;


import com.sql.csse.EntityManager.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface SiteRepo extends JpaRepository<Site,Integer> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE sites s SET s.address = :address ,s.site_name=:sitename, s.current_capacity=:currentcap, s.storage_capacity=:storagecap, s.manager_id=:managerid WHERE s.siteid = :siteID", nativeQuery = true)
    void updateSite(@Param("siteID") int siteID, @Param("address") String address, @Param("sitename") String sitename, @Param("currentcap") float currentcap, @Param("storagecap") float storagecap, @Param("managerid") String managerid);

}