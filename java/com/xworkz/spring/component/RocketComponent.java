package com.xworkz.spring.component;

public class RocketComponent {

	private String fuelType;
	private String country;
	public RocketComponent(String fuelType, String country) {
		super();
		this.fuelType = fuelType;
		this.country = country;
	}
	public String getFuelType() {
		return fuelType;
	}
	public String getCountry() {
		return country;
	}
	
}
