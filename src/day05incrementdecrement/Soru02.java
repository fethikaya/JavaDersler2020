package day05incrementdecrement;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		
		/*
		 0)Sayilari kullanicidan alin
		 1)Iki tane integer variable olusturun a=5 ve b=3 gibi
		 2)Sonra bu integerlarin degerlerinin yerlerini degistirin(swap) yani; a=3 ve b=5 olsun
		*/
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen Ýsim giriniz");
		String isim = scan.nextLine();
		System.out.println("Lütfen soyadi giriniz");
		String soyAdi = scan.nextLine();
		System.out.println(isim +" " + soyAdi);
		
		String yedek = scan.nextLine();
		
		yedek = isim;
		isim = soyAdi;
		soyAdi = yedek;
		yedek = " ";
		
		System.out.println(isim +" " + yedek + " " + soyAdi);
				
				
		
		System.out.println("Lütfen bir sayi giriniz");
		int c1 = scan.nextInt();
		System.out.println("Lütfen ikinci sayi giriniz");
		int c2 = scan.nextInt();
		System.out.println(c1 + " " + c2);
		
		c1 = c1+c2;
		c2 = c1-c2;
		c1 = c1 -c2;
		
		System.out.println(c1 + " " + c2);
		
		
		
		
		
		
		System.out.println("Birinci sayiyi giriniz");
		int s1 = scan.nextInt();
		
		System.out.println ("Ýkinci sayiyi giriniz");
		int s2 = scan.nextInt();
		
		System.out.println(s1 + " " + s2);
		
		s1 = s1 + s2;
		s2 = s1 - s2;
		s1 = s1 - s2;
		 
		System.out.println(s1 + " " + s2);
		
		scan.close ();
		
		
				

	}

}
