package day08nestedif;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {

		
		if (5>4) {
			System.out.println("Elma");
		}else {
			System.out.println("Armut");
		}
		
		/* Kullanıcıdan sayı alın
		 bu sayi 0 dan 9 kadar ise ekrana 'Rakam' yazdını
		 diger durumlarda ekrana 'Sayı' yazdırın
		 bu soruyu Ternary ile çözün
		 */
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir Sayı giriniz");
		int sayi = scan.nextInt();
		String result = sayi>=0 && sayi <=9 ? "Rakam" : "Sayi";
		System.out.println(result);
		
		scan.close ();
		
	}

}
