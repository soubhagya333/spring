package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.CameraComponent;
import com.xworkz.spring.component.JailComponent;

public class MadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String xmlFileName="welcome.xml";
		String xmlFileName1="welcome2.xml";
      ApplicationContext container=new ClassPathXmlApplicationContext(xmlFileName,xmlFileName1);
//      
//      CameraComponent refOfCameraComponent=spring.getBean(CameraComponent.class);
//      
//      refOfCameraComponent.capture("Mad pic");
      
      int no=container.getBeanDefinitionCount();
      System.out.println("no of beans"+no);
      
      
	}

}
