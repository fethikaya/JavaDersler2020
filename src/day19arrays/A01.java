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
		
		
		
		//Bir string array olu�turun alfabedik s�raya g�re ba�tan ve sondan ikinci elamanlar�n� yazd�n
		
		
		String arr3 [] = {"Fethi", "Kaya","Java","Hava","Ak�am","Yol","Turkiye"};
		
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		System.out.println("Ba�ta ikinci :  " + arr3[1] );
		System.out.println("Sonda ikinci : " + arr3[arr3.length-2]);
		
		/*
		 
		
		// Bir integer array deki en b�y�k ve en k���k sayiyi ekrana yazd�r�n�z..
		
		int irr [] = {13,9,6,18,23,7,11};
		Arrays.sort(irr);
		System.out.println(Arrays.toString(irr)); // 
		System.out.println("En K���k :  " + irr[0] );
		System.out.println("En B�y�k : " + irr[irr.length-1]);
		
		
		//-----------------------------------------------------------
		
		
		String arr1 [] = {"Ali", "Veli" , "Can" , "Fadime"};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		
		//-----------------------------------------------------
		
		// Bir String arry olu�turun ve elamanlar�n� alfabedik s�ralamaya g�re dizin.
		
		char arr1 [] = {'f','e','t','h','i'};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//---------------------------------------
		
		int arr [] = {3,7,1,18};
		
		
		// Array elamanlar�n� k���kten b�y��e s�ralama
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		*/
		
		
		
	}

}
