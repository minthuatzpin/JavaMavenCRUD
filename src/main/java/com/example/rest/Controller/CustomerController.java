package com.example.rest.Controller;

import com.example.rest.Models.Customer;
import com.example.rest.Repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping(value = "/customer/save")
    public String saveCustomer(@RequestBody Customer customer){
        customerRepo.save(customer);
        return "saved";
    }
}
