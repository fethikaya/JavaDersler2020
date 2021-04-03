package day06ifstatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {

		/*Kullanıcıdınsayı alın
		 * bu sayı  10 dan 100'e kadar ise, ekrana 'İki Basamaklı sayı' yazdırın
		 * Aksi durumda 'iki basamaklı değil' yazdırın
		 
		 */
		
		Scanner scan = new Scanner (System.in);
	
		System.out.println("Lütfen bir sayı giriniz");
		int num = scan.nextInt();
		
		if (num>=10 && num <=99) {
			System.out.println("İki basamaklı");
			
		}else {
			System.out.println("İki basamaklı değil");
			
		}
		
		scan.close ();
		
		
		
		
		
		
		
	}

}
