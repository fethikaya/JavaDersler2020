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
		
		linkedList.addLast("Ay�e");
		System.out.println(linkedList);
		
		
		linkedList.addAll(linkedList2); // addAll () kulland���n�z ilk list de�i�ir, parantzin i�indekilist de�i�mez
		System.out.println(linkedList);
		
		linkedList.addAll(5, linkedList2);
		System.out.println(linkedList);
		
		linkedList.remove();  // ilk elaman� siler
		System.out.println(linkedList);
		
		
		linkedList.remove(1) ; // indeksi 1 olan� siler
		System.out.println(linkedList);
		
		
		linkedList.remove("Canan");  // Canan� silecek
		System.out.println(linkedList);
		
		linkedList.remove("Saz");  // Olmayan eleman� silemez, eror vermez. ve silme yapamaz. 
		System.out.println(linkedList);
		
		linkedList.remove("YYYY");  // Ayn� isimle farkl� elaman varsa, ilkini siler, 
		System.out.println(linkedList);
		
		linkedList.removeFirstOccurrence("ZZZZ");// �lk g�rd���n ZZZZ'yi sil
		System.out.println(linkedList);
		
		linkedList.removeLastOccurrence("XXXX"); // Son g�r�n�m� sil, En sonda yer alan� sil
		System.out.println(linkedList);
		
		linkedList.removeAll(linkedList2);  // linkedList2'deki t�m elamanlar� siler. 
		System.out.println(linkedList);
		
		
		linkedList.removeFirst();  // �lk elaman� siler
		System.out.println(linkedList);
		
		linkedList.removeLast();  // Son elaman� siler 
		System.out.println(linkedList);
		
		linkedList.removeIf(t->t.contains ("a")); // E�er elamanlar�n i�inde "a" harfi varsa sil. 
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
