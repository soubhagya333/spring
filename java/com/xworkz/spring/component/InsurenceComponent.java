package com.xworkz.spring.component;

public class InsurenceComponent {
	public InsurenceComponent() {
		// TODO Auto-generated constructor stub
		System.out.println("created"+getClass().getSimpleName());
	}

	public String policyName() {
		// TODO Auto-generated method stub
		System.out.println("invoked ");
		return "jeevananand";
	}
}
