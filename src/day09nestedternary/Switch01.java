package day09nestedternary;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

		/* Kullan�c�dan bir harf al�n, 
		    Harf 'a' veya 'A' ile ekrana '�lk Harf' yazd�r�n.
		    Harf 'b' veya 'B' ile ekrana '�kinci Harf' yazd�r�n.
		    Harf 'c' veya 'C' ile ekrana '���nc� Harf' yazd�r�n.
		    di�er durumlarda 'Tan�mlanamad�' yazd�r�n
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir hafr girin");
		char harf = scan.next ().charAt(0);
		
		if (harf == 'a'|| harf =='A') {
			System.out.println("�lk harf");
		} else if (harf == 'b'|| harf =='B') {
			System.out.println("�kinci Harf");
		} else if (harf == 'c'|| harf =='C') {
			System.out.println("���nc� harf");
		}else {
			System.out.println("Tan�mlanamad�");
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
