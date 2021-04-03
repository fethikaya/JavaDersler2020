package day18arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		
		
		
	
		
		/*
		
		 //  elemanli array girilecegini sorun ve tum elemanlari isteyin,
		 // Tum elemanlari ekrana yazdirin ve son elemani ilk eleman yapin
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen Arrays miktarý giriniz");
		int m = scan.nextInt();
				
		System.out.println("Lütfen Arrays elamanlarýný giriniz");
		int arr5 [] = new int [m];
		
		for (int i = 0; i < arr5.length; i++) {
			System.out.print((i+1) + ". deðer = ");
			arr5 [i]= scan.nextInt();
		}
		
		System.out.println("Girilen tüm deðerler : " + Arrays.toString(arr5));
		
		int son = arr5 [m-1];
		
		for (int j = 0; j<son; j++) {
		
			
		}arr5 [0] = son;
		
		System.out.println("Son Durum : "  + Arrays.toString(arr5));
		
		
	
		
		 //  Kac elemanli array girilecegini sorun ve tum elemanlari isteyin,
		 //  Tum elemanlari ekrana yazdirin ve son elemani ilk eleman yapin
		
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Kaç adet Arrays tanýmlaycaksýnýz ;");
		int adet=scan.nextInt();
		System.out.println(adet+" Lütfen diðer Array'leri giriniz ;");
		int arr[]= new int[adet];
		
		for(int i=0; i<adet;i++) {
			System.out.print((i+1)+". value =");
			arr[i]=scan.nextInt();
		}
		System.out.println("Tüm deðerler ;"+ Arrays.toString(arr));
		
		int laast=arr[adet-1];
		for(int j=0; j<adet-1 ;j++) {
			arr[adet-j-1]=arr[adet-j-2];
		}arr[0]=laast;
		System.out.println("New array ;"+ Arrays.toString(arr));	
		
		
		
		
		
		//---------------------------------------------
		 
		int arr7 [] = new int [5];
		arr7 [2] = 13;
		arr7 [4] =15;
		int arr6 [] = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr7));
		System.out.println(Arrays.toString(arr6));
	
		
			 
		
		//---------------------------------------------------------------
		 * 
		Kullanýcýya kaç elemanlý bir array gireceðini sorun.  
		Kullanýcýdan array’in elemanlarýný girmesini isteyin. 
		a) Bu array’in tum elemanlarýný ekrana yazdýrýn. 
		b) Bu arrayýn son elemanýný ilk eleman yapýn ve tum elemanlarýný ekrana yazdýrýn.       
		Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdýrýn.

		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen Arry deðerlerini giriniz");
		
		int arr5 [] = new int [5];
		
		
		for (int i = 0; i < arr5.length; i++) {
			arr5[i]=scan.nextInt();
			System.out.println("Deðer : " + arr5[i]);
			
		}
		
		
	
		
		 //---------------------------------
		  
		Bir array’de herhangi iki elemanýn ayný olup olmadýðýný 
		kontrol  eden bir program yazýnýz.
		Ayný eleman varsa “Ayný eleman var” yoksa  “Ayný eleman yok” yazdýrýnýz.
		
		
		char arrharf1 [] = {'b','c','d','f','g'};
		char arrharf2 [] = {'a','e','d','i','g'};		
		
		if (Arrays.equals(arrharf1, arrharf2)) {
			System.out.println("Ayný");
		}else {
			System.out.println("Farklý");
		}
		
		
		
		//--------------------------------
		 
	 	Length'i ayni olan iki array olusturunuz bu array'lerin tum elemanlari ayni ise 
		ekrana "Ayni" yazdirin farkli ise ekrana "Farkli" yazdirin. (loop kullanin)
	
		
		int arr3 [] = {2,4,6,8,10};
		int arr4 [] = {2,4,6,8,10};
		
		if (arr3 == arr4) {
			System.out.println("Ayný");
		}else {
			System.out.println("Farklý");
		}
		
		
		//----------------
		 
		 
		int arr3 [] = {2,4,7,8,10};
		int arr4 [] = {2,4,6,9,10};
		for (int i = 0; i < arr4.length; i++) {
			if (arr3 [i] == arr4[i]) {
				System.out.println("Ayný");
			}else {
				System.out.println("Farklý");
			}
		}
		
		
		
		 //-------------------------------
		
	
		 
		int arr3 [] = {2,4,6,8,10};
		int arr4 [] = {2,4,6,8,10};
		int z = 0;
		
		for (int i = 0 ; i<arr3.length; i++) {
			if (arr3 [i] == arr4[i]) {
				
				z++;
				
			} if (z==arr3.length) {
				System.out.println("Ayný");
			
			}else {
				System.out.println("Farklý");
			
			}
			
		}
		
		
	
		
		//---------------------------------------------------------------
		
		int arr2 [] = new int [3];
		arr2 [0] = 2;
		arr2 [1] = 4;
		arr2 [2] = 6;	
			System.out.println(arr2[0]); // 2
			System.out.println(arr2 [1]); //4
			System.out.println(arr2[2]); //6
		
		
		
		// Kýsa yol
		 
		int arr2_ [] = {2,4,6};
			System.out.print(Arrays.toString(arr2_)); // 2,4,6
	
		
		

		
		//-----------------------------------------
		
		int arr1 [] = new int [2];
			System.out.println(arr1[0]);
			System.out.println(arr1[1]);
		
		
		
		//------------------------------------------------------------
		
		int arr [] = {10,20,30,40,50};
		
		for (int i = 0; i<arr.length ; i++) {
			System.out.print(" " + arr[i]);
		}
		
		
		*/
		
		// scan.close();
	}

}
