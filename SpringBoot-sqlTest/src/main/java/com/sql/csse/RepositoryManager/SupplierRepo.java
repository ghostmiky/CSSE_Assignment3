/*this repository handles the data connection between Supplier table and the system
    Author:It16153028
*
* */

package com.sql.csse.RepositoryManager;

import com.sql.csse.EntityManager.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<Supplier, Integer>{
}
