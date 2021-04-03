package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {

		// Kullanýcýdan bir sayý alýn, sayý negatif ise ekrana "negatif" yazdýrýn
		// sayý pozitif ise ekrana "pozitif" yazdýrýn.
		// sayý sýfýr ise ekrana "nötr" yazýn
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir sayý giriniz");
		int sayi = scan.nextInt();
		
		if (sayi < 0) {
			System.out.println("Negatif");
		}
		
		if (sayi>0) {
			System.out.println("Pozitif");
		}

		if (sayi == 0) {
			System.out.println("Notr");
		}
		
		scan.close ();
		
		
	}

}
