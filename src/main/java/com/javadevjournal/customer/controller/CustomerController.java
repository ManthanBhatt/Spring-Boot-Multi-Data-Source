package com.javadevjournal.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.javadevjournal.customer.data.CustomerModel;
import com.javadevjournal.customer.repo.CustomerRepository;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    // Get All Notes
    @GetMapping("/customers")
    public List<CustomerModel> getAllNotes() {
        return customerRepository.findAll();
    }
}