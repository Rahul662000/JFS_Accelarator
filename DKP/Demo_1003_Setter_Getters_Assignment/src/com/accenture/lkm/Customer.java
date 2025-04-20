package com.accenture.lkm;

public class Customer {

	private int custID;
	private String custName;
	private int custAge;
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	
	public void display() {
        // TODO Auto-generated method stub
        System.out.println("Customer Name : " + custName);
        System.out.println("Customer ID : " + custID);
        System.out.println("Customer Age : " + custAge);
    }
}
