package oops;

class Students{
	
	private int studentId;
	private String studentName;
	private int studentAge;
	
	public Students() {
		this(101,"Rahul Singh",25);
//		this.studentId = 100;
//		this.studentName = "Rahul";
//		this.studentAge = 24;
	}
	
	public Students(int sId , String sName , int sAge) {
		this(102,32,"Thakur");
//		this.studentId = sId;
//		this.studentName = sName;
//		this.studentAge = sAge;
	}
	
	public Students(int sId , int sAge , String sName) {
		this.studentId = sId;
		this.studentName = sName;
		this.studentAge = sAge;
	}
	
	void displayDetails() {
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age : " + studentAge);
	}
	
}

public class ConstructorChainingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students student = new Students();
		student.displayDetails();
		
	}

}
