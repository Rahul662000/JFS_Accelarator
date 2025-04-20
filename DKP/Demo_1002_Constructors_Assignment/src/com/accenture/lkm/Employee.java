package com.accenture.lkm;

//Creating Employee class with parameterized constructor  
public class Employee {

	// private data member
	private int employeeId;
	private String employeeName;
	private double salary;
	private String department;
	
	//Employee class parameterized constructor
	public Employee(int employeeId, String employeeName, double salary, String department) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}
	// display method to print employee details
	public void display() {
		System.out.println("Employee Details are:");
		System.out.println("===========================");
		System.out.println("Employee ID         : " + employeeId);
		System.out.println("Employee Name       : " + employeeName);
		System.out.println("Employee Salary     : " + salary);
		System.out.println("Employee Department : " + department);
	}

	
}
/*
 * Java compiler automatically not creates a default constructor when user defined constructor is found 
 * in the class 
 */