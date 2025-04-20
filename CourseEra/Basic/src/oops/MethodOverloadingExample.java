package oops;

class Calculator{
	
	public static int addition(int num1 , int num2) {
		return num1+num2;
	}
	
	public static int addition(int num1 , int num2 , int num3) {
		return num1+num2+num3;
	}
	
	public static float addition(float num1 , float num2 , float num3) {
		return num1+num2+num3;
	}
	
}

public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.addition(1,2));
		System.out.println(Calculator.addition(1,2,3));
		System.out.println(Calculator.addition(1.2F,2.5F,5.6F));

	}

}
