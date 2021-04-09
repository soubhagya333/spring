package com.xworkz.spring.component.washing;

public class MotorComponent {
private int warrantPeriod;
	
	public void rotate(){
		System.out.println("motor rotataing");
		
	}

	public void setWarrantPeriod(int warrantPeriod) {
		System.out.println("setWarrantPeriod"+warrantPeriod);
		this.warrantPeriod = warrantPeriod;
	
	}

	@Override
	public String toString() {
		return "MotorComponent [warrantPeriod=" + warrantPeriod + "]";
	}
	

}
