package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ifelseif04 {

	public static void main(String[] args) {

		/* Kullan�cadan iki not al�n, ortalama 
		  not 50'nin alt�nda ise 'Kald�n�z'
		  not 70'in alt�nda ise 'C ile ge�tiniz' yazs�n
		  85'in alt�nda ise 'b' ile ge�tiniz
		  100 ve 100 alt�nda ise 'a ile ge�tiniz' yazs�n
		  di�er durumlarda ise 'Ge�erli not giriniz'
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen ilk notu giriniz");
		int not1 = scan.nextInt();
		System.out.println("L�tfen ikinci notu giriniz");
		int not2 = scan.nextInt();
		
		double ortalama = (not1+not2)/2.0;
		
		if (not1<0 || not2<0) {
			System.out.println("Ge�erli not giriniz");
		}else if (not1>100 || not2>100) {
			System.out.println("Ge�erli not giriniz");
		}else if (ortalama<50) {
			System.out.println("Kald�n�z");
			System.out.println(ortalama);
		}else if (ortalama<70) {
			System.out.println("C ile ge�tiniz");
			System.out.println(ortalama);
		}else if (ortalama<85) {
			System.out.println("B ile ge�tiniz");
			System.out.println(ortalama);
		}else if (ortalama<=100) {
			System.out.println("A ile ge�tiniz");
			System.out.println(ortalama);		
		}
		
		scan.close ();
		
		
		
				
		
		
		
		
		
	}

}
