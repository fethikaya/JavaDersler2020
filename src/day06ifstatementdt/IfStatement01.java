package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {

		/* Kullanýcýdan bir sayý alýn, bu sayý 3 e bolunuyorsa ekrana "3" un katý yazdýrýn.
		 3'e bölünmüyorsa ekrana '3' e bölünmüyor. yazýn
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir tam sayý giriniz");
		int num = scan.nextInt();
		
		
		if (num %3==0) {
			
			System.out.println("3'un kati");
			
		}
		
		if (num%3!=0) {
			System.out.println("3'e bölünmüyor");
			
			
		scan.close();	
		
		}
		
		
		
		
		
	}

}
