package com.example.demo;

import com.example.demo.repo.CustomerRepo;
import com.example.demo.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        CustomerService customerService = context.getBean(CustomerService.class);
        CustomerRepo customerRepo = context.getBean(CustomerRepo.class);
        System.out.println("CustomerService=========================>" + customerService.getClass());
        System.out.println("CustomerRepo=========================>" + customerRepo.getClass());
        System.out.println(customerService.getAllCustomers());
    }

}
