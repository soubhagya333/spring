package com.xworkz.spring.component;

public class ArmyComponent {
  private String contry;
  private String strength;
  private String type;
public ArmyComponent(String contry) {
	super();
	this.contry = contry;
}
public String getContry() {
	return contry;
}
  public String setStrength(String strength) {
	return this.strength = strength;
}
  public String setType(String type) {
	return this.type = type;
}
  
}
