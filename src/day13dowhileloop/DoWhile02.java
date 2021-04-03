package day13dowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {

		/* Kullanýcýdan sayý alýn,
		 Sayý çift sayý ise, ekrana kazandýnýz yazdýrýn.
		 sayý tek ise kaybettiniz yazdýrýn. ve yeni bir sayý isteyin 
		 
		 */
		
		
		Scanner scan = new Scanner (System.in);
		
		int s = 12;
		
		do {
			if (s%2!=0) {
				System.out.println("Kaybettiniz");
			}
			System.out.println("Bir sayý giriniz");
			s = scan.nextInt();
		}while (s%2!=0);
		System.out.println("Kazandiniz");
		
		
		
		scan.close ();
		
		
		
		
	}

}
