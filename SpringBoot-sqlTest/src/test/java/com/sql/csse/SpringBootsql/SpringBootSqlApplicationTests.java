//package com.sql.csse.SpringBootsql;
//
//import com.sql.csse.ControllerManager.SupplierController;
//import com.sql.csse.EntityManager.Item;
//import com.sql.csse.EntityManager.Supplier;
//import com.sql.csse.RepositoryManager.SupplierRepo;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import java.util.Collections;
//import java.util.List;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//@RunWith(SpringRunner.class)
//@ContextConfiguration(classes= SupplierController.class)
//@DataJpaTest
//public class SpringBootSqlApplicationTests {
//
//
//
//	@Test
//	public void contextLoads() throws Exception {
//
////		Mockito.when(supplierRepo.findAll()).thenReturn(
////				Collections.emptyList()
////		);
////
////		  MvcResult mvcResult = mvc.perform(
////						MockMvcRequestBuilders.get("/Supplier/getall")
////						.accept(MediaType.APPLICATION_JSON)
////
////				).andReturn();
////		System.out.println(mvcResult.getResponse());
////
////		Mockito.verify(supplierRepo).findAll();
//
//	}
//
//	/*Author: It16153028
//	  This unit test case is to test whether the supplier data is saved in the database correctly
//	*
//	* */
//
//
//}
