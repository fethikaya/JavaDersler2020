package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {

		// Kullan�c�dan bir say� al�n, say� negatif ise ekrana "negatif" yazd�r�n
		// say� pozitif ise ekrana "pozitif" yazd�r�n.
		// say� s�f�r ise ekrana "n�tr" yaz�n
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir say� giriniz");
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
