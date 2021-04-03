package day09nestedternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {

		/* Kullan�c�dan bir ��genin kenarlar�n� al�n�z
		  �� kenar birbirine e�it ise
		  �evre 30 dan b�y�k ise 'Ne b�y�ks�n' de�ilse 'Normal' yaz�n
		  Ucu birbirine e�it de�ilse �evreyi kontorl edin �evre 20 den k���k ise
		  'Ne k���ks�n' de�ilse 'Normal' yazd�r�n
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen ��genin kenar uzunluklar�n� giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
			
		String sonuc = (k1==k2 && k1==k3) ? ((k1+k2+k3 >30) ? ("Ne b�y�ks�n") : ("Normal")) 
				      : ((k1+k2+k3 <20) ? ("Ne k���ks�n") : ("Normal"));
		
		System.out.println(sonuc);
		
		scan.close ();
		
		
	}

}
