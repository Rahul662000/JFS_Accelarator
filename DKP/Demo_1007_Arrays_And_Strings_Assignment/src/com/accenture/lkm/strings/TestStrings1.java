package com.accenture.lkm.strings;

import java.util.Scanner;

public class TestStrings1 {

	public static void main(String[] args) {
		//Accept 2 strings from the user and perform the following actions
		//Concatenate both the strings and convert into an uppercase
		//Verify both the strings are equal or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String : ");
		String str1 = sc.next();
		System.out.println("Enter second String : ");
		String str2 = sc.next();
		
		String str3 = str1+str2;
		System.out.println("Upper Case : " + str3.toUpperCase());
		
		if(str1 == str2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
	}
}
