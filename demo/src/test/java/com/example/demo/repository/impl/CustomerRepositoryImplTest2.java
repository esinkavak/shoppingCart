package com.example.demo.repository.impl;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootTest
public class CustomerRepositoryImplTest2 {

	@Mock
	CustomerRepository customerRepository;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		when(customerRepository.getCustomerList()).thenReturn(customerListMock());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCustomerList() {
		List<Customer> customerList = customerRepository.getCustomerList();
		Assert.assertEquals(1, customerList.size());
	}

	List<Customer> customerListMock() {
		List<Customer> customerListMock = new ArrayList();
		Customer customer = new Customer();
		customer.setName("TEST NAME");
		customer.setLastName("TEST LAST NAME");
		customerListMock.add(customer);

		Customer customer2 = new Customer();
		customer2.setName("TEST NAME");
		customer2.setLastName("TEST LAST NAME");
		customerListMock.add(customer2);
		return customerListMock;
	}

}
