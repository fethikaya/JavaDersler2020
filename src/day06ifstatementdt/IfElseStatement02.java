package day06ifstatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {

		/*Kullan�c�d�nsay� al�n
		 * bu say�  10 dan 100'e kadar ise, ekrana '�ki Basamakl� say�' yazd�r�n
		 * Aksi durumda 'iki basamakl� de�il' yazd�r�n
		 
		 */
		
		Scanner scan = new Scanner (System.in);
	
		System.out.println("L�tfen bir say� giriniz");
		int num = scan.nextInt();
		
		if (num>=10 && num <=99) {
			System.out.println("�ki basamakl�");
			
		}else {
			System.out.println("�ki basamakl� de�il");
			
		}
		
		scan.close ();
		
		
		
		
		
		
		
	}

}
