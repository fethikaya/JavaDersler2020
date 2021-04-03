package day19arrays;

import java.util.Arrays;

public class A01_ {

	public static void main(String[] args) {

		// Bir elamanýn array'da olup olumdaðýný kontrol etme yöntemi..
		
		int nrr [] = {2,1,7,3,5};
		
		// Yukarýdaki (nrr) array'ýn de '7' elamanýnýn olup olmadðýný kontrol edin.
		
	
		// 2. yol binarySearch () kullanarak
			// önce sort edilir. sort kullanýlýr. 
		
		Arrays.sort(nrr);
		Arrays.binarySearch(nrr, 7);
		
		System.out.println(Arrays.binarySearch(nrr, 7));
		
		System.out.println(Arrays.binarySearch(nrr, 4)); // -4
		// -4 (- yok demek, 4 eðer olsaydý 4. sýrada olurdu anlamýna geliyor.
		
		
		int mrr [] = {1,3,8,3,11};
		Arrays.sort(mrr); // 1,3,3,8,11
		Arrays.binarySearch(mrr, 3);
		System.out.println(Arrays.binarySearch(mrr, 3)); // 1 veya 2 
		
		
		
		/*
		 
		 
		 
		 
		// 1. Yol (loop ile)
		
		int count = 0;
		for (int i = 0; i<nrr.length; i++) {
			if (nrr [i] ==7) {
				count++;
				
			}
		}
	 if (count !=0) {
		System.out.println("7 elmaan olarak var");
	}else {
		System.out.println("7 elaman olarak yok");
	}

		 */
		
		
		
	}
}