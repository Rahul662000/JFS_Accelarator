package Basics;

public class TypeCasting {
	
	public static void main(String[] args) {
		
//		Implicit TypeCasting
		int intValue = 100;
		long longValue = intValue;
		double doubleValue = longValue;
		
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(doubleValue);
		
//		Explicit Type Casting
		double doubleValue1 = 100.56;
		int intValue1 = (int) doubleValue1;
		
		System.out.println(doubleValue1);
		System.out.println(intValue1);
		
	}
	
}
