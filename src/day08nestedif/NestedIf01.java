package day08nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {

		
		/* Kullan�cadan cinsiyetini ve ya��n� al�n.
		  Erkek ve 18 ya��ndan k���k ise Erkek �ocuk yaza�m. Di�er durumlarda Bay yazd�r�ls�n
		 Kad�n ve 18 ya��ndan k���k ise "K�z �ocuk" yazd�r�ls�n, Di�er durumda Bayan yazd�ls�n.
		 Di�er cinsiyetler i�in 'Tan�mlanamad�' yazal�m. 
		 */
		
		Scanner scan = new Scanner (System.in);
		
				
		System.out.println("Cinsiyetinizi giriniz Erkek / Kad�n");
		String cinsiyet = scan.nextLine();
		System.out.println("Ya��n�z� giriniz");
		int yas = scan.nextInt();
		
		if (cinsiyet. equals ("Erkek")){
			if (yas <18) {
				System.out.println("Erkek �ocuk");
			}else {
				System.out.println("Bay");
			}
				
			
		}else if (cinsiyet.contentEquals ("Kad�n")){
			
		}if (yas <18) {
			System.out.println("Kiz �ocuk");
		}else {
			System.out.println("Tan�mlanamad�");
		}
		
		
		scan.close ();
		
		
	}

}
