package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement07 {

	public static void main(String[] args) {
		
		
		
		/* Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın 
		    eğer üç kenar uzunluğu birbirine eşit ise ekrana  “Eşkenar üçgen” yazdırın. 
		    Diğer durumlarda ekrana “Eşkenar değil” yazdırın.
		 */
		
			Scanner scan = new Scanner (System.in);
		    	System.out.println("Uçgenin kenar uzunluklarını giriniz");
		    int kenar1 = scan.nextInt();
		    int kenar2 = scan.nextInt();
		    int kenar3 = scan.nextInt();
		    if (kenar1==kenar2&& kenar1==kenar3) {
		    	System.out.println("Eşkenar uçgen");
		    }else {
		    	System.out.println("Eşkenar uçgen değil");
		    }
		    
		    
		    
		    
		
		/* Kullanıcıdan bir tamsayı alın 
		   eğer tamsayı 10 dan kucuk ve 0’dan büyük eşit ise ekrana  “Rakam” yazdırın. 
		   Diğer durumlarda ekrana “Sayı” yazdırın.
		 */

		 
		 	System.out.println("Lütfen bir tam sayı giriniz");
		int tams = scan.nextInt();
		
		if (tams >=0 && tams<10) {
			System.out.println("Rakam");
		}else {
			System.out.println("Sayı");
		}
		
		
		
		/*  Kullanıcıdan iki sayı alın 
		 * eğer sayıların işaretleri  aynı ise ekrana “Aynı işaretli” yazdırın. 
		 * Sayıların işaretleri  farklı ise ekrana “Farklı işaretli” yazdırın.
		 */

		
		
			System.out.println("Lütfen iki sayı giriniz");
		int sayia = scan.nextInt();
		int sayib = scan.nextInt();
		if (sayia<0 && sayib<0) {
			System.out.println("Ayni işaretli sayı");
		}else {
			System.out.println("Farklı işaretli sayı");
		
		}
		
		
		
		
	/* Kullanıcıdan bir harf alın 
	 * eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın. 
	 * “b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
	 */
	
		
		System.out.println("Lütfen bir harf giriniz");
		
		char harf = scan.next ().charAt(0);
				
		if (harf=='a'||harf =='e'||harf == 'i'||harf== 'o'||harf=='u') {
			System.out.println("Sesli harf");
		}
		
			System.out.println("Lütfen başka harf giriniz");
		char harf1 = scan.next ().charAt(0);
		if (harf1 == 'b'|| harf1== 'c'|| harf1=='d'||harf1=='f') {
			System.out.println("Sesiz harf");
			
		} else {
		 System.out.println("Farkli harf");
		}
			
		
		
		
	/* Kullanıcıdan bir tamsayı alın 
	   eğer tamsayı 3 ile bölünebiliyorsa ekrana “3’ün katı” yazdırın. 
	   3 ile bölünemiyorsa ekrana “3’ün katı değildir” yazdırın.
    */
				
		
		System.out.println("Lütfen birtam sayı giriniz");
		
		int ts = scan.nextInt();
		
		if (ts %3 ==0) {
			System.out.println("3'un katı");
		}
				
		if (ts%3 !=0) {
			System.out.println("3'katı değil");
		}
			
		int f = scan.nextInt();
		if (f%5==0) {
			System.out.println("5'in katı");
		} else {
			System.out.println("5'in katı değil");
		}
			
			scan.close();
			
	}

}
