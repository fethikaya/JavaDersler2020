package day23daytime;

public class V01 {

	public static void main(String[] args) {

		
		// add (3,5); //8
		// add1 (3,5,7); // 15
		
		add (3,5,8,9,12,25,6,7);
		product (2,6,8,9,12);
		
	}
	
	/*
	public static void add (int s1, int s2) {
		System.out.println(s1 +s2);
		
	}
	public static void add1 (int s1, int s2, int s3) {
		System.out.println(s1 +s2+s3);
		
	}

	*/

	//------------------------------------------------------------
	
	// VARARGS  methodu 
	
	
	public static void add (int... x) {  // bu method her þey için çalýþýr. istediðinkadar sayý eklenir
		
		int sum = 0;
		for (int w : x) {
			sum = sum +w;
			
		}
		System.out.println(sum);
	}
	
	//--------------------------------------------------------
	
	public static void product (int...y) {
		
		int product = 1;
		for (int w : y) {
			product = product * w;
			
			
		}
		System.out.println(product);
	}
	
	
	
}
