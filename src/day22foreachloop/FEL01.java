package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FEL01 {

	public static void main(String[] args) {

		
		List <Integer> il = new ArrayList <>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		il.add(26);
		
		for (Integer w : il) {
			
		
	
	// il list'in tüm elemanlarýný toplayýnýz.
			
			int sum = 0;
			for (Integer w1 : il) {
				sum = sum + w1;
			}
			
			System.out.println(sum);
			
		
		}
		
		
		// il listin içindeke tek sayý elemanlarýn çarpýmýný bulunuz
		
		int product =1;
		for (Integer w : il) {
			if(w%2!=0) {
				product = product * w;
			}
			
		}
			System.out.println(product);
		
	
			
			
			
	// 		il listin içindeke tek sayý elemanlarýn ekrana yazdýrýn..
			
		for (int w: il) {
			if (w%2!=0) {
				System.out.println(w);
			}
		}
		
		
		// Break ve continue karþýlaþtýrmasý
		
		
		// il listin ilk uç elemanýný yazdýrýn
		
		int count = 0;
		
		for (Integer w : il) {
			if (count <3) {
				System.out.print(w + " ");
				count++;
			}
			
		}
		
		System.out.println();
		
		
		
		// 2. Yol // Break ile
		
		int count1 = 0;
		
		for (int w: il) {
			System.out.print(w + ",");
			count1++;
		if (count1 ==3) {
			break;
		}
			
		}
		
		
		// il listinden 3 ile bölünebilenleri ekrana yazdýrýn..
		
		// 1. yol
		System.out.println();
		
		for (int w: il) {
			if (w %3==0) {
				System.out.print(w+ ",");
			}
		}
		
		// 2.yol Continau
		
		System.out.println();
		
		for (int w : il) {
			if (w%3!=0) {
				continue;
			}
				 System.out.print(w + " ");
			
		}
		
		
		
		
		
		
		
		
	}

}
