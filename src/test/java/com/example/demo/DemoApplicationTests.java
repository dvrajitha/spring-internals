package com.example.demo;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	CustomerService customerService;
	@Test
	void testGetAllCustomers() {
		List<Customer> customers = customerService.getAllCustomers();
		assertThat(customers).isNotEmpty();
	}

}
