package com.sql.csse.ControllerManager;
import com.google.gson.Gson;
import com.sql.csse.EntityManager.BlacklistCon;
import com.sql.csse.RepositoryManager.blacklistRepoCon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/blacklist/con")
public class BlacklistConController {

        @Autowired
        blacklistRepoCon repo;

        BlacklistCon blacklistCon;

        @RequestMapping(method = RequestMethod.POST , value = "/save" , consumes = MediaType.APPLICATION_JSON_VALUE)
        public List<BlacklistCon> SaveConBlacklist(@RequestBody String bcon){

            Gson gson = new Gson();

            blacklistCon =  gson.fromJson(bcon, BlacklistCon.class);
            repo.save(blacklistCon);

            return repo.findAll();
        }

        @RequestMapping(method = RequestMethod.GET , value = "/getall" , produces = MediaType.APPLICATION_JSON_VALUE)
        public List<BlacklistCon> getAll(){
            return repo.findAll();
        }




}


