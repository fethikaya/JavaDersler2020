package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ifelseif02 {

	public static void main(String[] args) {

		/* Kullan�c�dan bir say� al�n
		 bu harf 'a' ve ya 'A' ise ekrana ilk harf yazd�r�n
		 bu harf 'b' veya 'B' ise ikinci harf yazd�r�n
		 bu harf 'c' veya 'C' ise ekrana u�uncu harf yaz�n�z
		 Di�er harfler i�in 'S�ras�n� bilmiyorum( yaz�n
		 
		 */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("L�tfen bir harf giriniz");
		char harf = scan.next ().charAt(0);
		
		if (harf=='a'|| harf=='A') {
			System.out.println("�lk harf");
		} else if (harf=='b'|| harf=='B'){
			System.out.println("�kinci Harf");
		} else if (harf=='c'|| harf=='C') {
  	    	 System.out.println("Ucuncu Harf");
  	     }else {
  	    	 System.out.println("Siras�n� bilmiyorum");
  	     }
		
		
		scan.close ();
		
		
		
	}

}
