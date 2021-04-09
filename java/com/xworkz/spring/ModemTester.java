package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.ModemComponent;

public class ModemTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String xmlFileName="init-spring.xml";
		ApplicationContext container=new ClassPathXmlApplicationContext(xmlFileName);

		
		ModemComponent refOfModem=container.getBean(ModemComponent.class);
		//refOfModem.getCompanyName();
		System.out.println(refOfModem.getCompanyName());
	}

}
