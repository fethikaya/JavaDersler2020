package day09nestedternary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {

		/* Kullanýcýdan gün numarasýný alýn
		  Ekrana gün ismini yazdýrýn
		  1 == Pazar,
		  7 == Cumartesi
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen gün numarasý girin");
		int gun = scan.nextInt();
		
		switch (gun) {
			case 1:
				System.out.println("Pazar");
			break;
			
			case 2:
				System.out.println("Pazartesi");
			break;
			
			case 3:
				System.out.println("Salý");
			break;
			
			case 4:
				System.out.println("Çarþamba");
			break;
			
			case 5:
				System.out.println("Perþembe");
			break;
			
			case 6:
				System.out.println("Cuma");
			break;
			
			case 7:
				System.out.println("Cumartes");
			
			default:
				System.out.println("Geçerli gün sayýsý giriniz");
			
		}
		
		scan.close ();
		
	}

}
