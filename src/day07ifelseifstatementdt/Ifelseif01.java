package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ifelseif01 {

	public static void main(String[] args) {
		
		/* Kullanýcadan sayý alýn,
		 sayý sýfýrdan büyük ise ekrana 'Pozitif' yazdýrýn
		 sayý sýfýr ise ekrana 'Notr' yazýn
		 sayý sýfýrdan küçük ise ekrana ' Negatif' yazýnýz
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir sayý giriniz");
		double s = scan.nextDouble();
		
		if (s>0) {
			System.out.println("Pozitif");
		}
		
		if (s==0) {
			System.out.println("Notr");
			
		}else {
			System.out.println("Negatif");
		}
	
		
		scan.close ();
		
		
		
		
		
		
		
	
	
	
	
	
	}

}
