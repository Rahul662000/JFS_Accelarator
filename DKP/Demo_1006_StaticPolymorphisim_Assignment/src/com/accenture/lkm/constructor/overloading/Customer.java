package com.accenture.lkm.constructor.overloading;

public class Customer {
	
	private int custId;
	private String custName;
	private int custAge;
	
	public Customer() {
		System.out.println("Default Non Parameterized consturtor Called.");
	}
	
	public Customer(int custId, String custName, int custAge) {
		System.out.println("Parameterized consturtor Called.");
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
	}

	void display() {
		System.out.println("Customer Id : " + custId);
		System.out.println("Customer Name : " + custName);
		System.out.println("Customer Age : " + custAge);
	}

}
