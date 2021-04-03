package day13dowhileloop;

import java.util.Scanner;

public class odev {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		int num = 0;

		int sum = 0;

				

		do {		

			System.out.println("Sayi giriniz");

			num = scan.nextInt();

			sum = sum + num;		

		}while(num!=0);



		System.out.println(sum);
		
		
		
		/*
		
		
		
String password = "";

		

		do {

			

			System.out.println("Passwordunuzu giriniz");

			password = scan.nextLine();

			

			if(!(password.equals("AliCan"))) {

				System.out.println("Yanlis");

			}

			

		}while(!(password.equals("AliCan")));



		System.out.println("Dogru");
		
		
		
		
		
		int num=0;

		do {	

		   if(num%2==0){	

			   System.out.print(num + " ");

		   }

		   num++;		

		}while(num<8);
		
		
		
		int num=0;

		do {		

			System.out.print(num + " ");

			num+=2;		

		}while(num<8);
		
		
		
		
		int num = 2;				

		do {			

			System.out.print(num + " ");

			num++;			

		}while(num>2);
		
		
		
		
		
		
		int numB=4;

		do {

			System.out.print(numB); 

			numB++;

		}while(numB<3);
		
		
		
		
		int numA=4;

		while(numA<3) {

			System.out.print(numA); 

			numA++;

		}
		
		
		
		
		
		String i = "";
		
		do {
			System.out.println("Lütfen bir String giriniz");
			i=scan.nextLine();
		}while (i.charAt(2) !='e');
		System.out.println("Küçük ses uyumu");
				
		
		
		
		String j = "";
		
		do {
			System.out.println("Lütfen bir String girin");
			j = scan.nextLine();
		
					
		}while (j.length()<10);
		System.out.println("Uzun kelime");
		
		
		
		
		
		String j = "";
		
		do {
							
				System.out.println("Bir String girin");
				j = scan.nextLine();
											
		}while (!j.contains("a"));
		System.out.println("a harfi var");
		
		
		
		
		
		
		
		
		
		String i = "";
		
		do {
			System.out.println("Bir String giriniz");
			i = scan.nextLine();
			
					
		}while (i.charAt(0) !=i.charAt(i.length()-1));
			System.out.println("Smetrik");
		
		
		
		
		
		
		
		
		
		
		
	
		 Kullanýcýya iki sayý girmesini söyleyin. 
		 Bu sayýlar eþit ise ekrana “Kare oluþturdunuz” yazdýrýn. 
		 Eþit deðilse tekrar iki sayý girmesini söyleyin.

				
	
		
		int s1 = 0;
		int s2 = 0;
		
		do {
		System.out.println("Lütfen iki sayý giriniz");
			s1 = scan.nextInt();
			s2 = scan.nextInt();
		}while (s1!=s2);
			System.out.println("Kare oluþturdunuz");
		
		
		
		
		
		
		
		  Kullanýcýya sayý girmesini söyleyin. 
		   Kullanýcý sýfýr girdiðinde, ekrana o ana kadar girmiþ olduðu  
		   tüm sayýlarýn toplamýný yazdýrýnýz. 
		   Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdýrýn 
		 
		 
		
		
		
		int r = 0;
		int sum =0;
		do {
			sum = sum+r;
			
			System.out.println("Lütfen birsayýyý giriniz");
			r = scan.nextInt();
		}while (r!=0);
			System.out.println(r+sum);
		
		
		
		/////////////////////////////////////////////////////////////////
		
		
	
		  Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn 
		ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten 4 ve 6 ile bölünebilen 
		tüm tamsayýlarý ekrana yazdýrýnýz. 
		
		
		
		System.out.println("Lütfen baþlangýç sayýyý giriniz");
		int s1 = scan.nextInt();
		System.out.println("Lütfen bitiþ sayýyý giriniz");
		int s2 = scan.nextInt();
		
		for (int i = s1; i<=s2 ;i++) {
			if (i%4==0 && i%6==0) {
				System.out.print(i +",");
			}
		}
		
		
		
		System.out.println("Lütfen baþlangýç sayýyý giriniz");
		int s1 = scan.nextInt();
		System.out.println("Lütfen bitiþ sayýyý giriniz");
		int s2 = scan.nextInt();
		
		int i = s1;
		while (i<=s2) {
			if (i%4==0 && i%6==0) {
				System.out.print(i + ",");
			}
			i++;
		}
		
		
		
		 
		System.out.println("Lütfen baþlangýç sayýyý giriniz");
		int s1 = scan.nextInt();
		System.out.println("Lütfen bitiþ sayýyý giriniz");
		int s2 = scan.nextInt();
		
		int i = s1;
		
		do {
			if (i%4==0 && i%6==0) {
				System.out.print(i + ",");
			}
			i++;
		} while (i<=s2);
		
		
	
		
		////////////////////////////////////////////////////////////////////
		
		
		// 9 den 190 e kadar 7 nin kati olan tüm tamsayýlarý ekrana yazdýrýnýz.
		 
		  //For
		 
		  
		for (int i=9 ; i<=190 ; i++) {
			if (i%7==0) {
				System.out.print(i+",");
			}
			
		}
		
	
	// While	
		
		int i = 9;
		while (i<=190) {
			if (i%7==0) {
				System.out.print(i + ",");
			}
			
			i++;
		}
		
		
		
	// DoWhile
		
		int i = 9;
		do {
			if (i%7==0) {
				System.out.print(i+ ",");
			}
			
			i++;
		}while (i<=190);
		
		
		*/
		
		
		
		
		
		
	}

}
