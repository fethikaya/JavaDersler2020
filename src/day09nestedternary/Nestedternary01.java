package day09nestedternary;

import java.util.Scanner;

public class Nestedternary01 {

	public static void main(String[] args) {

		/* Kullan�c�dan bir say� al�n
		   Say� pozitif ise 9 dan b�y�k m� diye kontrol edin, 9'dan b�y�k ise 'Say�' de�il ise 'Rakam' yazd�r�n.
		   Say� pozitf de�il se 0 m� diye kontrol edin, 0 ise Rakam de�ilse negatif say� yaz�n
		 */
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir say� giriniz");
		
		int s = scan.nextInt();
		
		String result = (s>0) ? ((s>9) ? ("Say�"): ("Rakam")) : ((s==0) ? ("Rakam") : ("Negatif Say�"));
		System.out.println(result);
		
		scan.close ();
		
		
		
		
		
		
		
	}
	

}
