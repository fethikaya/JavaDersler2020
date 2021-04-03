package day08nestedif;

import java.util.Scanner;

public class TernaryOrnek {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		/*
		 Kullanıcıdan bir harf girmesini isteyin.
		Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. 
		Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
		“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
		Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin.
 		Harf “Z” ise ekrana “Son büyük harf” yazdırın.
		“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		*/

		System.out.println("Lütfen bir harf");
		char hrf = scan.next ().charAt(0);

		if (hrf>='a' && hrf<='z') {
			if (hrf=='a') {
				System.out.println("ilk küçük harf");
			}else {
				System.out.println("ilk küçük harf değil");
			} }
		else if(hrf>='A' && hrf<='Z') {
			if(hrf=='Z') {
				System.out.println("son büyük harf");
			}else {
				System.out.println("son büyük harf değil");
			}
		}else {
			System.out.println("bir harf girmelisin...");
		}
		
		
		
		
		 /*Kullanıcıdan password girmesini isteyin. 
		 * Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. 
		 * Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
		 * Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
		 * Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın. 
         */
		
			System.out.println("Lütfen Şifre giriniz");
		int sifre = scan.nextInt();
		
		if (sifre %5==0) {
			if (sifre %10 ==0) {
				System.out.println("5' bölünen çift sayı");
			}else if (sifre%10!=0) {
				System.out.println("5'e bölünen tek sayı");
			}else {
				System.out.println("Tekrar deneyin");
			}
		}
		
		
		/*Kullanıcıdan bir harf alın 
		 * eğer harf büyük harf ise ekrana “Büyük harf” yazdırın.  
		 * Diğer durumlarda ekrana “Büyük harf degil” yazdırın.
		 */

		System.out.println("Lütfen bir harf giriniz");
		char harf = scan.next ().charAt(0);
		
		String encam = harf>= 'A' && harf<= 'Z' ? "Büyük Harf" : "Büyük Harf Değil";
			System.out.println(encam);
		
		
		
		/* Kullanıcıdan alacağı ürün miktarını ve ürünün birim ﬁyatını alın. 
		   Eğer urun miktarı 1000 den fazla ise  Kullanıcıya %10 indirim yapın 
		   ve ödemesi gereken toplam parayı ekrana yazdırın. 
		   Diğer durumlarda  ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		 */

			System.out.println("Lütfen adet giriniz");
			int adet = scan.nextInt();
			System.out.println("Lütfen fiyat giriniz");
			int fiyat = scan.nextInt();
			
			double odeme= adet>1000? fiyat*0.90*adet: adet*fiyat;
			       System.out.println("Ödenecek Miktar : " + odeme);
			       
		
		
		
		
		
		/* Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın 
		   eğer iki kenar uzunluğu birbirine eşit ise ekrana  “Ikizkenar Ucgen” yazdırın. 
		   Diğer durumlarda ekrana “Ikizkenar değil” yazdırın.
		 */
	
		
		System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
		String result= k1==k2 || k1==k3 || k2==k3 ? "İkizkenar Uçgen" : "Ikizkenar değil";
		System.out.println(result);
		
		
		/*Kullanıcıdan bir tamsayı alın 
		  eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın.  
		  Diğer durumlarda ekrana “Negatif degil” yazdırın.
		 */

		
		System.out.println("Lütfen bir sayı giriniz");
		int s = scan.nextInt();
		
		String sonuc = (s<0 ? "Negati" : "Negatif değil") ;
		System.out.println(sonuc);
				
		
		
		scan.close();
		
	}

}
