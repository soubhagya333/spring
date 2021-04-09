package com.xworkz.spring.component;

public class SoftwareComponent {
private String name;
private String vendor;
private String version;
private String type;
public SoftwareComponent(String name, String vendor) {
	super();
	this.name = name;
	this.vendor = vendor;
}
public String getName() {
	return name;
}
public String getVendor() {
	return vendor;
}
public String setVersion(String version) {
	return this.version = version;
}
public String setType(String type) {
	return this.type = type;
}
}
