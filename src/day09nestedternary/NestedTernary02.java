package day09nestedternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {

		/* Kullanýcýdan bir üçgenin kenarlarýný alýnýz
		  üç kenar birbirine eþit ise
		  çevre 30 dan büyük ise 'Ne büyüksün' deðilse 'Normal' yazýn
		  Ucu birbirine eþit deðilse çevreyi kontorl edin çevre 20 den küçük ise
		  'Ne küçüksün' deðilse 'Normal' yazdýrýn
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen Üçgenin kenar uzunluklarýný giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
			
		String sonuc = (k1==k2 && k1==k3) ? ((k1+k2+k3 >30) ? ("Ne büyüksün") : ("Normal")) 
				      : ((k1+k2+k3 <20) ? ("Ne küçüksün") : ("Normal"));
		
		System.out.println(sonuc);
		
		scan.close ();
		
		
	}

}
