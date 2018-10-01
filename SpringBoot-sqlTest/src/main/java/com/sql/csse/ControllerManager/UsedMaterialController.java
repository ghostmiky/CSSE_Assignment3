package com.sql.csse.ControllerManager;


import com.sql.csse.EntityManager.UsedMaterials;
import com.sql.csse.RepositoryManager.UsedMaterialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/UsedMaterials")
public class UsedMaterialController {


    @Autowired
    UsedMaterialRepo usedMaterialRepo;

    //Add used material details
    @RequestMapping(method = RequestMethod.POST , value = "/save" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<UsedMaterials> UsedMaterials(@RequestBody final UsedMaterials um){
        usedMaterialRepo.save(um);
        return usedMaterialRepo.findAll();
    }

    //View used material details
    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UsedMaterials> getAll(){
        return usedMaterialRepo.findAll();
    }

    //Update used materials
//    @RequestMapping(method = RequestMethod.PUT,value = "/update{id}")
//    public List<UsedMaterials> updatUsed(@PathVariable("id") int id,@RequestBody UsedMaterials um) {
//        UsedMaterials currentUsedMaterial =
//    }

}
