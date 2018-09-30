package com.sql.csse.SpringBootsql;

import com.sql.csse.ControllerManager.SupplierController;
import com.sql.csse.RepositoryManager.SRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= SupplierController.class)
@WebMvcTest
public class SpringBootSqlApplicationTests {

	@Autowired
	private MockMvc mvc;

	@MockBean
	SRepo sRepo;


	@Test
	public void contextLoads() throws Exception {

		Mockito.when(sRepo.findAll()).thenReturn(
				Collections.emptyList()
		);

		  MvcResult mvcResult = mvc.perform(
						MockMvcRequestBuilders.get("/Supplier/getall")
						.accept(MediaType.APPLICATION_JSON)

				).andReturn();
		System.out.println(mvcResult.getResponse());

		Mockito.verify(sRepo).findAll();

	}


}
