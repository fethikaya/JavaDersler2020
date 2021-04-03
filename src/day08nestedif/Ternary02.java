package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {

		/* 
		  Kullanýcýdan bir üçgenin  üç kenar uzunluðunu alýn 
		  eðer üç kenar uzunluðu birbirine eþit ise ekrana
			“Eþkenar üçgen” yazdýrýn. Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn.
		 
		 */
		
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen Üçgenin keran uzunluklarýný giriniz");
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		int kenar3 = scan.nextInt();
		
		
		String ucgen = kenar1==kenar2 && kenar1==kenar3 ? "Eþkennar Uçgen" : "Eþgenar deðil";
		System.out.println(ucgen);
		
		
		scan.close ();
		
		
	}

}
