package day13dowhileloop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {

		/* Kullan�c�dan say� al�n
		 say� 10 veya 10dan b�y�kse ekrana kazand�n�z yaz�n
		 say� 10 dan k���kse kaybettiniz yaz�n
		 */
		
		
		
		Scanner scan = new Scanner (System.in);
		
		int s = 20;
		
		do {
			if (s>=10) {
				System.out.println("Kaybetiniz");
			}
			System.out.println("Bir say� giriniz");
			s = scan.nextInt();
		} while (s<=10);
			System.out.println("Kazandiniz");
			
		
		
		
		
		scan.close ();
		
		
		/*
		int i = 1;
		while (i<1) {
			System.out.println(i);
			i++;
			
		}
		
		
		
		
		do {
			System.out.println(i);
			i++;
			
		}while (i<1);
		
		
		
		*/
		
		
		
		
		
	}

}
