package day09nestedternary;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

		/* Kullanýcýdan bir harf alýn, 
		    Harf 'a' veya 'A' ile ekrana 'Ýlk Harf' yazdýrýn.
		    Harf 'b' veya 'B' ile ekrana 'Ýkinci Harf' yazdýrýn.
		    Harf 'c' veya 'C' ile ekrana 'Üçüncü Harf' yazdýrýn.
		    diðer durumlarda 'Tanýmlanamadý' yazdýrýn
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir hafr girin");
		char harf = scan.next ().charAt(0);
		
		if (harf == 'a'|| harf =='A') {
			System.out.println("Ýlk harf");
		} else if (harf == 'b'|| harf =='B') {
			System.out.println("Ýkinci Harf");
		} else if (harf == 'c'|| harf =='C') {
			System.out.println("Üçüncü harf");
		}else {
			System.out.println("Tanýmlanamadý");
		}
		

		
		// 2. yol
		
		switch(harf) {		
	    case 'a':
	    case 'A':
	    	System.out.println("Ilk harf");
	    	break;
	    case 'b':
	    case 'B':
	    	System.out.println("Ikinci harf");
	    	break;
	    case 'c':
	    case 'C':
	    	System.out.println("Ucuncu harf");
	    	break;
	    default:
	    	System.out.println("Tanimlanamadi");	
	}

		
		scan.close ();
		
		
		
	}

}
