package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn. “Pazar” ise ekrana
“Hýristiyanlar icin kutsal gün” yazdýrýn
		 */
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir gün giriniz");
		
		String gun = scan.nextLine();
		
		if (gun.equals("cuma")) {
			System.out.println("Müslümanlar için kutsal gün");
			
		}
			
		if (gun.equals("cumartesi") )	{
			System.out.println("Yahudiler için kutsal gün");
		}
		
		if (gun.equals("pazar")) {
			System.out.println("Hristiyanlar için kutsal gün");
			
		}
			
		scan.close ();
			
	}

}
