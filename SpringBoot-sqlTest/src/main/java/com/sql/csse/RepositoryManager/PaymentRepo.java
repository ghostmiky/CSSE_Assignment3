package com.sql.csse.RepositoryManager;

import com.sql.csse.EntityManager.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo  extends JpaRepository<Payment,Integer> {


}
