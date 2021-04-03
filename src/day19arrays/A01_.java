package day19arrays;

import java.util.Arrays;

public class A01_ {

	public static void main(String[] args) {

		// Bir elaman�n array'da olup olumda��n� kontrol etme y�ntemi..
		
		int nrr [] = {2,1,7,3,5};
		
		// Yukar�daki (nrr) array'�n de '7' elaman�n�n olup olmad��n� kontrol edin.
		
	
		// 2. yol binarySearch () kullanarak
			// �nce sort edilir. sort kullan�l�r. 
		
		Arrays.sort(nrr);
		Arrays.binarySearch(nrr, 7);
		
		System.out.println(Arrays.binarySearch(nrr, 7));
		
		System.out.println(Arrays.binarySearch(nrr, 4)); // -4
		// -4 (- yok demek, 4 e�er olsayd� 4. s�rada olurdu anlam�na geliyor.
		
		
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