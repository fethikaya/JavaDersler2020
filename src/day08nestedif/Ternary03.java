package day08nestedif;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {

		/* Kullan�c�dan bir character al�n 
		  e�er character bir harf ise ekrana �Harf� yazd�r�n.
			Di�er durumlarda ekrana �Harf de�il� yazd�r�n.*/
		

		Scanner scan = new Scanner (System.in);
		System.out.println("bir karekter giriniz");
		char ch=scan.next ().charAt(0);
		
		String result = (ch>='a' && ch<= 'z') || (ch>= 'A' && ch<= 'Z') ? "Harf" : "Harf degil";
		
		System.out.println(result);
		
		scan.close ();
		
	} 

}
