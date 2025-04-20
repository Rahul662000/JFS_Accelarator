package com.accenture.lkm;

public class Tester {

	public static void main(String[] args) {
		// Creating object of Employee class by invoking a parameterized constructor
		Employee employee1 = new Employee(10001, "JAS", 45000.0, "LKM");
		
		//Java will not create any system defined constructor
		//uncomment below line and observe
		//Employee employee3=new Employee();

		// Displaying Employee details
		employee1.display();

		// Creating object of Employee class by invoking a non parameterized constructor
		Employee employee2 = new Employee(10002, "MSD", 55000.0, "LKM");

		// Displaying Employee details
		employee2.display();

		Customer customer1 = new Customer(1,"Rahul Singh",24);
		customer1.display();

		Customer customer2 = new Customer(2,"Rahul Thakur",25);
		customer2.display();
	}

}
/*
 * Observe the constructor invoked for every object creation
 */
