package day08nestedif;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/* Kullan�c�dan alaca�� �r�n miktar�n� ve �r�n�n birim fiyat�n� al�n. 
		 E�er urun miktar� 1000 den fazla ise
		 Kullan�c�ya %10 indirim yap�n ve �demesi gereken toplam paray� ekrana yazd�r�n. 
		 Di�er durumlarda
		 �demesi gereken toplam paray� herhangi bir indirim yapmadan ekrana yazd�r�n.
		 */
		
		
		Scanner scan = new Scanner (System.in);
			System.out.println("�r�n adedi giriniz");
			int adet = scan.nextInt();
			System.out.println("�r�n birim fiyat�n� giriniz");
			int fiyat = scan.nextInt();
			
			if (adet>1000) {
				System.out.println("�ndirimli �deme:" + fiyat*0.90*adet);
			} else {
				System.out.println("�ndirisiz �deme:" + fiyat*adet);
			}
		
		
		scan.close ();
		
		
			
		

	}

}
