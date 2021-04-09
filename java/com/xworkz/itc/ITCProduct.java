package com.xworkz.itc;

public class ITCProduct {
	private String name;
	private String type;
	private String expDate;
	public ITCProduct(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public String setType(String type) {
		return this.type = type;
	}
	public String setExpDate(String expDate) {
		return this.expDate = expDate;
	}
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("details");
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.expDate);


	}

}
