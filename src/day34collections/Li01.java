package day34collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Li01 {

	public static void main(String[] args) {

		LinkedList <String> linkedList = new LinkedList <> ();
		linkedList.add("Veli");
		linkedList.add("Aliye");
		linkedList.add("Burhan");
		linkedList.add("Canan");
		linkedList.add("Kemal");
		linkedList.add("Rehyan");
		System.out.println(linkedList);
	
		LinkedList <String> linkedList2 = new LinkedList <> ();
		linkedList2.add("XXXX");
		linkedList2.add("YYYY");
		linkedList2.add("ZZZZ");
		System.out.println(linkedList2);
		
		
		
		linkedList.add(1, "Cemal");
		System.out.println(linkedList);
		
		linkedList.addFirst("Kaya");
		System.out.println(linkedList);
		
		linkedList.addLast("Ayşe");
		System.out.println(linkedList);
		
		
		linkedList.addAll(linkedList2); // addAll () kullandığınız ilk list değişir, parantzin içindekilist değişmez
		System.out.println(linkedList);
		
		linkedList.addAll(5, linkedList2);
		System.out.println(linkedList);
		
		linkedList.remove();  // ilk elamanı siler
		System.out.println(linkedList);
		
		
		linkedList.remove(1) ; // indeksi 1 olanı siler
		System.out.println(linkedList);
		
		
		linkedList.remove("Canan");  // Cananı silecek
		System.out.println(linkedList);
		
		linkedList.remove("Saz");  // Olmayan elemanı silemez, eror vermez. ve silme yapamaz. 
		System.out.println(linkedList);
		
		linkedList.remove("YYYY");  // Aynı isimle farklı elaman varsa, ilkini siler, 
		System.out.println(linkedList);
		
		linkedList.removeFirstOccurrence("ZZZZ");// İlk gördüğün ZZZZ'yi sil
		System.out.println(linkedList);
		
		linkedList.removeLastOccurrence("XXXX"); // Son görünümü sil, En sonda yer alanı sil
		System.out.println(linkedList);
		
		linkedList.removeAll(linkedList2);  // linkedList2'deki tüm elamanları siler. 
		System.out.println(linkedList);
		
		
		linkedList.removeFirst();  // İlk elamanı siler
		System.out.println(linkedList);
		
		linkedList.removeLast();  // Son elamanı siler 
		System.out.println(linkedList);
		
		linkedList.removeIf(t->t.contains ("a")); // Eğer elamanların içinde "a" harfi varsa sil. 
		System.out.println(linkedList);
		
		
		
		
		
		
		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		
		for(String w:list) {

			w = w+"1";

}

System.out.println(list);
		
		

Iterator<String> iterator = list.iterator();

while(iterator.hasNext()) {

			iterator.next();

			iterator.remove();

}

System.out.println(list);

	}

}
