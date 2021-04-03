package day36collectionsmaps;

import java.util.HashMap;

public class Map01 {

	public static void main(String[] args) {

		HashMap <Integer,String> hm01 = new HashMap <> ();
		hm01.put(100, "Ali");
		hm01.put(101, "Emine");
		hm01.put(102, "Veli");
		hm01.put(103, "Ayþe");
		hm01.put(102, "XXXX"); // üstüne yazdý çünkü key ayný. 102
		hm01.put(104, "Ayþe");  // üstüne yazmadý cünkü key farklý
		hm01.put(null, "Fethi"); // Null kabul eder
		hm01.put(null, "Ilyas");  // ikinci defa nal key kabul etmez. üstüne yazar.
		hm01.put(105, "null"); // null kabul eder
		hm01.put(106, "null");
		hm01.put(107, "null");  // birden fazla kabul eder
		
		
		hm01.containsKey(102); // True  yoksa false
		System.out.println(hm01.containsKey(102));  // treu
		hm01.containsValue("Ilyas"); // true yoksa false
		System.out.println(hm01.containsValue("Ilyas")); //trau
		hm01.get(101); // Emine'yi yazdýrýr
		hm01.getOrDefault(101, "Öyle bir isim yok");// varsa yazar, yoksa öyle bir isim yok yazar
		hm01.keySet(); // tüm keyleri sýralayacak. Tüm keyleri bir arada görmek için kullanýrýz
		hm01.values(); // Tüm value'leri gösterir
		hm01.putIfAbsent(108, "Rohat"); // Eðer 108 yoksa oraya Raht'ý ekle
		hm01.remove(null); // Key null olaný sil
		hm01.remove(103, "Ayþe");  // Eðer 103 de ayþe varsa siller. iki þart da uymalý. Hem key hem value
		hm01.replace(102, "Mustafa"); // xxxx yerine mustafa yaz
		hm01.replace(105, null, "baver"); // 105 deki null'u bawer yap
		hm01.size(); // Kaç eleman var
		
		System.out.println(hm01);



		
	}

}
