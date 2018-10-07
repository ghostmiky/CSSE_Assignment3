package com.sql.csse.RepositoryManager;



import com.sql.csse.EntityManager.Authorized_Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Authorized_EmployeeRepo extends JpaRepository<Authorized_Employee,Integer> {
}
