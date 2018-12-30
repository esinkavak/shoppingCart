package com.example.demo.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> getCustomerList() {
		List<Customer> customerList = new ArrayList<>();
		Customer customer = new Customer();
		customer.setName("esin");
		customer.setLastName("kavak");
		customerList.add(customer);

		return customerList;
	}

}
