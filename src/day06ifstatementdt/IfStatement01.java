package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {

		/* Kullan�c�dan bir say� al�n, bu say� 3 e bolunuyorsa ekrana "3" un kat� yazd�r�n.
		 3'e b�l�nm�yorsa ekrana '3' e b�l�nm�yor. yaz�n
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir tam say� giriniz");
		int num = scan.nextInt();
		
		
		if (num %3==0) {
			
			System.out.println("3'un kati");
			
		}
		
		if (num%3!=0) {
			System.out.println("3'e b�l�nm�yor");
			
			
		scan.close();	
		
		}
		
		
		
		
		
	}

}
