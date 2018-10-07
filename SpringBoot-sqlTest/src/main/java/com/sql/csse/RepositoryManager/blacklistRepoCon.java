package com.sql.csse.RepositoryManager;

import com.sql.csse.EntityManager.BlacklistCon;
import org.springframework.data.jpa.repository.JpaRepository;

//extends the repository
public interface blacklistRepoCon extends JpaRepository<BlacklistCon, Integer> {

}
