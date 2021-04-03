package day13dowhileloop;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen bir String giriniz");
		String s = scan.nextLine();
		System.out.println(s.substring(0, s.length()/2));  // ilk yarým
		System.out.println(s.substring(s.length()/2));  // Son yarým
		
		
		
		scan.close ();
		
		
		
		
		
		
		
		
		
		
	}

}
