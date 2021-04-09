package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.JailComponent;

public class JailTester {
public static void main(String[] args) {
	
	String xmlFileName="welcome.xml";
	ApplicationContext container=new ClassPathXmlApplicationContext(xmlFileName);
	
	JailComponent refOfComponent=container.getBean(JailComponent.class);
			refOfComponent.punishment();
	
	
}
}
