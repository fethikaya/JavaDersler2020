package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ifelseif05 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen vize notunuzu giriniz");
		byte Vize = scan.nextByte();
		System.out.println("L�tfen Final notunuzu giriniz");
		byte Final = scan.nextByte();
		
		double ortalama = (Vize*40/100) + (Final *60/100);
				
				
		if (ortalama<50) {
			System.out.println(ortalama);
			System.out.println("Ba�ar�s�z");
			
		}else if (ortalama >=50) {
			System.out.println(ortalama);
			System.out.println("Ba�ar�l�");
			
		}
			
		
		
		
		
		
		/* Kullan�c�dan bir y�l al�n 
		 * E�er y�l 1000�e b�l�nuyorsa ekrana �Milenyum�
		 * E�er y�l 100�e b�l�nuyorsa ekrana �Y�zy�l� 
		 * E�er y�l 10�a b�l�nuyorsa ekrana �Ony�l� yazd�r�n.
		 */

		
		System.out.println("L�tfen bir y�l giriniz");
			int yil = scan.nextInt();
			
			if (yil%1000==0) {
				System.out.println("Millenyum");
			}else if (yil%100==0) {
				System.out.println("Yuzyil");
			}else if (yil%10==0) {
				System.out.println("On yil");
			}else {
				System.out.println("Sene");
			}
		
		
		
		
		
		
		/* Kullan�c�dan notunu al�n ve a�a��daki kurallara g�re ekrana A, B, C veya D yazd�r�n. 
		   1. 50 den az - D     
		   2. 50(dahil) ile 60 aras� - C       
		   3. 60(dahil) ile 80 aras� - B.     
		   4. 80(dahil) ustu- A 
		 */
		
		
	
		System.out.println("L�tfen Notunuzu giriniz");
		byte not = scan.nextByte();
		
				
		if (not>0 && not<50) {
			System.out.println("D");
		}else if (not>=50 && not<60) {
			System.out.println("C");
		}else if (not>=60 && not<80) {
			System.out.println("B");
		}else if (not>=80 && not<=100) {
			System.out.println("A");
		}
		
		
		
		
		
		
		
		
		/* Kullan�c�dan bir ��genin  �� kenar uzunlu�unu al�n 
		   e�er �� kenar uzunlu�u birbirine e�it ise ekrana  �E�kenar ��gen� yazd�r�n. 
		   Sadece iki kenar uzunlu�u birbirine e�it ise ekrana �Ikizkenar ��gen�  yazd�r�n. 
		   T�m kenar uzunluklar� birbirinden farkl� ise ��e�itkenar ��gen yazd�r�n
		 */
		
				
		System.out.println("L�tfen Ucgenin kenar uzunlu�unu giriniz");
		int kenar1 = scan.nextInt();
		System.out.println("L�tfen diger kenar uzunlu�unu giriniz");
		int kenar2 = scan.nextInt();
		System.out.println("L�tfen �teki kenar uzunlu�unu giriniz");
		int kenar3 =scan.nextInt();
		
		if (kenar1==kenar2 && kenar1==kenar2) {
			System.out.println("E�kenar U�gen");
		}else if (kenar1==kenar2 &&kenar1!=kenar3 || kenar1 ==kenar3 && kenar1!=kenar2 ||kenar2==kenar3 && kenar2!=kenar1) {
			System.out.println("�kizkenar U�gen");
		}else if (kenar1!=kenar2 && kenar1!=kenar3) {
			System.out.println("�e�itkenar u�gen");
		}
				
		
		scan.close();
		
		
	}

}
