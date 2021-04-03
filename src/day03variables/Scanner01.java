package day03variables;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Karenin bir kenar uzunlugunu giriniz");
		int kenarUzunlugu = scan.nextInt();
		System.out.println(kenarUzunlugu + kenarUzunlugu + kenarUzunlugu + kenarUzunlugu);
		System.out.println(kenarUzunlugu);
		
				
		
		System.out.println("Lütfen diktortgenin kenra uzunluklarini griniz");
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		System.out.println(kenar1 * kenar2);
		
		
		
		scan.close ();
		
		
		
		
		
		
	
		
		
		
		
		
		
	

	}

}
