package day18arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {

		
		
		
		/* length i aynı olan 2 array oluşturunuz.
		   bu arrayların tüm elamanları aynı ise, ekrana aynı, yazdırın.
		   farklı ise ekrana farklı yazdırın
		 */
		
		/*
		 	//Length'i ayni olan iki array olusturunuz bu array'lerin tum elemanlari ayni ise 
		//ekrana "Ayni" yazdirin farkli ise ekrana "Farkli" yazdirin. (loop kullanin)
		
		char ch1[] = {'a', 'd', 'c', 'k'};
		char ch2[] = {'a', 'd', 'k', 'c'};
		
		//1.Yol
		int z = 0;
​
		for(int i=0; i<ch1.length; i++) {			
			if(ch1[i] == ch2[i]) {
				z++;
			}	
		}		
		if(z==ch1.length) {
			System.out.println("Ayni");
		}else {
			System.out.println("Ayni degil");
		} 
		 
		 */
		//===========================================
		
		int ch1 []= {'a','d','c','k'};
		int ch2 []= {'a','d','c','k'};
		
		// 2. YOL
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Aynı");
		}else {
			System.out.println("Farklı");
		}
		
		
		
		/*
		 1. YOL
		 
		int ch1 []= {'a','d','c','k'};
		int ch2 []= {'a','d','c','k'};
		int z = 0;
		
		
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] ==ch2[i] ) {
				z++;
				
			
			
		}if (z==ch1.length) {
			System.out.println("Ayni");
			
		}else {
			System.out.println("Aynı değil");
		}
		
		}
		
		
	*/	
		
		
		
		
	}

}
