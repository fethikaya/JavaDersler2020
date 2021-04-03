package day04scanner;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		byte b1 = 13;
		int i1 = b1;
		System.out.println(b1);
		

		short s1 = 2300;
		float f1 = s1;
		System.out.println(s1);
		System.out.println(f1);
		
		
		short s2 = 3000;
		byte b2 = (byte) s2;
		System.out.println(b2);
		
		double d1 = 32.15;
		float f2 = (float) d1;
		System.out.println(f2);
		
		short s3 =1200;
		byte b3 = (byte) s3;
		System.out.println(s3);
		System.out.println(b3);
		
		//Asagidaki hata kac farkli sekilde duzeltilebilir?
				// Asagidaki comment'i kaldirinca 2.34 un alti kirmizi cizgi olur
				
				//            float f3 = 2.34;  
				//1) 2.34 den sonra f yazabiliriz ==> float f3 = 2.34f;
				//2) 2.34 un onune float yazariz ==> float f3 = (float)2.34;
				//3) Data type'ini double' a cevirin ==> double f3 = 2.34;
		
		
		
		
				
		
	}

}
