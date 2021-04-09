package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.PGComponent;

public class PgTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
		PGComponent pgComponent=container.getBean(PGComponent.class);
		pgComponent.getOwnerName();
	}

}
