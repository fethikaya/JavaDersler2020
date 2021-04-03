package day21arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {

		
		// Bir eleman de�i�tirme
		
		
	List <String> sl = new ArrayList <>();
	sl.add("Ali");	
	sl.add("Kemal");	
	sl.add("Ayse");	
	
	// eleman de�i�tirme
	
	sl.set(0, "Aliye");
	System.out.println(sl);
	
	// Eleman var m� yok mu
	
	sl.contains("X");
	System.out.println(sl);
	
	
	
	//  Natural order g�re nas�l dizilir? s�ralam... 
	// say� k���kten b�y��e, harf k���kten b�y�ye�
	
	Collections.sort(sl);
	System.out.println(sl);
	
	// Elemanlar� Natural Order'i tersten s�ralama
	// Say� b�y�kten k����e, kelime sondan ba�a
	
	Collections.reverse(sl); // tersine s�ralar
	System.out.println(sl);
	
	
	// List�n i�indeki t�m elemanlar� silmek
	
	sl.clear(); // Tamemen bo�alt�r
	System.out.println(sl);
	
	
	// �ki listin e�it olup olmad���n� kontrol etmek
	
	List <Integer> il1 = new ArrayList <>();
	il1.add(12);
	il1.add(13);
	il1.add(14);
	
	
	List <Integer> il2 = new ArrayList <>();
	il2.add(12);
	il2.add(13);
	il2.add(14);
		
	System.out.println(il1.equals(il2));
	
	
	}

}
