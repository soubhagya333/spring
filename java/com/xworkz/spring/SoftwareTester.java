package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.ArmyComponent;
import com.xworkz.spring.component.SoftwareComponent;

public class SoftwareTester {
	public static void main(String[] args) {
		String xmlFileName="init-spring.xml";
		ApplicationContext container=new ClassPathXmlApplicationContext(xmlFileName);
		SoftwareComponent refOfArmyComponent=container.getBean(SoftwareComponent.class);

		System.out.println(refOfArmyComponent.getName());
		System.out.println(refOfArmyComponent.getVendor());
		System.out.println(refOfArmyComponent.setType("mac"));
		System.out.println(refOfArmyComponent.setVersion("1.8"));
	}

}
