package com.xworkz.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.xworkz.spring.constants.FoodType;


import lombok.Data;
import lombok.EqualsAndHashCode;

import lombok.ToString;


@Data
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "item")
public class FoodItemEntity {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRICE")
	private int price;
	@Column(name = "FOOD_TYPE")
	private FoodType foodtype;
	@Column(name = "QUANTITY")
	private int quantity;
	@Column(name = "DISCOUNT")
	private int discount;
	public FoodItemEntity(String name, int price, FoodType foodtype, int quantity, int discount) {
		super();
	
		this.name = name;
		this.price = price;
		this.foodtype = foodtype;
		this.quantity = quantity;
		this.discount = discount;
	}
	

	
	}
	






