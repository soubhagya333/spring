package com.xworkz.spring.application_testers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import com.xworkz.spring.constants.FoodType;

import com.xworkz.spring.entity.FoodItemEntity;
import com.xworkz.spring.service.FoodItemService;


public class FoodItemTesterAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext container=new ClassPathXmlApplicationContext("lsfb.xml");
		FoodItemService service=container.getBean(FoodItemService.class);
		
		FoodItemEntity entity = new FoodItemEntity("GheeRice", 80, FoodType.SOUTHINDIAN, 2, 23);
		service.ValidateAndSave(entity);
	}

}
