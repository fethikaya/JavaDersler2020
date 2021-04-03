package day09nestedternary;

import java.util.Scanner;

public class NestedTernary03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		
		/*
		  Kullanýcýdan bir yýl girmesini isteyin, 
		  yýl artýk yýl ise ekrana “Artýk yýl” degilse ekrana “Artýk yýl degil” yazdýrýn.
		 */
		
		
		System.out.println("Lütfen bir yil giriniz");
		int yil = scan.nextInt();
		
		String x = (yil % 4==0) ? ("Artik yil") : ("Artik yil deðil");
		System.out.println(x);
		
		
		if (yil %4==0) {
			System.out.println("Artik Yýl");
		}else {
			System.out.println("Artik yil deðil");
		}
		
		
		
		/*
		 Kullanýcýdan bir tamsayý girmesini isteyin, 
		 o tamsayý 3 basamaklý ise ekrana “3 Basamaklý” yazdýrýn. 
		 3 basamaklý degilse çift olup olmadigini kontrol edin. 
		 Çift ise “3 basamaklý olmayan çift sayý” yazdýrýn. 
		 Çift sayý degilse “3 basamaklý olmayan tek sayý yazdýrýn.”
		 */
		
		System.out.println("Lütfen bir tam sayý giriniz");
		int sy = scan.nextInt();
		
		String durum = (sy ==sy%1000) ? ("3 Bakamaklý") : 
			       ((sy%2==0) ? ("3 Basamaklý olmayn çift sayý") : ("3 basamaklý olmana tek sayý"));
		
		System.out.println(durum);
		
		
		if (sy == sy%1000) {
			System.out.println("3 Basamaklý");
		} else if (sy !=sy%100) {
			if (sy%2==0) {
			System.out.println("3 Basamaklý olmyan çift sayý");
			
			}else {
				System.out.println("3 Basamaklý olmayan tek sayý");
			}
				
		}
		 
		
		
	
		/* Kullanýcýdan bir dikdörtgenin en ve boyunu girmesini isteyin. 
		  En ve boy eþit ise ekrana “Kare” 
		  farklý ise ekrana “Dikdörtgen” yazdýrýn.
		 */
		
		
		System.out.println("Lütfen en ve boy giriniz");
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		String encam = (en == boy) ? ("Kare") : ("Diktörgen");
		System.out.println(encam);
		
		if (en == boy) {
			System.out.println("Kare");
		} else {
			System.out.println("Diktörtgen");
		}
		
		
		
		
		
		System.out.println("Lütfen iki tam sayý giriniz");
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		
		int result = (s1>s2) ? (s1): (s2);
		System.out.println(result);
		
		if (s1>2) {
			System.out.println(s1);
		} else {
			System.out.println(s2);
		}
		
		
		
		
		
		
	/*  Kullanýcýdan bir tamsayý girmesini isteyin, 
	 * tamsayý çift ise ekrana “Çift” tek ise ekrana “Tek” yazdýrýn	
	 */
		
		System.out.println("Lütfen bir tam sayý giriniz");
		int ts = scan.nextInt();
		
		String sonuc = (ts%2==0) ? ("Çift") : ("Tek");
		System.out.println(sonuc);
		
		
		
		
		
	
		
		
		scan.close ();
	}

}
