package com.sql.csse.RepositoryManager;

import com.sql.csse.EntityManager.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SRepo extends JpaRepository<Supplier, Integer>{
}
