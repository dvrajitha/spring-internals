package com.example.demo;

import com.example.demo.repo.CustomerRepo;
import com.example.demo.service.CustomerService;
import com.filereader.api.TextFileReader;
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
    final CustomerRepo customerRepo;
    final TextFileReader textFileReader;

    public DemoApplication(CustomerService customerService, CustomerRepo customerRepo, TextFileReader textFileReader) {
        this.customerService = customerService;
        this.customerRepo = customerRepo;
        this.textFileReader = textFileReader;
    }

    @Override
    public void run(String... args) throws Exception {
        // customerService.getAllCustomers();
        textFileReader.readAllLines()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
