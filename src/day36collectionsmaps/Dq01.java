package day36collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;

public class Dq01 {

	public static void main(String[] args) {

		Deque <String> dq01 = new LinkedList <> ();
		dq01.add("Ali");
		dq01.addFirst("Veli");
		dq01.addLast("Can");
		dq01.add("Ay�e");
		dq01.addFirst("Emine");
		dq01.addLast("Reyhan");
		
		System.out.println(dq01);
		
		dq01.element(); // ilk eleman� silmez, Silmeden g�sterir
		System.out.println(dq01.element());
	
	
		dq01.peek();
		System.out.println(dq01.peek());
		
		dq01.peekLast(); // Son eleman� silmeden return eder 
		System.out.println(dq01.peekLast());  
		
		dq01.poll();  // �lk eleman� silip getirir, cut yapar
		System.out.println(dq01.poll());
		
		dq01.pollLast(); //  Son eleman� silip getirir. 
		System.out.println(dq01.poll());
		
		System.out.println(dq01);
		
		
		
		
		
		
	}

}
