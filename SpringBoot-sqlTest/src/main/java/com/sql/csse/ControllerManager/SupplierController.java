package com.sql.csse.ControllerManager;


import com.google.gson.Gson;
import com.sql.csse.EntityManager.Item;
import com.sql.csse.EntityManager.Supplier;
import com.sql.csse.RepositoryManager.SRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/Supplier")
public class SupplierController {

    @Autowired
    SRepo sRepo;

    Supplier supplier;
    List<Supplier> supps;
    List<Item> itms;


//    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Supplier> getAll(Model model){
//        model.addAttribute("supplier", new Supplier());
//
//        List<Supplier> sup_details=new ArrayList<Supplier>();
//        Iterable<Supplier> sup_detailsIterable= sRepo.findAll();
//        Iterator<Supplier> sup_detailsIterator=sup_detailsIterable.iterator();
//        while(sup_detailsIterator.hasNext())
//        {
//            sup_details.add(sup_detailsIterator.next());
//        }
//        model.addAttribute("listRequest", sup_details);
//        return sRepo.findAll();
//    }

    @RequestMapping(method = RequestMethod.POST , value = "/save" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Supplier> SaveSupplier(@RequestBody  String supp){

        Gson gson = new Gson();

        supplier =  gson.fromJson(supp,Supplier.class);
        sRepo.save(supplier);
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

    @RequestMapping(method = RequestMethod.GET , value = "/getSupplier/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public Supplier getSupplier(@PathVariable("id") int id){
        supps = sRepo.findAll();

        for(Supplier s : supps){
            if(s.getSupplierID() == id)
                supplier = s;
        }
        return supplier;
    }



    @RequestMapping(method = RequestMethod.PUT , value = "/updateSupplier" , produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateSupplier(Supplier supplier) {
        sRepo.save(supplier);

    }
}
