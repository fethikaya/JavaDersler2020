package day19arrays;

import java.util.Arrays;

public class A03 {

	public static void main(String[] args) {

		
		int arr1 [] = {1,2,3};
		int arr2 [] = {1,2,3};
		
		if (arr1 == arr2) {
			System.out.println("Same");
		}else {
			System.out.println("Not Same"); // E�it de�il, ��nk� hem eleman hem de adrese bakar.
											// elemanlar ayn�, ama adresler farkl�
											// bu y�zden not same return eder. 
		}
		
		
		int x1 [] = {1,2,3};
		int x2 [] = {1,2,3};
		
		if (Arrays.equals(x1, x2)) {
			System.out.println("Ayn�");
		}else {
			System.out.println("Farkl�");
		}
		
			
		// Burada e�itlik verri. 
		// ��nk� Arrays'ler de e�itli�e equals ile bak�yoruz.
		
	}

}
