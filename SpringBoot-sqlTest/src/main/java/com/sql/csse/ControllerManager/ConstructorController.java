package com.sql.csse.ControllerManager;
/*
 * Author S.S. Abeydeera
 * IT16119468
 */



import com.google.gson.Gson;
import com.sql.csse.EntityManager.Constructor;
import com.sql.csse.RepositoryManager.ConstructorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Constructor")
public class ConstructorController {

    @Autowired
    ConstructorRepo constructorRepo;

    Constructor constructor;
    List<Constructor> cons;


    //Add new Constructor
    @RequestMapping(method = RequestMethod.POST , value = "/save" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Constructor> MaterialRequests(@RequestBody String c){

        Gson gson = new Gson();
        constructor =  gson.fromJson(c, Constructor.class);
        constructorRepo.save(constructor);
        return constructorRepo.findAll();
    }

    //Get All Constructors
    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Constructor> getAll(){
        return constructorRepo.findAll();
    }

    //Get one Constructor
    @RequestMapping(method = RequestMethod.GET , value = "/getOneConstructor/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Constructor> getItems(@PathVariable("id") int cid){
        cons = constructorRepo.findAll();
        List<Constructor>constructor=null;
        for(Constructor c : cons){
            if(c.getCID() == cid){
                constructor.add(c);
            }
        }

        return constructor;
    }

}
