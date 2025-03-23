package com.example.demo.service.impl;

import com.example.demo.annotations.Timed;
import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepo;
import com.example.demo.service.CustomerService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class CustomerServiceImpl implements CustomerService {
    final CustomerRepo customerRepo;

    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    @Timed
    public List<Customer> getAllCustomers() {
        System.out.println("===========================>3" + getClass());
        return customerRepo.findAllCustomers();
    }
}
