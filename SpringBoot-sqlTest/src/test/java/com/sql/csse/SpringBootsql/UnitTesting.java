//package com.sql.csse.SpringBootsql;
//
//import com.sql.csse.EntityManager.Item;
//import com.sql.csse.EntityManager.Supplier;
//import com.sql.csse.RepositoryManager.SupplierRepo;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class UnitTesting {
//
//    @Autowired
//    private TestEntityManager testEntityManager;
//
//
//    @Autowired
//    SupplierRepo supplierRepo;
//
//    static List<Item> itemList;
//
//
//    @Test
//    public void testSaveSupplier(){
//        Supplier supplier = getSupplier();
//        Supplier supplier1 = null;
//        Supplier tests =  testEntityManager.persist(supplier);
//
//        List<Supplier> supplierList = supplierRepo.findAll();
//
//        for(Supplier  s :supplierList){
//            if(s.getSupplierID() == tests.getSupplierID()){
//                supplier1 = s;
//            }
//        }
//
//        assertThat(tests).isEqualTo(supplier1);
//
//    }
//
//    static{
//        itemList.add( new Item("ABC","matle",2500,"2 days",false));
//    }
//
//    private Supplier getSupplier(){
//        Supplier supplier =  new Supplier();
//        supplier.setAddress("230,colombo");
//        supplier.setAvailability(true);
//        supplier.setBankAccNumber((long) 54551611);
//        supplier.setItems(itemList);
//        supplier.setEmail("asda@asd.com");
//        supplier.setRate(250);
//        supplier.setReport("Goof");
//
//
//        return supplier;
//    }
//
//    @Test
//    public void testDataSave(){
//
//    }
//}
