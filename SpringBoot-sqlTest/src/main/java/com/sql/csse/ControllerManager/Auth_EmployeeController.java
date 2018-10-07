package com.sql.csse.ControllerManager;



import com.google.gson.Gson;
import com.sql.csse.EntityManager.AuthorizedEmployee;
import com.sql.csse.RepositoryManager.Auth_EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Auth_Employee")
public class Auth_EmployeeController {

    @Autowired
    Auth_EmployeeRepo auth_employeeRepo;

    Authorized_Employee authorized_employee;
    List<Authorized_Employee> authorized_employeeList;

    //Add new emps
    @RequestMapping(method = RequestMethod.POST , value = "/save" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Authorized_Employee> Authorized_Employees(@RequestBody  String mr){

        Gson gson = new Gson();
        authorized_employee =  gson.fromJson(mr, Authorized_Employee.class);
        auth_employeeRepo.save(authorized_employee);
        return auth_employeeRepo.findAll();
    }


    //Get all emps
    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Authorized_Employee> getAll(){
        return auth_employeeRepo.findAll();
    }



    @RequestMapping(method=RequestMethod.PUT, value="/updateEmp/{id}")
    public List<Authorized_Employee> updateEmp(@PathVariable("id") int rid, @RequestBody String jsonString){
        Gson obj = new Gson();

        authorized_employee = obj.fromJson(jsonString, Authorized_Employee.class);
        auth_employeeRepo.updateEmp(rid,authorized_employee.getEmployeeID(),authorized_employee.getEmployeeType(),authorized_employee.getEmployee_FName(),authorized_employee.getEmployee_LName,authorized_employee.getAddress(),authorized_employee.getEmail(),authorized_employee.getPhone());
        return auth_employeeRepo.findAll();
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/deleteEmp/{id}")
    public List<Authorized_Employee> deleteEmp(@PathVariable("id") int EmployeeID){
        auth_employeeRepo.deleteById(EmployeeID);
        return auth_employeeRepo.findAll();
    }

}