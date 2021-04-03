package day21arraylists;


import java.util.ArrayList;
import java.util.List;
public class L01 {

	
	/*Arraylarýn uzunluklarý en baþta belirlenir ve bir daha deðiþtirilmez.
	 List'lerde ise list oluþturulurken uzunluk belirlemeye gerek yoktur, 
	 çünkü listler eleman eklendikçe kendilerini büyütürler, eleman silindikçe
	 kendilerini küçültürler. 
	 
	 2- Listler çok kullanýþlý methodlara sahiptir. Bu yüzden Array'a tercih ederler
	 
	 3- Arraylar primitv ve reference ile çalýþýr, elaman olarak kabul ederler.
	 	List'ler ise non-primitivleri elaman olarak kabul ederler. 
	 */
	
	
	public static void main(String[] args) {

		
		// List oluþturuma;
		
		//1.yol
		
		ArrayList <String> sl = new ArrayList<String>();
		
		// 2.yol
		ArrayList <String> sl1 = new ArrayList<>();
		
		// 3.yol
		List <String> sl2 = new ArrayList<>();
		
		System.out.println(sl2);  /// çýktý
		
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
	
	
	// Eleman sayýsý bulma
		
		sl2.size();
			System.out.println(sl2);
		sl2.isEmpty();
			System.out.println(sl2);
		
			
			// Elma silme
		sl2.remove(0);		// 0 indeksli elemaný sil..
		sl2.remove("X");  // istedðimiz elemaný belirtip silmek.
		sl2.remove("F");  // Eðer listede olmayan bir elemaný silmek istersek,listede olmadðý için silemez.
		System.out.println(sl2.remove("F"));  // bu þekilde yazarsak FALSE verir. yani silmedi. 
		
		
		
		
		
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
