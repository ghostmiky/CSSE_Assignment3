package com.sql.csse.ControllerManager;


import com.sql.csse.EntityManager.MaterialRequest;
import com.sql.csse.RepositoryManager.MaterialRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Requests")
public class MaterialRequestController {

    @Autowired
    MaterialRequestRepo materialRequestRepo;


    @RequestMapping(method = RequestMethod.POST , value = "/save" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<MaterialRequest> MaterialRequests(@RequestBody final MaterialRequest mr){
        materialRequestRepo.save(mr);
        return materialRequestRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MaterialRequest> getAll(){
        return materialRequestRepo.findAll();
    }
}
