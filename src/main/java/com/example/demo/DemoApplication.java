package com.example.demo;

import com.example.demo.repo.CustomerRepo;
import com.example.demo.service.CustomerService;
import com.example.demo.textreader.TextFileReader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@SpringBootApplication
@EnableAspectJAutoProxy
public class DemoApplication implements CommandLineRunner {
    final CustomerService customerService;
    final TextFileReader textFileReader;
    final CustomerRepo customerRepo;

    public DemoApplication(CustomerService customerService, TextFileReader textFileReader, CustomerRepo customerRepo) {
        this.customerService = customerService;
        this.textFileReader = textFileReader;
        this.customerRepo = customerRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        customerService.getAllCustomers();
        textFileReader.readAllLines()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        CustomerService customerService = context.getBean(CustomerService.class);
//        CustomerRepo customerRepo = context.getBean(CustomerRepo.class);
//        customerService.getAllCustomers();
    }

}
