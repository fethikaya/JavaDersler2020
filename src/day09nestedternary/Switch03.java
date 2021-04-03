package day09nestedternary;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {

		/* Kullanýcýdan ay numarasýný alýn
		  Ay numarasý girilince, O ay ve sonraki ay ve sonraki tüm aylarýn isimleri ekrana yazýlsýn.
		   
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Ay numarasýný giriniz");
		int ay = scan.nextInt();
		
		switch (ay) {
			case 1:
				System.out.println("Ocak");
			
			
			case 2:
				System.out.println("Þubat");
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
				System.out.println("Eylül");
			
			
			case 10:
				System.out.println("Ekim");
			
			case 11:
				System.out.println("Kasým");
			
			
			case 12:
				System.out.println("Aralýk");
			break;
			
			default:
				System.out.println("Geçersiz ay numarasý");
		}
		
		
		scan.close ();
		
		
		
		
		
		
		
		
	}

}
