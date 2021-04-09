package com.xworkz.spring.application_testers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import com.xworkz.spring.entity.CustomerEntity;
import com.xworkz.spring.service.CustomerService;
public class CustomerTesterAP {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		ApplicationContext container=new ClassPathXmlApplicationContext("lsfb.xml","app.xml");
		
		CustomerService service=container.getBean(CustomerService.class);
		
	     CustomerEntity entity = new CustomerEntity("unstoppable", "Soundatti", 
				5, 8884923476l,"unstoppabledk2d@gmail.com", "female");
		service.ValidateAndSave(entity);

	}

}
