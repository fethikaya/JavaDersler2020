package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ifelseif02 {

	public static void main(String[] args) {

		/* Kullanýcýdan bir sayý alýn
		 bu harf 'a' ve ya 'A' ise ekrana ilk harf yazdýrýn
		 bu harf 'b' veya 'B' ise ikinci harf yazdýrýn
		 bu harf 'c' veya 'C' ise ekrana uçuncu harf yazýnýz
		 Diðer harfler için 'Sýrasýný bilmiyorum( yazýn
		 
		 */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lütfen bir harf giriniz");
		char harf = scan.next ().charAt(0);
		
		if (harf=='a'|| harf=='A') {
			System.out.println("Ýlk harf");
		} else if (harf=='b'|| harf=='B'){
			System.out.println("Ýkinci Harf");
		} else if (harf=='c'|| harf=='C') {
  	    	 System.out.println("Ucuncu Harf");
  	     }else {
  	    	 System.out.println("Sirasýný bilmiyorum");
  	     }
		
		
		scan.close ();
		
		
		
	}

}
