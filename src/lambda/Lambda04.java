package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda04 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Jackson");
		list.add("Jackson");
		list.add("Tucker");
		list.add("Christ");
		
		buyukHarfSiraliTekrasiz1 (list);
		System.out.println("=============");
		buyukHarfSiraliTekrasiz2 (list);
		System.out.println("=============");
		charSayiTersSiraTekrarsiz (list);
		System.out.println("=============");
		charSayiSirala (list);
		System.out.println("=============");
		sonHarf (list);
		
	}

	// List elemanlarýnýn tamamný büyük olarak, alfabetik sýrada ve 
	//tekararlý elemanlarý sadece birkere consola yazýn
	
	
	// Lambda Expression
	public static void buyukHarfSiraliTekrasiz1 (List<String> list) {
		list.stream().map(t->t.toUpperCase()).sorted().distinct().forEach(System.out::println);
	}
	
	// Method Refrence
	public static void buyukHarfSiraliTekrasiz2 (List<String> list) {
		list.stream().map(String::toUpperCase).sorted().distinct().forEach(System.out::println);
	}
	
	// List elemanlarýnýn tamamný karketer sayýsýný ters sýralý olarak
		//tekararlý elemanlarý sadece birkere consola yazýn
	
	public static void charSayiTersSiraTekrarsiz (List<String> list) {
		list.stream().map (t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(Lambda01::printEl);;
	}
	
	// List elemanlarýnýn tamamýný character sayýsýna göre küçükten büyüðe console yazdýrýn
	
	
	public static void charSayiSirala (List<String> list) {
		list.stream().sorted(Comparator.comparing(t->t.length())).forEach(System.out::println);
	}
	
	// List elemanlarýnýn tamamýný son harflerine göre reversorder olarak yazdýrýn
	
	public static void sonHarf(List<String> list) {
		list.stream().
		sorted (Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
		forEach(System.out::println);
	}
	
}
