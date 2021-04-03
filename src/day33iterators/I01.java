package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {

		
		List <String> list1 = new ArrayList <>();
		
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		
		System.out.println(list1);
		
		// List bir içindeki her elemanýn sonuna "A" harfini ekleyin.
		
		for (String w : list1) {
			
			w = w + "A";
		}
		System.out.println(list1);
	
		
		
		
		ListIterator <String> li1 = list1.listIterator();		
		
		while (li1.hasNext()) {
			Object element = li1.next();
			li1.set(element + "A");
		}
		System.out.println(list1);
		
		
		/*
		 String bir list oluþturun her elemanýnýn baþýna "K" sonuna "L" ekleyip
		 yeni listi ekrana yazadýrýn. 
		 */
		
		List <String> list2 = new ArrayList <>();
		
		list2.add("Java");
		list2.add("Selenium");
		list2.add("Github");
		
		ListIterator <String> li2 = list2.listIterator();
		
		while (li2.hasNext()) {
			Object element = li2.next();
			li2.set("K" + element + "L");
		}
		
	System.out.println(list2);
	
	
	
	}
	

}
