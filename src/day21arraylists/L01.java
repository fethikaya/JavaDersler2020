package day21arraylists;


import java.util.ArrayList;
import java.util.List;
public class L01 {

	
	/*Arraylar�n uzunluklar� en ba�ta belirlenir ve bir daha de�i�tirilmez.
	 List'lerde ise list olu�turulurken uzunluk belirlemeye gerek yoktur, 
	 ��nk� listler eleman eklendik�e kendilerini b�y�t�rler, eleman silindik�e
	 kendilerini k���lt�rler. 
	 
	 2- Listler �ok kullan��l� methodlara sahiptir. Bu y�zden Array'a tercih ederler
	 
	 3- Arraylar primitv ve reference ile �al���r, elaman olarak kabul ederler.
	 	List'ler ise non-primitivleri elaman olarak kabul ederler. 
	 */
	
	
	public static void main(String[] args) {

		
		// List olu�turuma;
		
		//1.yol
		
		ArrayList <String> sl = new ArrayList<String>();
		
		// 2.yol
		ArrayList <String> sl1 = new ArrayList<>();
		
		// 3.yol
		List <String> sl2 = new ArrayList<>();
		
		System.out.println(sl2);  /// ��kt�
		
		sl2.add("A");  // eleman ekleme
		System.out.println(sl2);
		
		sl2.add("B");
		System.out.println(sl2);
		
		sl2.add("C");
		System.out.println(sl2);
		
		
		sl2.add(1, "X");
		System.out.println(sl2);	
	
		
		sl2.add(0, "Fethi");
	
		System.out.println(sl2);
	
	
	// Eleman say�s� bulma
		
		sl2.size();
			System.out.println(sl2);
		sl2.isEmpty();
			System.out.println(sl2);
		
			
			// Elma silme
		sl2.remove(0);		// 0 indeksli eleman� sil..
		sl2.remove("X");  // isted�imiz eleman� belirtip silmek.
		sl2.remove("F");  // E�er listede olmayan bir eleman� silmek istersek,listede olmad�� i�in silemez.
		System.out.println(sl2.remove("F"));  // bu �ekilde yazarsak FALSE verir. yani silmedi. 
		
		
		
		
		
		 System.out.println(sl2.remove("W"));//false
		 //Java'dan olmayan bir elemani remove etmesini isterseniz
		 //remove edemez ve list'i aynen oldugu gibi birakir.
		 System.out.println(sl2);//[A, C, B]
		 
		 //remove(index) ne return eder?
		 // sl3 ==> [A, C, B]
		 System.out.println(sl2.remove(1));//C
		 System.out.println(sl2);//[A, B]
		 
		//remove(eleman) ne return eder?
		// sl3 ==> [A, B] 
		 System.out.println(sl2.remove("A"));//true
		
	
	}

}
