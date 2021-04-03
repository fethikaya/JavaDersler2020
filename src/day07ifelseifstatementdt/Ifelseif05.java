package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ifelseif05 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen vize notunuzu giriniz");
		byte Vize = scan.nextByte();
		System.out.println("Lütfen Final notunuzu giriniz");
		byte Final = scan.nextByte();
		
		double ortalama = (Vize*40/100) + (Final *60/100);
				
				
		if (ortalama<50) {
			System.out.println(ortalama);
			System.out.println("Baþarýsýz");
			
		}else if (ortalama >=50) {
			System.out.println(ortalama);
			System.out.println("Baþarýlý");
			
		}
			
		
		
		
		
		
		/* Kullanýcýdan bir yýl alýn 
		 * Eðer yýl 1000’e bölünuyorsa ekrana “Milenyum”
		 * Eðer yýl 100’e bölünuyorsa ekrana “Yüzyýl” 
		 * Eðer yýl 10’a bölünuyorsa ekrana “Onyýl” yazdýrýn.
		 */

		
		System.out.println("Lütfen bir yýl giriniz");
			int yil = scan.nextInt();
			
			if (yil%1000==0) {
				System.out.println("Millenyum");
			}else if (yil%100==0) {
				System.out.println("Yuzyil");
			}else if (yil%10==0) {
				System.out.println("On yil");
			}else {
				System.out.println("Sene");
			}
		
		
		
		
		
		
		/* Kullanýcýdan notunu alýn ve aþaðýdaki kurallara göre ekrana A, B, C veya D yazdýrýn. 
		   1. 50 den az - D     
		   2. 50(dahil) ile 60 arasý - C       
		   3. 60(dahil) ile 80 arasý - B.     
		   4. 80(dahil) ustu- A 
		 */
		
		
	
		System.out.println("Lütfen Notunuzu giriniz");
		byte not = scan.nextByte();
		
				
		if (not>0 && not<50) {
			System.out.println("D");
		}else if (not>=50 && not<60) {
			System.out.println("C");
		}else if (not>=60 && not<80) {
			System.out.println("B");
		}else if (not>=80 && not<=100) {
			System.out.println("A");
		}
		
		
		
		
		
		
		
		
		/* Kullanýcýdan bir üçgenin  üç kenar uzunluðunu alýn 
		   eðer üç kenar uzunluðu birbirine eþit ise ekrana  “Eþkenar üçgen” yazdýrýn. 
		   Sadece iki kenar uzunluðu birbirine eþit ise ekrana “Ikizkenar üçgen”  yazdýrýn. 
		   Tüm kenar uzunluklarý birbirinden farklý ise “Çeþitkenar üçgen yazdýrýn
		 */
		
				
		System.out.println("Lütfen Ucgenin kenar uzunluðunu giriniz");
		int kenar1 = scan.nextInt();
		System.out.println("Lütfen diger kenar uzunluðunu giriniz");
		int kenar2 = scan.nextInt();
		System.out.println("Lütfen öteki kenar uzunluðunu giriniz");
		int kenar3 =scan.nextInt();
		
		if (kenar1==kenar2 && kenar1==kenar2) {
			System.out.println("Eþkenar Uçgen");
		}else if (kenar1==kenar2 &&kenar1!=kenar3 || kenar1 ==kenar3 && kenar1!=kenar2 ||kenar2==kenar3 && kenar2!=kenar1) {
			System.out.println("Ýkizkenar Uçgen");
		}else if (kenar1!=kenar2 && kenar1!=kenar3) {
			System.out.println("Çeþitkenar uçgen");
		}
				
		
		scan.close();
		
		
	}

}
