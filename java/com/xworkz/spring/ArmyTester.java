package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.ArmyComponent;



public class ArmyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String xmlFileName="init-spring.xml";
		
		ApplicationContext container=new ClassPathXmlApplicationContext(xmlFileName);
		ArmyComponent refOfArmyComponent=container.getBean(ArmyComponent.class);

		
		System.out.println(refOfArmyComponent.getContry());
	
		System.out.println(refOfArmyComponent.setType("indian"));
		System.out.println(refOfArmyComponent.setStrength("bold"));
		
	}

}
