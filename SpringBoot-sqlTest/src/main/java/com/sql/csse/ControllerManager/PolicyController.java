package com.sql.csse.ControllerManager;



import com.google.gson.Gson;
import com.sql.csse.EntityManager.Policy;
import com.sql.csse.RepositoryManager.PolicyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Policy")
public class PolicyController {

    @Autowired
    PolicyRepo policyRepo;

    Policy policy;
    List<Policy> policyList;

    //Add new emps
    @RequestMapping(method = RequestMethod.POST , value = "/save" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Policy> Policies(@RequestBody  String mr){

        Gson gson = new Gson();
        policy =  gson.fromJson(mr, Policy.class);
        policyRepo.save(policy);
        return policyRepo.findAll();
    }


    //Get all policy
    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Policy> getAll(){
        return policyRepo.findAll();
    }



    @RequestMapping(method=RequestMethod.PUT, value="/updatePolicy/{id}")
    public List<Policy> updatePolicy(@PathVariable("id") int rid, @RequestBody String jsonString){
        Gson obj = new Gson();

        policy = obj.fromJson(jsonString, Policy.class);
        policyRepo.updatePolicy(rid,policy.getPolicyID(),policy.getDescription());
        return policyRepo.findAll();
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/deletePolicy/{id}")
    public List<Policy> deletePolicy(@PathVariable("id") int PolicyID){
        policyRepo.deleteById(PolicyID);
        return policyRepo.findAll();
    }

}