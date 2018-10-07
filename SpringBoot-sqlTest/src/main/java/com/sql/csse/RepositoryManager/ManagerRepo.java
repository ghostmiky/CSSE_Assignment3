package com.sql.csse.RepositoryManager;


import com.sql.csse.EntityManager.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepo extends JpaRepository<Manager,Integer> {
}
