package com.sql.csse.RepositoryManager;



import com.sql.csse.EntityManager.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepo extends JpaRepository<Policy,Integer> {
}
