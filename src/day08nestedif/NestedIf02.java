package day08nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {

		/*Kuln�cad�n bir say� al�n
		 *say� pozitif ise 10 dan b�yk�mu diye kontrol edin. 
		 10 dan b�y�k ise wwwwww k���k ise himmm diye yaz�n
		 
		 Say� 0 veya negati fise -10 dan k���k m� diye kontrol edin.
		 -10 dan k���k ise 'Felaket' -10dan b�y�k ise ' Ne yapal�m' diye yaz�n
		 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir say� giriniz");
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
