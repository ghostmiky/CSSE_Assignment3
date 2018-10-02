package com.sql.csse.RepositoryManager;

/*
 * Author S.S. Abeydeera
 * IT16119468
 */

import com.sql.csse.EntityManager.Constructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConstructorRepo extends JpaRepository<Constructor,Integer> {
}
