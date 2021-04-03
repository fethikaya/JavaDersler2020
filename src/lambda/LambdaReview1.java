package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaReview1 {

	public static void main(String[] args) {

		
		List<Integer> list = new ArrayList<Integer>();
		    list.add(12);
		    list.add(9);
		    list.add(13);
		    list.add(4);
		    list.add(6);
		    list.add(2);
		    list.add(4);
		    list.add(12);
		    list.add(15);

		
		// Print all odd numbers from the list [12, 9, 13, 4, 6, 2, 4, 12, 15] by Functional Programming
		
		list.stream().filter(t->t%2!=0).forEach(Lambda01::printEl);    
		System.out.println();
		
// Listeki 6 ile 14 arasýndaki tüm sayýlarýn karesini ekran ayadýnýz
		    
		list.stream().filter(t->t>6&&t<14).map(t->t*t).forEach(Lambda01::printEl); 
		
		System.out.println();
		// 1. yol
		// Listeki tek tam sayýlarýn kareköklerin toplamýný ekrana yazýnýz
		System.out.println(list.stream().filter(t->t%2!=0).map(Math::sqrt).reduce(Double::sum));
		
		
		//2.yol
		System.out.println(list.stream().filter(t->t%2!=0).mapToDouble(Math::sqrt).sum());
	}

}
