package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {

			/* Kullanýcýdan sayý alýn, 
			 * bu sayý 0 dan 9'a kadar ise ekrana 'Rakam' yazdýr
			 * eðer bu sayý 9 dan büyük veya 0 dan küçük ise ekrana 'Sayý' yýzdýrýn
			 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir sayý giriniz");
		int num = scan.nextInt();
		
		if (num>=0 && num<9) {
		System.out.println("Rakam");
		
	}

		
		if (num <0 ||num >9 ) {
			
			System.out.println("Sayý");
		}
  scan.close ();

	
	}
	
	
	}
