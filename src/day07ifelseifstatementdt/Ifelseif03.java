package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ifelseif03 {

	public static void main(String[] args) {

		//Yas 13 den az ise ekrana "Calisamaz" yazdirin
		//Yas 13 den 65 e kadar ise ekrana "Calisabilir" yazdirin
		//Yas 65 den buyuk ise ekrana "Emekli" yazdirin
		//Negatif sayi girerse "Yas negatif olamaz"
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen ya� giriniz");
		int yas = scan.nextInt();
		
		if (yas<0) {
			System.out.println("Ya� Negatif olamaz");
		}
		
		if (yas <13) {
			System.out.println("�ali�amaz");
		}else if (yas<65) {
			System.out.println("Cali�abilir");
		}else if (yas>65) {
			System.out.println("Emekli");
			
		}
		
		scan.close();
		
		
		
			}

}
