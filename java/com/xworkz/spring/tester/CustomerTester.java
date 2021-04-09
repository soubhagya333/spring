package com.xworkz.spring.tester;

import com.xworkz.spring.entity.CustomerEntity;
import com.xworkz.spring.repositary.CustomerRepositaryImpl;
import com.xworkz.spring.repositary.CustomerRepository;
import com.xworkz.spring.service.CustomerService;
import com.xworkz.spring.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CustomerEntity entity = new CustomerEntity("unstoppable", "Soundatti", 
				5, 8884923476l,"unstoppabledk2d@gmail.com", "female");
		CustomerRepository customerRepository1 = new CustomerRepositaryImpl(null);
		CustomerService service = new CustomerServiceImpl(customerRepository1);
		service.ValidateAndSave(entity);
	}

}
