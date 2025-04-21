package com.accenture.lkm.arrays;

import java.util.Scanner;

public class TestArrays1 {

	public static void main(String[] args) {
		//Declare a double array that accepts 5 student marks
		//Calculate and display the sum and average of the marks.
		
		Scanner sc = new Scanner(System.in);
		double[] marks = new double[5];
		System.out.println("Enter Marks");
		for(int i = 0 ; i < 5 ; i++) {
			marks[i] = sc.nextDouble();
		}
		int sum = 0;
		for(int i = 0 ; i < 5 ; i++) {
			sum += marks[i];
		}
		System.out.println("Sum is : " + sum);
		System.out.println("Average is : " + sum/5);
		
	}
}
