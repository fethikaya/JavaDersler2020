package day13dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {

		
		/*
		 Kull�nc�dan bir String al�n
		 Stringin i�inde k���k a varsa "Kazand�n�z",
		 yoksa kaybetiniz yazs�n ve yeni say� isteyin. 
		 */
		
		Scanner scan = new Scanner (System.in);
		
		String s = "a";
		
		do {
			if (!s.contains ("a")) {
				System.out.println("Kaybettiniz");
			}
			System.out.println("L�tfen bir Strign giriniz");
			s =scan.nextLine();
			
		} while (!s.contains ("a"));
		System.out.println("Kazand�n�z");
		
			
			scan.close ();
			
			
			
		
		
	}

}
