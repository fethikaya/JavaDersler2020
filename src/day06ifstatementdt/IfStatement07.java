package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement07 {

	public static void main(String[] args) {
		
		
		
		/* Kullan�c�dan bir ��genin  �� kenar uzunlu�unu al�n 
		    e�er �� kenar uzunlu�u birbirine e�it ise ekrana  �E�kenar ��gen� yazd�r�n. 
		    Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n.
		 */
		
			Scanner scan = new Scanner (System.in);
		    	System.out.println("U�genin kenar uzunluklar�n� giriniz");
		    int kenar1 = scan.nextInt();
		    int kenar2 = scan.nextInt();
		    int kenar3 = scan.nextInt();
		    if (kenar1==kenar2&& kenar1==kenar3) {
		    	System.out.println("E�kenar u�gen");
		    }else {
		    	System.out.println("E�kenar u�gen de�il");
		    }
		    
		    
		    
		    
		
		/* Kullan�c�dan bir tamsay� al�n 
		   e�er tamsay� 10 dan kucuk ve 0�dan b�y�k e�it ise ekrana  �Rakam� yazd�r�n. 
		   Di�er durumlarda ekrana �Say�� yazd�r�n.
		 */

		 
		 	System.out.println("L�tfen bir tam say� giriniz");
		int tams = scan.nextInt();
		
		if (tams >=0 && tams<10) {
			System.out.println("Rakam");
		}else {
			System.out.println("Say�");
		}
		
		
		
		/*  Kullan�c�dan iki say� al�n 
		 * e�er say�lar�n i�aretleri  ayn� ise ekrana �Ayn� i�aretli� yazd�r�n. 
		 * Say�lar�n i�aretleri  farkl� ise ekrana �Farkl� i�aretli� yazd�r�n.
		 */

		
		
			System.out.println("L�tfen iki say� giriniz");
		int sayia = scan.nextInt();
		int sayib = scan.nextInt();
		if (sayia<0 && sayib<0) {
			System.out.println("Ayni i�aretli say�");
		}else {
			System.out.println("Farkl� i�aretli say�");
		
		}
		
		
		
		
	/* Kullan�c�dan bir harf al�n 
	 * e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n. 
	 * �b, c, d, f� den biri ise ekrana �Sessiz harf� yazd�r�n.
	 */
	
		
		System.out.println("L�tfen bir harf giriniz");
		
		char harf = scan.next ().charAt(0);
				
		if (harf=='a'||harf =='e'||harf == 'i'||harf== 'o'||harf=='u') {
			System.out.println("Sesli harf");
		}
		
			System.out.println("L�tfen ba�ka harf giriniz");
		char harf1 = scan.next ().charAt(0);
		if (harf1 == 'b'|| harf1== 'c'|| harf1=='d'||harf1=='f') {
			System.out.println("Sesiz harf");
			
		} else {
		 System.out.println("Farkli harf");
		}
			
		
		
		
	/* Kullan�c�dan bir tamsay� al�n 
	   e�er tamsay� 3 ile b�l�nebiliyorsa ekrana �3��n kat�� yazd�r�n. 
	   3 ile b�l�nemiyorsa ekrana �3��n kat� de�ildir� yazd�r�n.
    */
				
		
		System.out.println("L�tfen birtam say� giriniz");
		
		int ts = scan.nextInt();
		
		if (ts %3 ==0) {
			System.out.println("3'un kat�");
		}
				
		if (ts%3 !=0) {
			System.out.println("3'kat� de�il");
		}
			
		int f = scan.nextInt();
		if (f%5==0) {
			System.out.println("5'in kat�");
		} else {
			System.out.println("5'in kat� de�il");
		}
			
			scan.close();
			
	}

}
