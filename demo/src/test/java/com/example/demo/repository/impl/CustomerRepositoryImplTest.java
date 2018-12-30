package com.example.demo.repository.impl;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CustomerRepositoryImplTest {

	@Autowired
	CustomerRepository customerRepository;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCustomerList() {
		List<Customer> customerList = customerRepository.getCustomerList();
		Assert.assertNotNull(customerList);
	}

}
