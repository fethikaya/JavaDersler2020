package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ifelseif04 {

	public static void main(String[] args) {

		/* Kullanýcadan iki not alýn, ortalama 
		  not 50'nin altýnda ise 'Kaldýnýz'
		  not 70'in altýnda ise 'C ile geçtiniz' yazsýn
		  85'in altýnda ise 'b' ile geçtiniz
		  100 ve 100 altýnda ise 'a ile geçtiniz' yazsýn
		  diðer durumlarda ise 'Geçerli not giriniz'
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen ilk notu giriniz");
		int not1 = scan.nextInt();
		System.out.println("Lütfen ikinci notu giriniz");
		int not2 = scan.nextInt();
		
		double ortalama = (not1+not2)/2.0;
		
		if (not1<0 || not2<0) {
			System.out.println("Geçerli not giriniz");
		}else if (not1>100 || not2>100) {
			System.out.println("Geçerli not giriniz");
		}else if (ortalama<50) {
			System.out.println("Kaldýnýz");
			System.out.println(ortalama);
		}else if (ortalama<70) {
			System.out.println("C ile geçtiniz");
			System.out.println(ortalama);
		}else if (ortalama<85) {
			System.out.println("B ile geçtiniz");
			System.out.println(ortalama);
		}else if (ortalama<=100) {
			System.out.println("A ile geçtiniz");
			System.out.println(ortalama);		
		}
		
		scan.close ();
		
		
		
				
		
		
		
		
		
	}

}
