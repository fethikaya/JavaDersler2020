package day16constructors;

import java.util.Scanner;

public class Ornek {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// dowhile kullanarak 1-10 rasý sayýlarý ekrana yazdýnýz
		
		
		int i = 0;
		
		do {
			System.out.print(i + ",");
			i++;
		}while (i<=10);
		
		
		/*
		
		//----------------------------------------------
		
		// ilk 5 bölünebilen 30 sayma sayýsýný büyükten küçüðe yazýnýz
		
		
		int i = 30;
		while (i>=0) {
			if (i%5==0) {
				System.out.print(i+ ",");
				
			}
			i--;
		}
		
		
		//-------------------
		 
		for (int i=10; i>=0;i--) {
			System.out.print(i +",");
		}
		
		
		//-------------------------------------
		
			
		// ilk 100 çift sayma sayýsýný yazdýran program yazýnýz
		
		int k = 0;
		
		while (k<=100) {
			if (k%2==0) {
			
				System.out.print(k + ",");
			}
			k ++;
		}
			
		
		
	
		
		// j den önceki tüm küçük harfleri yazdýran bir program yazdýrýnýz
		
		char i = 'a';
		while (i<='f') {
			i++;
			System.out.print(i + ",");
		}
			
		
		
		
		 
		//----------------------------------------
		 		
		// silk 5 harfin ASCII deðrleri toplamýný ekrana yazdýrýnz
		
		int sum = 0;

		char i = 'c';
		while (i<= 'h') {
			sum = sum +i;
			i++;
			System.out.println(sum);
		}
		
		
		
		
		//-------------------------
		
	
		 Kullanýcýdan 4 basamaklý bir sayý alýnýz 
		 bu sayýnýn ilk iki rakamýn toplamý ile son ikirakamýn 
		 farkýný ekrena yazýnýz.
		
		
		System.out.println("Lütfen 4 basamaklý bir sayý giriniz");
		int b = scan.nextInt();
		int b4 = (b/1000)%10;
		int b3 =(b/100)%10;
		int b2 = (b/10)%10;
		int b1 = b%10;
				
		System.out.println((b4+b3) - (b2+b1)) ;
		
	
		
		 //----------------------------------------
		  
		 
		 0)Sayilari kullanicidan alin
		 1)Iki tane integer variable olusturun a=5 ve b=3 gibi
		 2)Sonra bu integerlarin degerlerinin yerlerini degistirin(swap) yani; a=3 ve b=5 olsun
		
		
		int a = 15;
		int b = 10;
		System.out.println(a +" "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a +" "+b);
				
				
		
				
		
		//-----------------------------------
		
		System.out.println("Lütfen kenar 1 uzunlugunu giriniz");
		double k1 = scan.nextDouble();

		System.out.println("Lütfen kenar 2 uzunlugunu giriniz");
		double k2 = scan.nextDouble();
		
		double alan = k1*k2;
		double cevre = 2*(k1+k2);
		
		System.out.println("Alan: " + alan + "cm");
		System.out.println("Cevre: " + cevre + "cm");
		
		
		
		//-----------------------------------------------------
		
		double r = scan.nextDouble();
		
		r = 7.5;
		double pi = 3.14;
		double alan = pi *r*r;
		
		System.out.println(alan);
		
		
		/--------------------------
		
		System.out.println("Lütfen Dairenin çevresini giriniz");
		int r = scan.nextInt();
		double pi = 3.14;
		double alan = pi *r*r;
		
		System.out.println(alan);
		
	
		//---------------------------------------------
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Lütfen iki sayý giriniz");
		  int num1 = scan.nextInt();
		  int num2 = scan.nextInt();
		  
		  // Write your code here
		  
		  System.out.println (num1 + num2);
		  System.out.println (num1 - num2);
		  System.out.println (num1 * num2);
		  System.out.println (num1 / num2);
		  System.out.println (num1 % num2);
		
		
		//------------------------------------
		
		
		 Scanner input = new Scanner (System.in);
		    System.out.println ("Lutfen 3 sayi giriniz");
		    
		  int num1 = input.nextInt();
	      int num2 = input.nextInt();
		  int num3 = input.nextInt();
	    
		    System.out.println (-num1+num2*num3);
		    System.out.println ((num1+num2)%num3);
		    System.out.println (num1+ -num2*5/num3);
		    System.out.println (num1+15/num2*2-num3%3);
		
		    */
		
	
		scan.close();
	}

}
