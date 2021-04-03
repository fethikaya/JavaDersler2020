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
		harfSayisiReverse�lk (list); 
		harfSayisiReverse�lk2 (list);
		sonHarfSortSonEleman (list);
		sonHarfSortIlkHaricElemenlar (list);
		
	}
	
	// Karekter say�lar� �ift say�l� ememanlar�n kareler say�lar�n� hesaplayan, 
	// tekrarl� olanlar� sadece bir kere b�y�kten k����e yazd�ran bir program yaz�n�z
	
	
	public static void charCiftBuyuktenKucuke (List<String> list) {
		list.stream().
		filter(t->t.length()%2==0).
		map(t->t.length()*t.length()).		
		distinct().
		sorted (Comparator.reverseOrder()).
		forEach (Lambda01::printEl);
	}

	
	// T�m isimlerin 7'den fazla harf i�erdi�ini g�steren program� yaz�n�z
	// T�m isimlerin 7 veya 7 den az harf i�erdi�ini g�steren program� yaz�n�z
	
	public static void harfSayisi7denFazla (List<String> list) {
		boolean result = list.stream().allMatch(t->t.length()>7);
		if (result) {
			System.out.println("T�m elemanlar 7 veya 7 den az harf i�erir");
		}else {
			System.out.println("En az 1 elaman 7 veya 7 den az harf i�ermiyor");
		}
	}
	
	// Hi� bir eleman�n "x" ile ba�lamad���n� g�steren program� yaz�n�z
	public static void ilkHarfX (List<String> list) {
		boolean result = list.stream().noneMatch(t->t.startsWith("X"));
		if (result) {
			System.out.println("Hi� bir eleman 'X' ile basl�yor");
		}else {
			System.out.println("En az bir elaman 'X' ile basl�yor");
		}
	}
	
	// An �z 1 alam�nen "r" ile biti�ini g�steren program� yaz�n�
	public static void enAz1r (List<String> list) {
		boolean result = list.stream().anyMatch(t->t.endsWith("r"));
		if (result) {
			System.out.println("En az bir eleman 'r' ile bitiyor");
		}else {
			System.out.println("Hic bir eleman 'r' ile bitmiyor");
		}
			
	}
	
	
	// �simleri character sayilarin g�re b�y�kten k����e g�re dizdikten sonra ilk ismi yaz�n
	
	public static void harfSayisiReverse�lk (List<String> list) {
	Optional<String> ilkIsim =	list.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).findFirst();
	System.out.println(ilkIsim);
	}
	
	
	public static void harfSayisiReverse�lk2 (List<String> list) {
		Stream<String> ilkIsim =	list.stream().
		sorted(Comparator.comparing(t->t.toString().length()).reversed()).limit(1);
		System.out.println(Arrays.toString(ilkIsim.toArray()));
		// Streamlar yazd�r�lamaz. Bu y�zden ilkIsim'i array a �evirerek yazd�rd�k.  
		}
		
	// �simleri son harflerine g�re s�ralad�ktan sonra son ismi ekrana yazd�r�nz
	
	public static void sonHarfSortSonEleman (List<String> list) {
		Optional <String> sonIsim = list.
		stream().sorted(Comparator.comparing(t->t.toString().
		charAt(t.toString().length()-1)).
		reversed()).findFirst();
		System.out.println(sonIsim);
	}
	
	
	// �simleri son harflerine g�re s�ralad�ktan sonra ilk isim hari� di�erlerini yazd�r�n�z	
	
	public static void sonHarfSortIlkHaricElemenlar (List<String> list) {
		list.stream().sorted(Comparator.comparing (t->t.toString().charAt(t.toString().length()-1))).
		skip(1).forEach(System.out::println); // Skip atla. skip (1) ilk elaman� alma di�erlerin al
	}
}
