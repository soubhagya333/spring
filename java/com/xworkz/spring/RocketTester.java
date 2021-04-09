package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.RocketComponent;
public class RocketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlFileName="init-spring.xml";
		
		ApplicationContext container=new ClassPathXmlApplicationContext(xmlFileName);
		RocketComponent reRocketComponent=container.getBean(RocketComponent.class);
	
		System.out.println(reRocketComponent.getFuelType());
		System.out.println(reRocketComponent.getCountry());
		
		
	}

}
