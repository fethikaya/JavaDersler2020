package day05incrementdecrement;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {

		// Kullan�c�dan 3 basamakl� bir say� al�n�z 
		// bu say�n�n rakamlar�n�n toplam� ekrana yazd�r�n�z.
		
		Scanner scan = new Scanner (System.in);
		

		System.out.println("3 Basamakl� bir say� giriniz");
		int s = scan.nextInt();
		int sonRakam = s%10;
		int ortaRakam = (s/10)%10;
		int ilkRakam = (s/100)%10;
		
		System.out.println(ilkRakam+ortaRakam+sonRakam);
		
		System.out.println("L�tfen 4 Basamakl� bir say� giriniz");
		int r = scan.nextInt();
		int r4 = r%10;
		int r3 = (r/10)%10;
		int r2 = (r/100)%10;
		int r1 = (r/1000)%10;
		
		System.out.println(r1+r2+r3+r4);
		System.out.println(r1+r4);
		
		scan.close();
				
		
		
		
		
		
		
		
		
	}

}
