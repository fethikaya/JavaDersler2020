package day13dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {

		
		/*
		 Kullýncýdan bir String alýn
		 Stringin içinde küçük a varsa "Kazandýnýz",
		 yoksa kaybetiniz yazsýn ve yeni sayý isteyin. 
		 */
		
		Scanner scan = new Scanner (System.in);
		
		String s = "a";
		
		do {
			if (!s.contains ("a")) {
				System.out.println("Kaybettiniz");
			}
			System.out.println("Lütfen bir Strign giriniz");
			s =scan.nextLine();
			
		} while (!s.contains ("a"));
		System.out.println("Kazandýnýz");
		
			
			scan.close ();
			
			
			
		
		
	}

}
