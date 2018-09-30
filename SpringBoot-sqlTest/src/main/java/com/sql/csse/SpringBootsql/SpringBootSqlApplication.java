package com.sql.csse.SpringBootsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.sql.csse.RepositoryManager")
@SpringBootApplication
@EntityScan("com.sql.csse.EntityManager")
@ComponentScan("com.sql.csse.ControllerManager")
public class SpringBootSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSqlApplication.class, args);
	}
}
