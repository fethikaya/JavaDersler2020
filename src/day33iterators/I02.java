package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {

		
		List <String> list1 = new ArrayList <>();
		
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);
		
		ListIterator <String> li1 = list1.listIterator();		
		
		while (li1.hasNext()) {
			Object obj = li1.next();
			li1.remove();
						
		}
		System.out.println(list1);
		
	}

}
