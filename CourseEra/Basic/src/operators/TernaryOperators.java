package operators;

public class TernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isAuth = true;
		
		if(isAuth) {
			System.out.println("You are Logged in Successfully");
		}
		else {
			System.out.println("You are not logged in");
		}
		
		String result = (isAuth) ? "LoggedIn" : "Not Logged In";
		System.out.println(result);
		
	}

}
