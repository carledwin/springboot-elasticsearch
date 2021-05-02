package com.carledwinti.springboot.elastic.controller;

import com.carledwinti.springboot.elastic.model.Customer;
import com.carledwinti.springboot.elastic.repository.CustomerElasticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerElasticRepository customerElasticRepository;

    @GetMapping
    public Iterable<Customer> all(){
        return customerElasticRepository.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable String id){
        return customerElasticRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer){
        return customerElasticRepository.save(customer);
    }
}
