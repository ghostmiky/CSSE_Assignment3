package com.sql.csse.ControllerManager;

import com.google.gson.Gson;

import com.sql.csse.EntityManager.BlacklistSup;
import com.sql.csse.RepositoryManager.blacklistRepoSup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/blacklist/sup")
public class BlacklistSupController {

        @Autowired
        blacklistRepoSup repo;


        List<BlacklistSup> supps;
        BlacklistSup blacklistSup;

        @RequestMapping(method = RequestMethod.POST , value = "/save" , consumes = MediaType.APPLICATION_JSON_VALUE)
        public List<BlacklistSup> SaveSupBlacklist(@RequestBody String bsup){

            Gson gson = new Gson();

            blacklistSup =  gson.fromJson(bsup, BlacklistSup.class);
            repo.save(blacklistSup);

            return repo.findAll();
        }

        @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
        public List<BlacklistSup> getAll(){
            return repo.findAll();
        }



        @RequestMapping(method = RequestMethod.GET , value = "/getSupplier/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
        public BlacklistSup getSupplier(@PathVariable("id") int id){
            supps = repo.findAll();

            for(BlacklistSup s : supps){
                if(s.getSupplierID() == id)
                    blacklistSup = s;
            }
            return blacklistSup;
        }


}
