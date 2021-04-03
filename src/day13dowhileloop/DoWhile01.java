package day13dowhileloop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {

		/* Kullanýcýdan sayý alýn
		 sayý 10 veya 10dan büyükse ekrana kazandýnýz yazýn
		 sayý 10 dan küçükse kaybettiniz yazýn
		 */
		
		
		
		Scanner scan = new Scanner (System.in);
		
		int s = 20;
		
		do {
			if (s>=10) {
				System.out.println("Kaybetiniz");
			}
			System.out.println("Bir sayý giriniz");
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
