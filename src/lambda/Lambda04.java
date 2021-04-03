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

	// List elemanlar�n�n tamamn� b�y�k olarak, alfabetik s�rada ve 
	//tekararl� elemanlar� sadece birkere consola yaz�n
	
	
	// Lambda Expression
	public static void buyukHarfSiraliTekrasiz1 (List<String> list) {
		list.stream().map(t->t.toUpperCase()).sorted().distinct().forEach(System.out::println);
	}
	
	// Method Refrence
	public static void buyukHarfSiraliTekrasiz2 (List<String> list) {
		list.stream().map(String::toUpperCase).sorted().distinct().forEach(System.out::println);
	}
	
	// List elemanlar�n�n tamamn� karketer say�s�n� ters s�ral� olarak
		//tekararl� elemanlar� sadece birkere consola yaz�n
	
	public static void charSayiTersSiraTekrarsiz (List<String> list) {
		list.stream().map (t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(Lambda01::printEl);;
	}
	
	// List elemanlar�n�n tamam�n� character say�s�na g�re k���kten b�y��e console yazd�r�n
	
	
	public static void charSayiSirala (List<String> list) {
		list.stream().sorted(Comparator.comparing(t->t.length())).forEach(System.out::println);
	}
	
	// List elemanlar�n�n tamam�n� son harflerine g�re reversorder olarak yazd�r�n
	
	public static void sonHarf(List<String> list) {
		list.stream().
		sorted (Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
		forEach(System.out::println);
	}
	
}
