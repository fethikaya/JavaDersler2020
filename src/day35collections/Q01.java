package day35collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q01 {

	public static void main(String[] args) {

		Queue <String> q01 = new LinkedList <> ();
		q01.add("Apple");
		q01.add("Mango");
		q01.add("Grape");
		q01.add("Fig");
		q01.add("Peach");
		
		
		System.out.println(q01);
		
		q01.remove();
		System.out.println(q01); // Ýlk elemaný siler. ilk yazýlan ilk silinir
		
		q01.element(); // Ýlk elemaný verir,(ilk elaman hangisi onu yazar) ama ilk elamaný queue'dan silinmez, copy-past
		System.out.println(q01.element());
		System.out.println(q01);
		
		q01.peek(); // Ýlk elemaný size verir, Queuedan silmez. element metohod dan farký, ilk eleman yoksa 'null' return eder
					// NoSuchElementException verir. 
		
		q01.poll(); // Ýlk elemaný verir, ama ilk elamaný queue'dan siler, cut-past
		System.out.println(q01.poll());
		System.out.println(q01);
		
		
		
		
		
		Queue <String> q02 = new PriorityQueue <> ();
		q02.add("Apple");
		q02.add("Mango");
		q02.add("Grape");
		q02.add("Fig");
		q02.add("Peach");
		
		System.out.println(q02);
		
		
		
		
	}

}
