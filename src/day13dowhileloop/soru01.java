package day13dowhileloop;

import java.util.Scanner;

public class soru01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		
		
		
		
		System.out.println("Baþlangýç deðrini gir");
		int baslangic = scan.nextInt();
		System.out.println("Bitiþ deðeri gir");
		int bitis = scan.nextInt();
		
		int product = 1;
		while (baslangic<=bitis) {
			product = product *baslangic;
			baslangic++;
			System.out.println(product);
		}
		
		
	scan.close ();
	
		
		
		
		
	}

}
