package com.accenture.lkm;

public class Tester {

	public static void main(String[] args) {
		// Creating object of Customer class
		Customer customer1 = new Customer();
		

		customer1.setCustAge(24);
		customer1.setCustID(2);
		customer1.setCustName("Rahul");
				

		// Setting values to the properties by calling setter methods
		
		// Displaying customer1 details by calling getter methods
		customer1.display();
		
		// Creating object of Customer class
		Customer customer2 = new Customer();
		
		// Setting values to the properties by calling setter methods
		customer2.setCustAge(25);
		customer2.setCustID(4);
		customer2.setCustName("Rahul Singh");
		

		// Displaying customer details by calling getter methods
		customer2.display();
		
	}
}
/*
 * Observe the values are set by calling setter methods
 */
