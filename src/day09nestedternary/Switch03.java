package day09nestedternary;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {

		/* Kullan�c�dan ay numaras�n� al�n
		  Ay numaras� girilince, O ay ve sonraki ay ve sonraki t�m aylar�n isimleri ekrana yaz�ls�n.
		   
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Ay numaras�n� giriniz");
		int ay = scan.nextInt();
		
		switch (ay) {
			case 1:
				System.out.println("Ocak");
			
			
			case 2:
				System.out.println("�ubat");
			case 3:
				System.out.println("Mart");
			
			
			case 4:
				System.out.println("Nisan");
			
			
			case 5:
				System.out.println("Mayis");
		
			
			case 6:
				System.out.println("Haziran");
			
			case 7:
				System.out.println("Temmuz");
			
			
			case 8:
				System.out.println("Agustos");
			

			case 9:
				System.out.println("Eyl�l");
			
			
			case 10:
				System.out.println("Ekim");
			
			case 11:
				System.out.println("Kas�m");
			
			
			case 12:
				System.out.println("Aral�k");
			break;
			
			default:
				System.out.println("Ge�ersiz ay numaras�");
		}
		
		
		scan.close ();
		
		
		
		
		
		
		
		
	}

}
