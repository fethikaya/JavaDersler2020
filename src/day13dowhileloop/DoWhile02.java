package day13dowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {

		/* Kullan�c�dan say� al�n,
		 Say� �ift say� ise, ekrana kazand�n�z yazd�r�n.
		 say� tek ise kaybettiniz yazd�r�n. ve yeni bir say� isteyin 
		 
		 */
		
		
		Scanner scan = new Scanner (System.in);
		
		int s = 12;
		
		do {
			if (s%2!=0) {
				System.out.println("Kaybettiniz");
			}
			System.out.println("Bir say� giriniz");
			s = scan.nextInt();
		}while (s%2!=0);
		System.out.println("Kazandiniz");
		
		
		
		scan.close ();
		
		
		
		
	}

}
