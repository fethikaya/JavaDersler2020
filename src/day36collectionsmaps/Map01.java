package day36collectionsmaps;

import java.util.HashMap;

public class Map01 {

	public static void main(String[] args) {

		HashMap <Integer,String> hm01 = new HashMap <> ();
		hm01.put(100, "Ali");
		hm01.put(101, "Emine");
		hm01.put(102, "Veli");
		hm01.put(103, "Ay�e");
		hm01.put(102, "XXXX"); // �st�ne yazd� ��nk� key ayn�. 102
		hm01.put(104, "Ay�e");  // �st�ne yazmad� c�nk� key farkl�
		hm01.put(null, "Fethi"); // Null kabul eder
		hm01.put(null, "Ilyas");  // ikinci defa nal key kabul etmez. �st�ne yazar.
		hm01.put(105, "null"); // null kabul eder
		hm01.put(106, "null");
		hm01.put(107, "null");  // birden fazla kabul eder
		
		
		hm01.containsKey(102); // True  yoksa false
		System.out.println(hm01.containsKey(102));  // treu
		hm01.containsValue("Ilyas"); // true yoksa false
		System.out.println(hm01.containsValue("Ilyas")); //trau
		hm01.get(101); // Emine'yi yazd�r�r
		hm01.getOrDefault(101, "�yle bir isim yok");// varsa yazar, yoksa �yle bir isim yok yazar
		hm01.keySet(); // t�m keyleri s�ralayacak. T�m keyleri bir arada g�rmek i�in kullan�r�z
		hm01.values(); // T�m value'leri g�sterir
		hm01.putIfAbsent(108, "Rohat"); // E�er 108 yoksa oraya Raht'� ekle
		hm01.remove(null); // Key null olan� sil
		hm01.remove(103, "Ay�e");  // E�er 103 de ay�e varsa siller. iki �art da uymal�. Hem key hem value
		hm01.replace(102, "Mustafa"); // xxxx yerine mustafa yaz
		hm01.replace(105, null, "baver"); // 105 deki null'u bawer yap
		hm01.size(); // Ka� eleman var
		
		System.out.println(hm01);



		
	}

}
