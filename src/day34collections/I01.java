package day34collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);//[X, Y, Z]
		
		// List'i [ZA, YA, XA] �ekline d�n��t�r�n. 
		// Tersten yazarak sonuna A ekleyin. Iterator kullan�n.
		
		ListIterator <String> li1 = list1.listIterator();
		
		while (li1.hasNext()) {
			Object el = li1.next();
			li1.set(el + "A");
		}
		System.out.println(list1);
		
	// HasPrevious () ve Previous () methotlar� kullanmak i�in, �ncesinde hasNext ve Next methotlar�n�
	// kullanman�z pointire en sa�a ta��mak i�in kullanmak gerekir.
		
		
		while (li1.hasPrevious()) {
			Object el = li1.previous();
			
			System.out.print(el + " ");
		}
		
	}

}
