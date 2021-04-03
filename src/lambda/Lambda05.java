package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Lambda05 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Mariano");
		list.add("Alberto");
		list.add("Tucker");
		list.add("Christ");
		
		charCiftBuyuktenKucuke (list);
		System.out.println();
		harfSayisi7denFazla (list);
		System.out.println();
		ilkHarfX (list);
		System.out.println();
		enAz1r (list);
		harfSayisiReverseÝlk (list); 
		harfSayisiReverseÝlk2 (list);
		sonHarfSortSonEleman (list);
		sonHarfSortIlkHaricElemenlar (list);
		
	}
	
	// Karekter sayýlarý çift sayýlý ememanlarýn kareler sayýlarýný hesaplayan, 
	// tekrarlý olanlarý sadece bir kere büyükten küçüðe yazdýran bir program yazýnýz
	
	
	public static void charCiftBuyuktenKucuke (List<String> list) {
		list.stream().
		filter(t->t.length()%2==0).
		map(t->t.length()*t.length()).		
		distinct().
		sorted (Comparator.reverseOrder()).
		forEach (Lambda01::printEl);
	}

	
	// Tüm isimlerin 7'den fazla harf içerdiðini gösteren programý yazýnýz
	// Tüm isimlerin 7 veya 7 den az harf içerdiðini gösteren programý yazýnýz
	
	public static void harfSayisi7denFazla (List<String> list) {
		boolean result = list.stream().allMatch(t->t.length()>7);
		if (result) {
			System.out.println("Tüm elemanlar 7 veya 7 den az harf içerir");
		}else {
			System.out.println("En az 1 elaman 7 veya 7 den az harf içermiyor");
		}
	}
	
	// Hiç bir elemanýn "x" ile baþlamadýðýný gösteren programý yazýnýz
	public static void ilkHarfX (List<String> list) {
		boolean result = list.stream().noneMatch(t->t.startsWith("X"));
		if (result) {
			System.out.println("Hiç bir eleman 'X' ile baslýyor");
		}else {
			System.out.println("En az bir elaman 'X' ile baslýyor");
		}
	}
	
	// An üz 1 alamünen "r" ile bitiðini gösteren programý yazýný
	public static void enAz1r (List<String> list) {
		boolean result = list.stream().anyMatch(t->t.endsWith("r"));
		if (result) {
			System.out.println("En az bir eleman 'r' ile bitiyor");
		}else {
			System.out.println("Hic bir eleman 'r' ile bitmiyor");
		}
			
	}
	
	
	// Ýsimleri character sayilarin göre büyükten küçüðe göre dizdikten sonra ilk ismi yazýn
	
	public static void harfSayisiReverseÝlk (List<String> list) {
	Optional<String> ilkIsim =	list.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).findFirst();
	System.out.println(ilkIsim);
	}
	
	
	public static void harfSayisiReverseÝlk2 (List<String> list) {
		Stream<String> ilkIsim =	list.stream().
		sorted(Comparator.comparing(t->t.toString().length()).reversed()).limit(1);
		System.out.println(Arrays.toString(ilkIsim.toArray()));
		// Streamlar yazdýrýlamaz. Bu yüzden ilkIsim'i array a çevirerek yazdýrdýk.  
		}
		
	// Ýsimleri son harflerine göre sýraladýktan sonra son ismi ekrana yazdýrýnz
	
	public static void sonHarfSortSonEleman (List<String> list) {
		Optional <String> sonIsim = list.
		stream().sorted(Comparator.comparing(t->t.toString().
		charAt(t.toString().length()-1)).
		reversed()).findFirst();
		System.out.println(sonIsim);
	}
	
	
	// Ýsimleri son harflerine göre sýraladýktan sonra ilk isim hariç diðerlerini yazdýrýnýz	
	
	public static void sonHarfSortIlkHaricElemenlar (List<String> list) {
		list.stream().sorted(Comparator.comparing (t->t.toString().charAt(t.toString().length()-1))).
		skip(1).forEach(System.out::println); // Skip atla. skip (1) ilk elamaný alma diðerlerin al
	}
}
