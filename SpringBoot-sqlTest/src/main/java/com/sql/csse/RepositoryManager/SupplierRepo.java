/*this repository handles the data connection between Supplier table and the system
    Author:It16153028
*
* */

package com.sql.csse.RepositoryManager;

import com.sql.csse.EntityManager.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface SupplierRepo extends JpaRepository<Supplier, Integer>{

    @Modifying
    @Transactional
    @Query(value = "UPDATE supplier s SET s.address = :address ,s.supplier_name=:suppliername, s.bank_acc_number=:bankANo, s.email=:email, s.phone=:phone , s.availability =:availability , s.report =:report , s.rate =:rate WHERE s.supplier_id = :supplierID", nativeQuery = true)
    void updateSupplier(@Param("supplierID") int SupplierID, @Param("address") String address, @Param("suppliername") String suppliername, @Param("bankANo") Long bankANo, @Param("email") String email, @Param("phone") String phone, @Param("availability") boolean availability , @Param("report") String report , @Param("rate") float rate);

}
