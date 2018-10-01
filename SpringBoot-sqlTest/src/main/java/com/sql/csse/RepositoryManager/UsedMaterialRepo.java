package com.sql.csse.RepositoryManager;

import com.sql.csse.EntityManager.UsedMaterials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsedMaterialRepo extends JpaRepository<UsedMaterials, Integer> {
}
