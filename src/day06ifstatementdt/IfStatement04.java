package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		
		/* Kullan�c�dan bir say� al�n, bu say� 0-9 ras� ise ekrana 'Rakam' yaz�n,
		e�er bu say� 9 dan b�y�k ise ekrana 'Say�' yazd�r�n
		bu say� 9 dan b�y�k ve 100 den k���kse ekrana 'iki basamakl� say�' yaz�n
		*/

		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir say� giriniz");
		int num = scan.nextInt();
		
		if (num>=0 && num<9) {
			
			System.out.println("Rakam");
		}
		
		
		if (num >9 && num<100) {
			System.out.println("�ki basamakl� sayi");
		}
		
		scan.close ();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
