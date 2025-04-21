package operators;

public class AssigmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 20;
		int num3;
		
		num3 = num1;
		System.out.println("Num3 = Num1 : " + num3);
		num1 += num3;
		System.out.println("Num1 += Num3 : " + num1);
		num1 -= num2;
		System.out.println("Num1 -= Num2 : " + num1);
		num1 *= num3;
		System.out.println("Num1 *= Num3 : " + num1);
		num1 /= num3;
		System.out.println("Num1 /= Num3 : " + num1);
		num1 %= num3;
		System.out.println("Num1 %= Num3 : " + num1);

	}

}
