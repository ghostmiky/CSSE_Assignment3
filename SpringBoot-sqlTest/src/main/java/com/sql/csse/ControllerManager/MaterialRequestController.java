package com.sql.csse.ControllerManager;

/*
 * Author S.S. Abeydeera
 * IT16119468
 */

import com.google.gson.Gson;
import com.sql.csse.EntityManager.MaterialRequest;
import com.sql.csse.EntityManager.Site;
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

    //Delete Request
    @RequestMapping(method=RequestMethod.DELETE, value = "/deleteRequest/{id}")
    public List<MaterialRequest> deleteRequest(@PathVariable("id") int rid){
        materialRequestRepo.deleteById(rid);
        return materialRequestRepo.findAll();
    }

    //Accept Request by site manager
    @RequestMapping(method=RequestMethod.PUT, value="/MgrAcceptRequestStatus/{id}")
    public List<MaterialRequest> acceptRequestStat(@PathVariable("id") int rid){

        materialRequestRepo.acceptRequestStatusBYsitemgr(rid);
        return materialRequestRepo.findAll();
    }

    //reject Request by site manager
    @RequestMapping(method=RequestMethod.PUT, value="/MgrRejectRequestStatus/{id}")
    public List<MaterialRequest> rejectRequestStat(@PathVariable("id") int rid){

        materialRequestRepo.rejectRequestStatusBYsitemgr(rid);
        return materialRequestRepo.findAll();
    }


    //Accept Request by proc staff
    @RequestMapping(method=RequestMethod.PUT, value="/ProcAcceptRequestStatus/{id}")
    public List<MaterialRequest> acceptRequestStatproc(@PathVariable("id") int rid){

        materialRequestRepo.acceptRequestStatusBYproc(rid);
        return materialRequestRepo.findAll();
    }

    //reject Request by proc staff
    @RequestMapping(method=RequestMethod.PUT, value="/ProcRejectRequestStatus/{id}")
    public List<MaterialRequest> rejectRequestStatproc(@PathVariable("id") int rid){

        materialRequestRepo.rejectRequestStatusBYproc(rid);
        return materialRequestRepo.findAll();
    }



}
