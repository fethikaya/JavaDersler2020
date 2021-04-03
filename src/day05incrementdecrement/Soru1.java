package day05incrementdecrement;

import java.util.Scanner;

public class Soru1 {

	/*
	 0)Sayilari kullanicidan alin
	 1)Iki tane integer variable olusturun a=5 ve b=3 gibi
	 2)Sonra bu integerlarin degerlerinin yerlerini degistirin(swap) yani; a=3 ve b=5 olsun
	*/
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Lütfen ilk rakam");
		int r1 = scan.nextInt();
		System.out.println("Lütfen ikinci rakam");
		int r2 = scan.nextInt();
		System.out.println(r1 + " " + r2);
		
		int kab = 0;
		kab = r1;
		System.out.println(r1 + " " +kab + " "+ r2);
		
		r1= r2;
		
		System.out.println(r1 + " " +kab + " "+ r2);
		
		r2 = kab;
		kab = 0;
		System.out.println(r1 + " " +kab + " "+ r2);
		
		
		
		System.out.println("Lütfen ilk sayiyi giriniz");
		int m1 = scan.nextInt();
		
		System.out.println("Lütfen ikinci sayiyi giriniz");
		int m2 = scan.nextInt();
		
		System.out.println(m1 +" "+ m2);
		
		int yedek = 0;
		yedek = m1;
		m1 = m2;
		m2 = yedek;
		
		System.out.println(m1 +" "+ yedek + " "+ m2);
		
		
		
		
		
		
		
		
		
		
		

		
		System.out.println("Birinci sayiyi giriniz");
		int s1 = scan.nextInt();
		
		System.out.println ("Ýkinci sayiyi giriniz");
		int s2 = scan.nextInt();
		
		System.out.println(s1 + " " + s2);

		int bos = 0;
		bos = s1; 
		System.out.println(s1 + " " + bos+ " "+ s2);
		
		s1 = s2;
		System.out.println(s1 + " " + bos+ " "+ s2);
		
		s2 = bos;
		System.out.println(s1 + " " + bos+ " "+ s2);
		
		
		
		
		
		
		scan.close ();
		
		
		
		
		
		
		
		
		
	}

}
