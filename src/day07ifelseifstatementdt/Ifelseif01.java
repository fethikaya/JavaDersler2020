package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ifelseif01 {

	public static void main(String[] args) {
		
		/* Kullan�cadan say� al�n,
		 say� s�f�rdan b�y�k ise ekrana 'Pozitif' yazd�r�n
		 say� s�f�r ise ekrana 'Notr' yaz�n
		 say� s�f�rdan k���k ise ekrana ' Negatif' yaz�n�z
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir say� giriniz");
		double s = scan.nextDouble();
		
		if (s>0) {
			System.out.println("Pozitif");
		}
		
		if (s==0) {
			System.out.println("Notr");
			
		}else {
			System.out.println("Negatif");
		}
	
		
		scan.close ();
		
		
		
		
		
		
		
	
	
	
	
	
	}

}
