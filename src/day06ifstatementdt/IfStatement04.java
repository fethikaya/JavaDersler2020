package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		
		/* Kullanıcıdan bir sayı alın, bu sayı 0-9 rası ise ekrana 'Rakam' yazın,
		eğer bu sayı 9 dan büyük ise ekrana 'Sayı' yazdırın
		bu sayı 9 dan büyük ve 100 den küçükse ekrana 'iki basamaklı sayı' yazın
		*/

		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int num = scan.nextInt();
		
		if (num>=0 && num<9) {
			
			System.out.println("Rakam");
		}
		
		
		if (num >9 && num<100) {
			System.out.println("İki basamaklı sayi");
		}
		
		scan.close ();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
