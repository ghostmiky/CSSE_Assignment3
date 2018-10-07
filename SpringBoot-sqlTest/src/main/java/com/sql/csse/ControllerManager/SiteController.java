package com.sql.csse.ControllerManager;

import com.google.gson.Gson;

import com.sql.csse.EntityManager.Site;
import com.sql.csse.RepositoryManager.SiteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sites")
public class SiteController {

    @Autowired
    SiteRepo repo;

    Site site;


    @RequestMapping(method = RequestMethod.GET, value = "/getAllSites", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Site> getAll() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/saveSite", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Site> insertSite(@RequestBody String jsonString) {
        System.out.println(jsonString);
        Gson obj = new Gson();

        site = obj.fromJson(jsonString, Site.class);
        System.out.println(site);
        repo.save(site);

        return repo.findAll();
    }


    @RequestMapping(method = RequestMethod.GET, value="/getSite/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public Optional<Site> getSite(@PathVariable("id") int siteID) {

        return repo.findById(siteID);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/deleteSite/{id}")
    public List<Site> deleteSite(@PathVariable("id") int siteID){
        repo.deleteById(siteID);
        return repo.findAll();
    }

    @RequestMapping(method=RequestMethod.PUT, value="/updateSite/{id}")
    public List<Site> updateSite(@PathVariable("id") int siteID, @RequestBody String jsonString){
        Gson obj = new Gson();

        site = obj.fromJson(jsonString, Site.class);
        System.out.println(site.getAddress());

        repo.updateSite(siteID, site.getAddress(), site.getSiteName(), site.getCurrentCapacity(),site.getStorageCapacity(), site.getManagerId());
        return repo.findAll();
    }

    @RequestMapping(method=RequestMethod.PUT, value="/updateSiteManager/{id}")
    public List<Site> addSiteManager(@PathVariable("id") int siteID, @RequestBody String jsonString){
        Gson obj = new Gson();

        site = obj.fromJson(jsonString, Site.class);

        repo.addManager(siteID,site.getManagerId());
        System.out.println(site.getManagerId());
        return repo.findAll();
    }



}
