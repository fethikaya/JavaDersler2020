package day09nestedternary;

import java.util.Scanner;

public class Nestedternary01 {

	public static void main(String[] args) {

		/* Kullanýcýdan bir sayý alýn
		   Sayý pozitif ise 9 dan büyük mü diye kontrol edin, 9'dan büyük ise 'Sayý' deðil ise 'Rakam' yazdýrýn.
		   Sayý pozitf deðil se 0 mý diye kontrol edin, 0 ise Rakam deðilse negatif sayý yazýn
		 */
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir sayý giriniz");
		
		int s = scan.nextInt();
		
		String result = (s>0) ? ((s>9) ? ("Sayý"): ("Rakam")) : ((s==0) ? ("Rakam") : ("Negatif Sayý"));
		System.out.println(result);
		
		scan.close ();
		
		
		
		
		
		
		
	}
	

}
