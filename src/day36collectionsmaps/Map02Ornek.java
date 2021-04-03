package day36collectionsmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Map02Ornek {

	public static void main(String[] args) {

		// Size verilen bir yaz�da, hangi kelimenin ka� kere kulland���n� g�steren kodu yaz�n�z. 
		
		
		String s = "Java ogrenmek zevkliydi. Java ��renmek kolay, ama tekrar gerekiyor. Java tekrari zevkliydi ama vaktim yoktu.";
		
		String kelime [] = s.split(" ");
		System.out.println(Arrays.toString(kelime));
		
		HashMap <String,Integer> hm = new HashMap <> ();
		
		
		for (String w:kelime) {
			if (w.contains(".")) {
				w =w.replace(".", "");
				if (!hm.containsKey(w)) {
					hm.put(w, 1);
				}else {
					hm.put(w, hm.get(w)+1);
				}
				
			}else {
				if (!hm.containsKey(w)) {
					hm.put(w, 1);
				}else {
					hm.put(w, hm.get(w)+1);
			}
			
		}
		
	}
		System.out.println(hm);
}
}