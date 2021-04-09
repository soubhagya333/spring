package com.xworkz.spring.tester;

import com.xworkz.spring.constants.FoodType;
import com.xworkz.spring.entity.FoodItemEntity;
import com.xworkz.spring.repositary.FoodItemRepositary;
import com.xworkz.spring.repositary.FoodItemRepositaryImpl;
import com.xworkz.spring.service.FoodItemService;
import com.xworkz.spring.service.FoodItemServiceImpl;

public class FoodItemTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodItemEntity entity = new FoodItemEntity("GheeRice", 80, FoodType.SOUTHINDIAN, 2, 23);
		FoodItemRepositary foodItemRepositary = new FoodItemRepositaryImpl(null);
		FoodItemService foodItemService = new FoodItemServiceImpl(foodItemRepositary);
		foodItemService.ValidateAndSave(entity);

	}

}
