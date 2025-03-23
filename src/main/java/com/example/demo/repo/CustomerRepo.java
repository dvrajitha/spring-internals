package com.example.demo.repo;

import com.example.demo.annotations.Timed;
import com.example.demo.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerRepo {
    @Timed
    public List<Customer> findAllCustomers() {
        return List.of(Customer.builder()
                .id(1000L)
                .firstName("John")
                .lastName("Doe")
                .build());
    }
}
