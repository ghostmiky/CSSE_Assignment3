package com.sql.csse.ControllerManager;



import com.google.gson.Gson;
import com.sql.csse.EntityManager.Manager;
import com.sql.csse.RepositoryManager.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Manager")
public class ManagerController {

    @Autowired
    ManagerRepo managerRepo;

    Manager manager;
    List<Manager> managerList;

    //Add new emps
    @RequestMapping(method = RequestMethod.POST , value = "/save" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Manager> Managers(@RequestBody  String mr){

        Gson gson = new Gson();
        manager =  gson.fromJson(mr, Manager.class);
        managerRepo.save(manager);
        return managerRepo.findAll();
    }


    //Get all emps
    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Manager> getAll(){
        return managerRepo.findAll();
    }



    @RequestMapping(method=RequestMethod.PUT, value="/updateManager/{id}")
    public List<Manager> updateManager(@PathVariable("id") int rid, @RequestBody String jsonString){
        Gson obj = new Gson();

        authorized_employee = obj.fromJson(jsonString, Manager.class);
        managerRepo.updateManager(rid,manager.getEmployeeID(),manager.getEmployeeType(),manager.getEmployee_FName(),manager.getEmployee_LName,manager.getAddress(),manager.getEmail(),manager.getPhone());
        return managerRepo.findAll();
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/deleteManager/{id}")
    public List<Manager> deleteManager(@PathVariable("id") int EmployeeID){
        managerRepo.deleteById(EmployeeID);
        return managerRepo.findAll();
    }

}
