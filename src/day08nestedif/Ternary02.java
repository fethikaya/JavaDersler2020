package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {

		/* 
		  Kullan�c�dan bir ��genin  �� kenar uzunlu�unu al�n 
		  e�er �� kenar uzunlu�u birbirine e�it ise ekrana
			�E�kenar ��gen� yazd�r�n. Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n.
		 
		 */
		
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen ��genin keran uzunluklar�n� giriniz");
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		int kenar3 = scan.nextInt();
		
		
		String ucgen = kenar1==kenar2 && kenar1==kenar3 ? "E�kennar U�gen" : "E�genar de�il";
		System.out.println(ucgen);
		
		
		scan.close ();
		
		
	}

}
