package com.xworkz.spring.tester;

import com.xworkz.spring.constants.HotelVendorType;
import com.xworkz.spring.entity.HotelVendorEntity;
import com.xworkz.spring.repositary.HotelVendorRepositary;
import com.xworkz.spring.repositary.HotelVendorRepositoryImpl;
import com.xworkz.spring.service.HotelVendorService;
import com.xworkz.spring.service.HotelVendorServiceImpl;

public class HotelVendorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelVendorEntity entity = new HotelVendorEntity("Kavya", "Hubbli", 5, 9880636360l, 
				HotelVendorType.FIVE_STAR);
		HotelVendorRepositary hotelVendorRepositary = new HotelVendorRepositoryImpl(null);
		HotelVendorService hotelVendorService = new HotelVendorServiceImpl(hotelVendorRepositary);

		boolean getValid = hotelVendorService.ValidateAndSave(entity);
		if (getValid) {
			System.out.println("Can save entity");
			hotelVendorRepositary.save(entity);
		} else {
			System.out.println("Cannot save!!");

		}
	}

}
