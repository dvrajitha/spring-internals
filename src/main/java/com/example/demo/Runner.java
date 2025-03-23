package com.example.demo;

import com.example.demo.repo.CustomerRepo;
import com.example.demo.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RunnerApplicationConfig.class);
        context.registerShutdownHook();
        CustomerService customerService = context.getBean(CustomerService.class);
        CustomerRepo customerRepo = context.getBean(CustomerRepo.class);
        System.out.println("customerService: " + customerService.getClass());
        System.out.println("customerRepo: " + customerRepo.getClass());
        customerService.getAllCustomers()
                .forEach(customer -> System.out.println(customer));
    }
}
