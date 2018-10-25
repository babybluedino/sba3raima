package com.customer.service;

import java.util.List;

import com.customer.model.Customer;


public interface CustomerService {

	List<Customer> getAllCustomers();
	void addCustomer(Customer customer);

}

//This line added to make changes to the existing file
