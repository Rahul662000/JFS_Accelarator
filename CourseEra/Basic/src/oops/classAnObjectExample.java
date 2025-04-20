package oops;

import java.util.Scanner;

class Students1{
	
//	Data members
	private int studentId;
	private String studentName;
	private int studentAge;
	
	Scanner sc  = new Scanner(System.in); 
	
//	Member Functions
	void acceptDetails() {
		
		System.out.print("Enter Student Id : ");
		studentId = sc.nextInt();
		System.out.print("Enter Student Name : ");
		studentName = sc.next();
		System.out.print("Enter Student Age : ");
		studentAge = sc.nextInt();
		
	}
	void displayDetails() {
		
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age : " + studentAge);
		
	}
}

class Marks extends Students1{
	private float objectiveMarks;
	private float subjectiveMarks;
	void acceptDetails() {
		super.acceptDetails();
		System.out.println("Enter Objective Marks : ");
		objectiveMarks = sc.nextFloat();
		System.out.println("Enter Subjective Marks : ");
		subjectiveMarks = sc.nextFloat();
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("Objective Marks : " + objectiveMarks);
		System.out.println("Subjective Marks : " + subjectiveMarks);
	}
}

public class classAnObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		students student1 = new students();
//		student1.acceptDetails();
//		student1.displayDetails();
		
		Marks marks = new Marks();
		marks.acceptDetails();
//		marks.acceptDetails1();
		marks.displayDetails();
//		marks.displayDetails1();
		
	}

}
