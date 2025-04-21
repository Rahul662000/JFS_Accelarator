package com.accenture.lkm.constructor.overloading;

public class Tester {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		Customer cust2 = new Customer(1,"Rahul",24);
		
	}

}
/*
 * Sometimes there is a need of initializing an object in different ways. 
 * This can be done using constructor overloading.
 * 
 * Observe Employee Object created in Three different Ways
 * 
 * Overloaded constructor is called based upon the parameters specified when new is executed
 */
