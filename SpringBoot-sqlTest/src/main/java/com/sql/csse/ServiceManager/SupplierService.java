package com.sql.csse.ServiceManager;


import com.sql.csse.EntityManager.Item;
import com.sql.csse.EntityManager.Supplier;
import com.sql.csse.RepositoryManager.SRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SupplierService {

    @Autowired
    SRepo sRepo;

    @Transactional
    public List<Supplier> getAllSuppliers(){
        List<Supplier> suppliers = new ArrayList<>();
        Iterable<Supplier> supplierIterable = sRepo.findAll();

        Iterator<Supplier> supplierIterator = supplierIterable.iterator();

        while (supplierIterator.hasNext()){
            suppliers.add(supplierIterator.next());
        }

        return suppliers;
    }


   /* @Transactional
    public List<Item> getSupplierItems(int sid){

        List<Item> items = new ArrayList<>();
        List<Supplier> suppliers = sRepo.findAll();



        Iterator<Item> supplierIterator = supplierIterable.iterator();

        while (supplierIterator.hasNext()){
            suppliers.add(supplierIterator.next());
        }


    }*/
}
