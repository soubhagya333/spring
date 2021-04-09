package com.xworkz.spring.component;

public class CameraComponent {
	
	public CameraComponent() {
		System.out.println("created CameraComponent");
	}
	public void capture(String what) {
		System.out.println("invoked capture");
		System.out.println("org"+" " +what);
		
	}

}
