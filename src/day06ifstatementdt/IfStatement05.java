package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {

			/* Kullan�c�dan say� al�n, 
			 * bu say� 0 dan 9'a kadar ise ekrana 'Rakam' yazd�r
			 * e�er bu say� 9 dan b�y�k veya 0 dan k���k ise ekrana 'Say�' y�zd�r�n
			 */

		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir say� giriniz");
		int num = scan.nextInt();
		
		if (num>=0 && num<9) {
		System.out.println("Rakam");
		
	}

		
		if (num <0 ||num >9 ) {
			
			System.out.println("Say�");
		}
  scan.close ();

	
	}
	
	
	}
