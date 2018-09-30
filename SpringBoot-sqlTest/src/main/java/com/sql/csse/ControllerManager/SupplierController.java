package com.sql.csse.ControllerManager;


import com.sql.csse.EntityManager.Item;
import com.sql.csse.EntityManager.Supplier;
import com.sql.csse.RepositoryManager.SRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Supplier")
public class SupplierController {

    @Autowired
    SRepo sRepo;

    Supplier supplier;
    List<Supplier> supps;
    List<Item> itms;

    @RequestMapping(method = RequestMethod.POST , value = "/save" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Supplier> SaveSupplier(@RequestBody  Supplier supp){
        sRepo.save(supp);
      //  System.out.println(supp.getAddress());
        return sRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Supplier> getAll(){
        return sRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET , value = "/getItems/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Item> getItems(@PathVariable("id") int sid){
            supps = sRepo.findAll();
            for(Supplier s : supps){
                if(s.getSupplierID() == sid){
                    itms = s.getItems();
                }
            }

            return itms;
    }
}
