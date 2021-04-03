package day05incrementdecrement;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {

		// Kullanýcýdan 3 basamaklý bir sayý alýnýz 
		// bu sayýnýn rakamlarýnýn toplamý ekrana yazdýrýnýz.
		
		Scanner scan = new Scanner (System.in);
		

		System.out.println("3 Basamaklý bir sayý giriniz");
		int s = scan.nextInt();
		int sonRakam = s%10;
		int ortaRakam = (s/10)%10;
		int ilkRakam = (s/100)%10;
		
		System.out.println(ilkRakam+ortaRakam+sonRakam);
		
		System.out.println("Lütfen 4 Basamaklý bir sayý giriniz");
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
