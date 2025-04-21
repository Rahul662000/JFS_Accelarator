package arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr;
//		arr = new int[5];
//		
//		OR 
//		
//		int [] arr = new int[5];
		
		int[] marks = new int[] {10,20,30,40};
		
		int[] arr = new int[5];
		arr[0] = 100;
		arr[1] = 10;
		arr[2] = 200;
		arr[3] = 40;
		arr[4] = 70;
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		for(int values : arr) {
			System.out.println(values);
		}
	}

}
