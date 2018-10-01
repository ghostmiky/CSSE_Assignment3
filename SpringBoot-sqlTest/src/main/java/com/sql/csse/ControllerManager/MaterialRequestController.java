package com.sql.csse.ControllerManager;


import com.google.gson.Gson;
import com.sql.csse.EntityManager.MaterialRequest;
import com.sql.csse.EntityManager.Order;
import com.sql.csse.EntityManager.Supplier;
import com.sql.csse.RepositoryManager.MaterialRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Requests")
public class MaterialRequestController {

    @Autowired
    MaterialRequestRepo materialRequestRepo;

    MaterialRequest materialRequest;
    List<MaterialRequest> materialList;

    @RequestMapping(method = RequestMethod.POST , value = "/save" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<MaterialRequest> MaterialRequests(@RequestBody  String mr){

        Gson gson = new Gson();
        materialRequest =  gson.fromJson(mr, MaterialRequest.class);
        materialRequestRepo.save(materialRequest);
        return materialRequestRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MaterialRequest> getAll(){
        return materialRequestRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET , value = "/getallPending" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<MaterialRequest> getPendingRequests(){

        return materialRequestRepo.findpendingRequests();


    }

//    @RequestMapping(method = RequestMethod.GET , value = "/getPending/{status}" ,produces = MediaType.APPLICATION_JSON_VALUE)
//    public MaterialRequest getPendingRequests(@PathVariable("status") String st){
//        materialList = materialRequestRepo.findAll();
//
//        for(MaterialRequest mr : materialList){
//            if(mr.getStatus() == st)
//                materialRequest = mr;
//        }
//        return materialRequest;
//    }


}
