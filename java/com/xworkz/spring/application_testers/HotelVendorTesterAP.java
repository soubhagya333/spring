package com.xworkz.spring.application_testers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import com.xworkz.spring.constants.HotelVendorType;
import com.xworkz.spring.entity.HotelVendorEntity;
import com.xworkz.spring.service.HotelVendorService;

public class HotelVendorTesterAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container=new ClassPathXmlApplicationContext("lsfb.xml");
		HotelVendorService service=container.getBean(HotelVendorService.class);
		
		HotelVendorEntity entity = new HotelVendorEntity("Kavya", "Hubbli", 5, 9880636360l,HotelVendorType.FIVE_STAR);
		service.ValidateAndSave(entity);

	}

}
