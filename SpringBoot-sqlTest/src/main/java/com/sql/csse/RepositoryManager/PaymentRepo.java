/*
* Handles the connection to the payment table in the database.
* Author:IT16153028
* */

package com.sql.csse.RepositoryManager;

import com.sql.csse.EntityManager.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo  extends JpaRepository<Payment,Integer> {


}
