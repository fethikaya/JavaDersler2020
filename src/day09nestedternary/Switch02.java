package day09nestedternary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {

		/* Kullan�c�dan g�n numaras�n� al�n
		  Ekrana g�n ismini yazd�r�n
		  1 == Pazar,
		  7 == Cumartesi
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen g�n numaras� girin");
		int gun = scan.nextInt();
		
		switch (gun) {
			case 1:
				System.out.println("Pazar");
			break;
			
			case 2:
				System.out.println("Pazartesi");
			break;
			
			case 3:
				System.out.println("Sal�");
			break;
			
			case 4:
				System.out.println("�ar�amba");
			break;
			
			case 5:
				System.out.println("Per�embe");
			break;
			
			case 6:
				System.out.println("Cuma");
			break;
			
			case 7:
				System.out.println("Cumartes");
			
			default:
				System.out.println("Ge�erli g�n say�s� giriniz");
			
		}
		
		scan.close ();
		
	}

}
