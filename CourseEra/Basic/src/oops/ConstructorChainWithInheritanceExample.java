package oops;

class Person1{
	String name;
	public Person1() {
		System.out.println("Person Class Constructor Invoked.");
		name = "Unknown";
	}
}

class Employee extends Person1{
	String designation;
	public Employee() {
		super(); // By default called
		System.out.println("Employee Class Constructor Invoked.");
		designation = "Manager";
	}
}

public class ConstructorChainWithInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
	}

}
