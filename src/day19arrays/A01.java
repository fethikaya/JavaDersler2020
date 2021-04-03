package day19arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {

		int arr[] = {12, 23, 12, 2, 3};

		Arrays.sort(arr);

		System.out.println(Arrays.binarySearch(arr, 5));
		
		
		//----------------------------
		/*
		int arr[] = {12, 23, 12, 2, 3};

		Arrays.sort(arr);

		System.out.println(Arrays.binarySearch(arr, 12));
		
		
		
		
		
		
		
		char arrCh[] = {'a', 'C', 'c', 'A', 'b'};

		Arrays.sort(arrCh);

		System.out.println(Arrays.toString(arrCh));
		
		
		
		//Bir string array oluþturun alfabedik sýraya göre baþtan ve sondan ikinci elamanlarýný yazdýn
		
		
		String arr3 [] = {"Fethi", "Kaya","Java","Hava","Akþam","Yol","Turkiye"};
		
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		System.out.println("Baþta ikinci :  " + arr3[1] );
		System.out.println("Sonda ikinci : " + arr3[arr3.length-2]);
		
		/*
		 
		
		// Bir integer array deki en büyük ve en küçük sayiyi ekrana yazdýrýnýz..
		
		int irr [] = {13,9,6,18,23,7,11};
		Arrays.sort(irr);
		System.out.println(Arrays.toString(irr)); // 
		System.out.println("En Küçük :  " + irr[0] );
		System.out.println("En Büyük : " + irr[irr.length-1]);
		
		
		//-----------------------------------------------------------
		
		
		String arr1 [] = {"Ali", "Veli" , "Can" , "Fadime"};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		
		//-----------------------------------------------------
		
		// Bir String arry oluþturun ve elamanlarýný alfabedik sýralamaya göre dizin.
		
		char arr1 [] = {'f','e','t','h','i'};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//---------------------------------------
		
		int arr [] = {3,7,1,18};
		
		
		// Array elamanlarýný küçükten büyüðe sýralama
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		*/
		
		
		
	}

}
