package day08nestedif;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		
		/* Kullanýcýdan bir yýl alýn eðer yýl 1000’e bulunuyorsa ekrana “Milenyum” yazdýrýn.
           Eðer yýl 100’e bulunuyorsa ekrana “Yüzyýl” yazdýrýn.
           Eðer yýl 10’a bulunuyorsa ekrana “Onyýl” yazdýrýn.
        */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bir yil giriniz");
		
		int yil = scan.nextInt();
		
		if (yil %1000 ==0) {
			System.out.println("Milenyum");
		}else if (yil % 100==0) {
			
		}else if (yil %10==0) {
			System.out.println("10 yýl");
		}else {
			System.out.println("Hiç biri");
		}
		
		
		
		scan.close ();
		
		
		
		
	}

}
