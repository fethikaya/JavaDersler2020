package day18arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		
		
		
	
		
		/*
		
		 //  elemanli array girilecegini sorun ve tum elemanlari isteyin,
		 // Tum elemanlari ekrana yazdirin ve son elemani ilk eleman yapin
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen Arrays miktar� giriniz");
		int m = scan.nextInt();
				
		System.out.println("L�tfen Arrays elamanlar�n� giriniz");
		int arr5 [] = new int [m];
		
		for (int i = 0; i < arr5.length; i++) {
			System.out.print((i+1) + ". de�er = ");
			arr5 [i]= scan.nextInt();
		}
		
		System.out.println("Girilen t�m de�erler : " + Arrays.toString(arr5));
		
		int son = arr5 [m-1];
		
		for (int j = 0; j<son; j++) {
		
			
		}arr5 [0] = son;
		
		System.out.println("Son Durum : "  + Arrays.toString(arr5));
		
		
	
		
		 //  Kac elemanli array girilecegini sorun ve tum elemanlari isteyin,
		 //  Tum elemanlari ekrana yazdirin ve son elemani ilk eleman yapin
		
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Ka� adet Arrays tan�mlaycaks�n�z ;");
		int adet=scan.nextInt();
		System.out.println(adet+" L�tfen di�er Array'leri giriniz ;");
		int arr[]= new int[adet];
		
		for(int i=0; i<adet;i++) {
			System.out.print((i+1)+". value =");
			arr[i]=scan.nextInt();
		}
		System.out.println("T�m de�erler ;"+ Arrays.toString(arr));
		
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
		Kullan�c�ya ka� elemanl� bir array girece�ini sorun.  
		Kullan�c�dan array�in elemanlar�n� girmesini isteyin. 
		a) Bu array�in tum elemanlar�n� ekrana yazd�r�n. 
		b) Bu array�n son eleman�n� ilk eleman yap�n ve tum elemanlar�n� ekrana yazd�r�n.       
		Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazd�r�n.

		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen Arry de�erlerini giriniz");
		
		int arr5 [] = new int [5];
		
		
		for (int i = 0; i < arr5.length; i++) {
			arr5[i]=scan.nextInt();
			System.out.println("De�er : " + arr5[i]);
			
		}
		
		
	
		
		 //---------------------------------
		  
		Bir array�de herhangi iki eleman�n ayn� olup olmad���n� 
		kontrol  eden bir program yaz�n�z.
		Ayn� eleman varsa �Ayn� eleman var� yoksa  �Ayn� eleman yok� yazd�r�n�z.
		
		
		char arrharf1 [] = {'b','c','d','f','g'};
		char arrharf2 [] = {'a','e','d','i','g'};		
		
		if (Arrays.equals(arrharf1, arrharf2)) {
			System.out.println("Ayn�");
		}else {
			System.out.println("Farkl�");
		}
		
		
		
		//--------------------------------
		 
	 	Length'i ayni olan iki array olusturunuz bu array'lerin tum elemanlari ayni ise 
		ekrana "Ayni" yazdirin farkli ise ekrana "Farkli" yazdirin. (loop kullanin)
	
		
		int arr3 [] = {2,4,6,8,10};
		int arr4 [] = {2,4,6,8,10};
		
		if (arr3 == arr4) {
			System.out.println("Ayn�");
		}else {
			System.out.println("Farkl�");
		}
		
		
		//----------------
		 
		 
		int arr3 [] = {2,4,7,8,10};
		int arr4 [] = {2,4,6,9,10};
		for (int i = 0; i < arr4.length; i++) {
			if (arr3 [i] == arr4[i]) {
				System.out.println("Ayn�");
			}else {
				System.out.println("Farkl�");
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
				System.out.println("Ayn�");
			
			}else {
				System.out.println("Farkl�");
			
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
		
		
		
		// K�sa yol
		 
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
