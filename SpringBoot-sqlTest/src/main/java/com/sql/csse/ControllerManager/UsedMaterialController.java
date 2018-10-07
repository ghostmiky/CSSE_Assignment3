package com.sql.csse.ControllerManager;


import com.sql.csse.EntityManager.UsedMaterials;
import com.sql.csse.RepositoryManager.UsedMaterialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/UsedMaterials")
public class UsedMaterialController {


    @Autowired
    UsedMaterialRepo usedMaterialRepo;

    @RequestMapping(method = RequestMethod.POST , value = "/save" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<UsedMaterials> UsedMaterials(@RequestBody final UsedMaterials um){
        usedMaterialRepo.save(um);
        return usedMaterialRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UsedMaterials> getAll(){
        return usedMaterialRepo.findAll();
    }



}
