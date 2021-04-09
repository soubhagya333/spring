package com.xworkz.itc;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItcTester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
	  
		ITCProduct itcProduct=container.getBean(ITCProduct.class);
		itcProduct.displayDetails();
	}

}
