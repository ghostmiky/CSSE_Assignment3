package com.sql.csse.ControllerManager;

import com.google.gson.Gson;
import com.sql.csse.EntityManager.Payment;
import com.sql.csse.RepositoryManager.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Payment")
public class PaymentController {


    @Autowired
    PaymentRepo paymentRepo;

    Payment payment;


    @RequestMapping(method = RequestMethod.POST , value = "/savePayment" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Payment> savePayments(@RequestBody String payments){

        Gson gson = new Gson();
        payment = gson.fromJson(payments,Payment.class);

        paymentRepo.save(payment);

        return paymentRepo.findAll();

    }

    @RequestMapping(method = RequestMethod.GET , value = "/getAllPayments" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Payment> getAllPayments(){ return paymentRepo.findAll();}
}
