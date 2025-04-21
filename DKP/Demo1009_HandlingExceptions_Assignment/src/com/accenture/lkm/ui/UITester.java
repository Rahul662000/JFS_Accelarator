package com.accenture.lkm.ui;


import java.util.InputMismatchException;

import com.accenture.lkm.busisnessbean.Student;

public class UITester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student();
		try {
			stud.setStudId(1);
			stud.setStudName("Rahul");
			stud.setStudMark1(67.0);
			stud.setStudMark2(78.8);
			stud.setStudMark3(75.9);
			
			double Avg = (stud.getStudMark1()+stud.getStudMark2()+stud.getStudMark3())/3;
			System.out.println("The Average is : " + Avg);
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input! Please enter the correct data type.");
		}
		catch(ArithmeticException e) {
			System.out.println("Error in calculation: " + e.getMessage());
        } 
		finally {
            System.out.println("Program ended.");
        }
	}
}
	
