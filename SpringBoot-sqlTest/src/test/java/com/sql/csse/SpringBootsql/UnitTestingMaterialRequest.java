package com.sql.csse.SpringBootsql;

import com.sql.csse.EntityManager.MaterialRequest;
import com.sql.csse.RepositoryManager.MaterialRequestRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitTestingMaterialRequest {

   @Autowired
    private TestEntityManager testEntityManager;


    @Autowired
    MaterialRequestRepo materialRequestRepo;

    static List<MaterialRequest> materialRequests;


    @Test
    public void testSaveRequest(){
        MaterialRequest mr = getRequest();
        MaterialRequest mr_1 = null;
        MaterialRequest tests =  testEntityManager.persist(mr);

        List<MaterialRequest> MList = materialRequestRepo.findAll();

        for(MaterialRequest m :MList){
            if(m.getRID() == tests.getRID()){
                mr_1 = m;
            }
        }

        assertThat(tests).isEqualTo(mr_1);

    }

    static{
        materialRequests.add( new MaterialRequest(1,"Cement",50,"25-10-2018","29-10-2018","Peding"));
    }

   private MaterialRequest getRequest(){
        MaterialRequest mreq =  new MaterialRequest();
        mreq.setMaterial_name("Cement");
       mreq. setMaterial_quantity(500);
       mreq.setMID((5));
       mreq.setOrder_date("25-10-2018");
       mreq.setRID(1);
       mreq.setStatus("Pending");



       return mreq;
    }

}
