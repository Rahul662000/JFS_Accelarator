package arrays;

public class StringBufferAndStringBuilderExample {

//	Mutable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime1 = System.currentTimeMillis();
		
//		Thread Safe
		StringBuffer buffer = new StringBuffer("Hello World");
		System.out.println(buffer.capacity());
//		buffer.append("World");
//		System.out.println(buffer);
		for(int i = 0 ; i< 10000 ; i++) {
			buffer.append("World");
		}
		System.out.println("Time Taken By String Buffer : " + (System.currentTimeMillis() - startTime1));
		
		
		long startTime2 = System.currentTimeMillis();
//		Thread not safe
		StringBuilder builder = new StringBuilder("Hello World");
		System.out.println(builder.capacity());
//		builder.append("World");
//		System.out.println(builder);
		for(int i = 0 ; i< 10000 ; i++) {
			builder.append("World");
		}
		System.out.println("Time Taken By String Builder : " + (System.currentTimeMillis() - startTime2));

	}

}
