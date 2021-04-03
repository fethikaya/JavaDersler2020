package day08nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {

		/*Kulnýcadýn bir sayý alýn
		 *sayý pozitif ise 10 dan büykümu diye kontrol edin. 
		 10 dan büyük ise wwwwww küçük ise himmm diye yazýn
		 
		 Sayý 0 veya negati fise -10 dan küçük mü diye kontrol edin.
		 -10 dan küçük ise 'Felaket' -10dan büyük ise ' Ne yapalým' diye yazýn
		 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir sayý giriniz");
		int s = scan.nextInt();
		
		if(s>0) {
			if(s>10) {
				System.out.println("Woooow!");
			}else {
				System.out.println("Hmmmm!");
			}
		}else if(s<=0) {
			if(s<-10) {
				System.out.println("Felaket!");
			}else {
				System.out.println("Ne yapalim");
			}
		}

		
		scan.close();
		
		
		
		
		
		
	}

}
