package com.xworkz.spring.component;

public class ClubComponent {
	private String trustName;
	private int totalMembers;

	public ClubComponent(String trustName, int totalMembers) {
		super();
		System.out.println("creating using param const,arg1" + totalMembers);
		this.trustName = trustName;
		this.totalMembers = totalMembers;
	}

	public ClubComponent(String trustName) {
		super();
		System.out.println("creating using param const,arg" + trustName);
		this.trustName = trustName;
	}

	public String getTrustName() {
		return trustName;
	}

}
