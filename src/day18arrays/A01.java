package day18arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {

		
		
		int arr1 [] = new int [3];
		System.out.println(Arrays.toString(arr1));
		
		
		arr1 [2] =11;
		System.out.println(Arrays.toString(arr1));
		
		
		arr1 [1] = 9;
		System.out.println(Arrays.toString(arr1));
		
		arr1 [0] = 7;
		System.out.println(Arrays.toString(arr1));
		
		
		int arr2 []= {8,10,12,14};
		System.out.println(Arrays.toString(arr2));
		
		
		System.out.println(arr2[1]);
		System.out.println(arr2[0]);
		
		
		//--------------------------------------------------------------------
		
		// Her Arry'de son elemaný yazdýran kod ne olabilir
		
		int arr3 [] = {21,22,23,24,25,26,27};
		System.out.println(arr3[arr3.length-1]);
		
		//----------------------------------------------------------------

		
		// Bir Array oluþturunuz. tüm elamnlarýný for loop kullanarak ekrana ayný satýrda
		// ararýna boþluk koyarak yazdýrýnýz.
		
		int arr4 []= {2,4,6,8,10,12,14};
		
		for (int i = 0; i <arr4.length; i++) {
			System.out.print(arr4 [i] + " ");
		}
		
		//---------------------------------------------------------------
		
		
		/* Bir array oluþturunuz, Bu array'ýn indexi çift sayý olan elamanlarýný
		 while loop kullanarak ayný atýrda ve boþluk koyarakyazdýrýn.
		 */
		
		System.out.println();
		
		
		int arr5 []= {23,24,25,26,27,28,29};
		int i = 0;
		while (i < arr5.length) {
			if (i%2==0) {
				System.out.print(arr5[i] + ",");
			}
			i++;
		}
		
		
		//------------------------------------------------------------
		
		// 
		
		
	}

}
