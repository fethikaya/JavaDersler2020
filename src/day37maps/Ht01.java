package day37maps;

import java.util.Hashtable;

public class Ht01 {

	public static void main(String[] args) {

		Hashtable <Integer, String> ht = new Hashtable <> ();
		ht.put(100, "Ali");
		ht.put(101, "Veli");
		ht.put(102, "Aylin");
		ht.put(103, "Emine");
	//	ht.put(null, "Ramazan"); // HashTable de key i�in null kullan�lamaz. 
								// Kullan�l�rsa NullPointerException verir. 
	//	ht.put(104, null); 		// HashTable de key i�in null kullan�lamaz.
		
	/*Soru: HashMap ile Hashtable'in farki nedir?
	 Cevap: 1)HashMap not-synchronized ve not-threadsafe'dir ama Hashtable synchronized ve threadsafe'dir.
	    2)HashMap 1 tane null key ve 1'den fazla null value kabul eder ama Hashtable key icin de value icin de null kabul etmez.
	    3)HashMap hizli, HashTable yavastir.
	 
	 */
		
		ht.get(100);
		System.out.println(ht.get(100));
		ht.putIfAbsent(101, "Kemal"); //E�er 101 bo� ise oraya kemal yazar. ama bo� de�ilse yazamaz
		System.out.println(ht);
		
		
		
	}

}
