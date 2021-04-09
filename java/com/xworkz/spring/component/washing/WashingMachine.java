package com.xworkz.spring.component.washing;

public class WashingMachine {

	private String companyName;
	private float capacity;
	private MotorComponent motor;
	private PowerComponent power;

	public WashingMachine() {
		System.out.println("created washing machine"+ this.getClass().getSimpleName());
	}

	public void wash() {
		if (power.on) {

			System.out.println("invoked machine started:");
			this.motor.rotate();

		}
	}

	

	
	public void setCapacity(float capacity) {
		System.out.println("invoked setCapacity" + capacity);
		this.capacity = capacity;
	}

	public void setCompanyName(String companyName) {
		System.out.println("invoked setCompanyName" + companyName);
		this.companyName = companyName;
	}

	public void setMotor(MotorComponent motor) {
		System.out.println("invoked setMotor" + motor);
		this.motor = motor;
	}

	public void setPower(PowerComponent power) {
		System.out.println("invoked setPower" + power);
		this.power = power;
	}

	@Override
	public String toString() {
		return "WashingMachine [companyName=" + companyName + ", capacity=" + capacity + ", motor=" + motor + ", power="
				+ power + "]";
	}

}
