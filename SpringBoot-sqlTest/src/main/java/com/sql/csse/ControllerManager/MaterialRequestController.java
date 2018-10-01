
package com.sql.csse.ControllerManager;


import com.google.gson.Gson;
import com.sql.csse.EntityManager.MaterialRequest;
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

    //Add new Material Request
    @RequestMapping(method = RequestMethod.POST , value = "/save" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MaterialRequest> MaterialRequests(@RequestBody  String mr){

        Gson gson = new Gson();
        materialRequest =  gson.fromJson(mr, MaterialRequest.class);
        materialRequestRepo.save(materialRequest);
        return materialRequestRepo.findAll();
    }


    //Get all requests
    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MaterialRequest> getAll(){
        return materialRequestRepo.findAll();
    }


    //Get all pending Requests
    @RequestMapping(method = RequestMethod.GET , value = "/getallPending" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<MaterialRequest> getPendingRequests(){

        return materialRequestRepo.findpendingRequests();
    }


    @RequestMapping(method=RequestMethod.PUT, value="/updateRequests/{id}")
    public List<MaterialRequest> updateRequests(@PathVariable("id") int rid, @RequestBody String jsonString){
        Gson obj = new Gson();

        materialRequest = obj.fromJson(jsonString, MaterialRequest.class);
        materialRequestRepo.updateRequest(rid,materialRequest.getMID(),materialRequest.getMaterial_name(),materialRequest.getMaterial_quantity(),materialRequest.getRequested_date(),materialRequest.getOrder_date(),materialRequest.getStatus());
        return materialRequestRepo.findAll();
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
