package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement08 {

	public static void main(String[] args) {

		/* Kullanıcıdan bir character alın 
		  eğer character bir harf ise ekrana “Harf” yazdırın.  
		  Diğer durumlarda ekrana “Harf değil” yazdırın.
		 */

		Scanner scan = new Scanner (System.in);
			System.out.println("Lütfen bir karekter giriniz");
		char kr = scan.next ().charAt(0);
		
		if (kr >= 65 && kr <90 || kr>=97 && kr<122) {
			System.out.println("Harf");
		} else {
			System.out.println("Işaret");
		}
			
	
		
		
		/* Kullanıcıdan alacağı ürün miktarını ve ürünün birim ﬁyatını alın. 
		   Eğer urun miktarı 1000 den fazla ise  Kullanıcıya %10 indirim yapın 
		   ve ödemesi gereken toplam parayı ekrana yazdırın. 
		   Diğer durumlarda  ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		 */
		
		
		   System.out.println("Lütfen adet ve fiyat giriniz");
		   int adet = scan.nextInt();
		   int fiyat = scan.nextInt();
		   
			if (adet>1000) {
				System.out.println("Ödenecek miktar " + ((adet*fiyat)-(adet*fiyat)/10));
				
			} else {
				System.out.println(fiyat*adet);
			}
			
		
		
		
		
		
	}

}
