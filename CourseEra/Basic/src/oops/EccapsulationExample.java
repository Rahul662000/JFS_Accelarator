package oops;

class Person{
	
	private String firstName;
	
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}

public class EccapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		person.setFirstName("Rahul");
		System.out.println(person.getFirstName());
		person.setLastName("Singh");
		System.out.println(person.getLastName());
		
	}

}
