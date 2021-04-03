package day21arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {

		
		// Bir eleman deðiþtirme
		
		
	List <String> sl = new ArrayList <>();
	sl.add("Ali");	
	sl.add("Kemal");	
	sl.add("Ayse");	
	
	// eleman deðiþtirme
	
	sl.set(0, "Aliye");
	System.out.println(sl);
	
	// Eleman var mý yok mu
	
	sl.contains("X");
	System.out.println(sl);
	
	
	
	//  Natural order göre nasýl dizilir? sýralam... 
	// sayý küçükten büyüðe, harf küçükten büyüyeð
	
	Collections.sort(sl);
	System.out.println(sl);
	
	// Elemanlarý Natural Order'i tersten sýralama
	// Sayý büyükten küçüðe, kelime sondan baþa
	
	Collections.reverse(sl); // tersine sýralar
	System.out.println(sl);
	
	
	// Listün içindeki tüm elemanlarý silmek
	
	sl.clear(); // Tamemen boþaltýr
	System.out.println(sl);
	
	
	// Ýki listin eþit olup olmadýðýný kontrol etmek
	
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
