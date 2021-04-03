package day19arrays;

import java.util.Arrays;

public class A03 {

	public static void main(String[] args) {

		
		int arr1 [] = {1,2,3};
		int arr2 [] = {1,2,3};
		
		if (arr1 == arr2) {
			System.out.println("Same");
		}else {
			System.out.println("Not Same"); // Eþit deðil, çünkü hem eleman hem de adrese bakar.
											// elemanlar ayný, ama adresler farklý
											// bu yüzden not same return eder. 
		}
		
		
		int x1 [] = {1,2,3};
		int x2 [] = {1,2,3};
		
		if (Arrays.equals(x1, x2)) {
			System.out.println("Ayný");
		}else {
			System.out.println("Farklý");
		}
		
			
		// Burada eþitlik verri. 
		// Çünkü Arrays'ler de eþitliðe equals ile bakýyoruz.
		
	}

}
