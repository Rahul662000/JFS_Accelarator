package com.accenture.lkm.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.accenture.lkm.busisnessbean.Student;

import exceptions.NotEligibleScholarShipException;

public class UITester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
		        Student stud = new Student();

		        try {
		            System.out.print("Enter Student ID: ");
		            int id = sc.nextInt();
		            sc.nextLine(); // clear buffer

		            System.out.print("Enter Student Name: ");
		            String name = sc.nextLine();

		            System.out.print("Enter Marks 1: ");
		            double mark1 = sc.nextDouble();

		            System.out.print("Enter Marks 2: ");
		            double mark2 = sc.nextDouble();

		            System.out.print("Enter Marks 3: ");
		            double mark3 = sc.nextDouble();

		            // Set values
		            stud.setStudId(id);
		            stud.setStudName(name);
		            stud.setStudMark1(mark1);
		            stud.setStudMark2(mark2);
		            stud.setStudMark3(mark3);

		            // Calculate average
		            double avg = (mark1 + mark2 + mark3) / 3;

		            System.out.printf("The average marks for %s is: %.2f%n", name, avg);

		            // Check scholarship eligibility
		            if (avg >= 80) {
		                System.out.println("Congratulations! You are eligible for a scholarship.");
		            } else {
		                throw new NotEligibleScholarShipException("Sorry, you are not eligible for the scholarship.");
		            }

		        } catch (InputMismatchException e) {
		            System.out.println("Invalid input! Please enter numeric values for marks.");
		        } catch (ArithmeticException e) {
		            System.out.println("Arithmetic error occurred: " + e.getMessage());
		        } catch (NotEligibleScholarShipException e) {
		            System.out.println("Scholarship Check Failed: " + e.getMessage());
		        } finally {
		            sc.close();
		            System.out.println("Process completed.");
		        }
		    }
}
