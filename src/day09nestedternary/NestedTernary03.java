package day09nestedternary;

import java.util.Scanner;

public class NestedTernary03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		
		/*
		  Kullan�c�dan bir y�l girmesini isteyin, 
		  y�l art�k y�l ise ekrana �Art�k y�l� degilse ekrana �Art�k y�l degil� yazd�r�n.
		 */
		
		
		System.out.println("L�tfen bir yil giriniz");
		int yil = scan.nextInt();
		
		String x = (yil % 4==0) ? ("Artik yil") : ("Artik yil de�il");
		System.out.println(x);
		
		
		if (yil %4==0) {
			System.out.println("Artik Y�l");
		}else {
			System.out.println("Artik yil de�il");
		}
		
		
		
		/*
		 Kullan�c�dan bir tamsay� girmesini isteyin, 
		 o tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n. 
		 3 basamakl� degilse �ift olup olmadigini kontrol edin. 
		 �ift ise �3 basamakl� olmayan �ift say�� yazd�r�n. 
		 �ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�
		 */
		
		System.out.println("L�tfen bir tam say� giriniz");
		int sy = scan.nextInt();
		
		String durum = (sy ==sy%1000) ? ("3 Bakamakl�") : 
			       ((sy%2==0) ? ("3 Basamakl� olmayn �ift say�") : ("3 basamakl� olmana tek say�"));
		
		System.out.println(durum);
		
		
		if (sy == sy%1000) {
			System.out.println("3 Basamakl�");
		} else if (sy !=sy%100) {
			if (sy%2==0) {
			System.out.println("3 Basamakl� olmyan �ift say�");
			
			}else {
				System.out.println("3 Basamakl� olmayan tek say�");
			}
				
		}
		 
		
		
	
		/* Kullan�c�dan bir dikd�rtgenin en ve boyunu girmesini isteyin. 
		  En ve boy e�it ise ekrana �Kare� 
		  farkl� ise ekrana �Dikd�rtgen� yazd�r�n.
		 */
		
		
		System.out.println("L�tfen en ve boy giriniz");
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		String encam = (en == boy) ? ("Kare") : ("Dikt�rgen");
		System.out.println(encam);
		
		if (en == boy) {
			System.out.println("Kare");
		} else {
			System.out.println("Dikt�rtgen");
		}
		
		
		
		
		
		System.out.println("L�tfen iki tam say� giriniz");
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		
		int result = (s1>s2) ? (s1): (s2);
		System.out.println(result);
		
		if (s1>2) {
			System.out.println(s1);
		} else {
			System.out.println(s2);
		}
		
		
		
		
		
		
	/*  Kullan�c�dan bir tamsay� girmesini isteyin, 
	 * tamsay� �ift ise ekrana ��ift� tek ise ekrana �Tek� yazd�r�n	
	 */
		
		System.out.println("L�tfen bir tam say� giriniz");
		int ts = scan.nextInt();
		
		String sonuc = (ts%2==0) ? ("�ift") : ("Tek");
		System.out.println(sonuc);
		
		
		
		
		
	
		
		
		scan.close ();
	}

}
