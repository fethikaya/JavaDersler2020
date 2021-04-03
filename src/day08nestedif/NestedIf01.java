package day08nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {

		
		/* Kullanýcadan cinsiyetini ve yaþýný alýn.
		  Erkek ve 18 yaþýndan küçük ise Erkek çocuk yazaým. Diðer durumlarda Bay yazdýrýlsýn
		 Kadýn ve 18 yaþýndan küçük ise "Kýz çocuk" yazdýrýlsýn, Diðer durumda Bayan yazdýlsýn.
		 Diðer cinsiyetler için 'Tanýmlanamadý' yazalým. 
		 */
		
		Scanner scan = new Scanner (System.in);
		
				
		System.out.println("Cinsiyetinizi giriniz Erkek / Kadýn");
		String cinsiyet = scan.nextLine();
		System.out.println("Yaþýnýzý giriniz");
		int yas = scan.nextInt();
		
		if (cinsiyet. equals ("Erkek")){
			if (yas <18) {
				System.out.println("Erkek Çocuk");
			}else {
				System.out.println("Bay");
			}
				
			
		}else if (cinsiyet.contentEquals ("Kadýn")){
			
		}if (yas <18) {
			System.out.println("Kiz Çocuk");
		}else {
			System.out.println("Tanýmlanamadý");
		}
		
		
		scan.close ();
		
		
	}

}
