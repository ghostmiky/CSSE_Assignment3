package com.sql.csse.RepositoryManager;

import com.sql.csse.EntityManager.BlacklistSup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface blacklistRepoSup extends JpaRepository<BlacklistSup, Integer> {
}
