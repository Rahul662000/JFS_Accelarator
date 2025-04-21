package arrays;

public class StringManipulationExample {

//	Immutable
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String literal
		String str1 = "Hello World!";
		System.out.println(str1);
		
//		String Object
		String str2 = new String("Rahul");
		System.out.println(str2);
		
//		Concatinating
		String str3 = str1 + str2;
		System.out.println(str3);
		
		System.out.println(str3.length());
		System.out.println(str3.charAt(0));
		System.out.println(str1.concat(str2));
		System.out.println(str3.substring(0,5));
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.contains("Hello"));
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		System.out.println(str3.trim());
		
	}

}
