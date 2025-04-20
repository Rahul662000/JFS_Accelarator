package com.accenture.lkm;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		Scanner sc = new Scanner(System.in);

		// Creating object of Customer class
		Customer customer1 = new Customer();

		// Setting values to the properties
		System.out.println("Enter Name of Customer : ");
		customer1.setCustName(sc.nextLine());
		System.out.println("Enter Customer ID: ");
		customer1.setCustId(sc.nextInt());
		System.out.println("Enter Customer Age: ");
		customer1.setCustAge(sc.nextInt());

		// Displaying customer1 details
		customer1.display();

		//Repeat the same for second object
		Customer customer2 = new Customer();
		System.out.println("Enter Name of Customer : ");
		customer2.setCustName(sc.nextLine());
		System.out.println("Enter Customer ID: ");
		customer2.setCustId(sc.nextInt());
		System.out.println("Enter Customer Age: ");
		customer2.setCustAge(sc.nextInt());

		customer2.display();

		sc.close();

	}

}
/*
 * Observe the object creation with new keyword
 */