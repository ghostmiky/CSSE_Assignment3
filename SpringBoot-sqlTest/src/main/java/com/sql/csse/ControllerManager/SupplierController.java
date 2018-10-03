/*
* This Controller class handles the requests regarding the Suppliers
* Author:IT16153028
* */

package com.sql.csse.ControllerManager;


import com.google.gson.Gson;
import com.sql.csse.EntityManager.Item;
import com.sql.csse.EntityManager.Supplier;
import com.sql.csse.RepositoryManager.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/Supplier")
public class SupplierController {

    @Autowired
    SupplierRepo supplierRepo;

    Supplier supplier;
    List<Supplier> supps;
    List<Item> itms;


//    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Supplier> getAll(Model model){
//        model.addAttribute("supplier", new Supplier());
//
//        List<Supplier> sup_details=new ArrayList<Supplier>();
//        Iterable<Supplier> sup_detailsIterable= supplierRepo.findAll();
//        Iterator<Supplier> sup_detailsIterator=sup_detailsIterable.iterator();
//        while(sup_detailsIterator.hasNext())
//        {
//            sup_details.add(sup_detailsIterator.next());
//        }
//        model.addAttribute("listRequest", sup_details);
//        return supplierRepo.findAll();
//    }

    @RequestMapping(method = RequestMethod.POST , value = "/save" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Supplier> SaveSupplier(@RequestBody  String supp){

        Gson gson = new Gson();

        supplier =  gson.fromJson(supp,Supplier.class);
        supplierRepo.save(supplier);
      //  System.out.println(supp.getAddress());
        return supplierRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Supplier> getAll(){
        return supplierRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET , value = "/getItems/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Item> getItems(@PathVariable("id") int sid){
            supps = supplierRepo.findAll();
            for(Supplier s : supps){
                if(s.getSupplierID() == sid){
                    itms = s.getItems();
                }
            }

            return itms;
    }

    @RequestMapping(method = RequestMethod.GET , value = "/getSupplier/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public Supplier getSupplier(@PathVariable("id") int id){
        supps = supplierRepo.findAll();

        for(Supplier s : supps){
            if(s.getSupplierID() == id)
                supplier = s;
        }
        return supplier;
    }



    @RequestMapping(method = RequestMethod.PUT , value = "/updateSupplier" , produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateSupplier(Supplier supplier) {
        supplierRepo.save(supplier);

    }
}
