package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaReview2 {

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
	    
	    
	// Listeki isimlerden "a" ve "n" i�erenlerin harf say�s�n�n toplam�n� yazd�r�n
	    
	    System.out.println(list.stream().filter(t->t.contains("a")&& t.contains("n")).
	    		mapToInt(t->t.length()).sum());
	
	    // Listeki isimlerden ilk harfi son harfinden alfabedik olarak �nde olan iimleri yaz�
	    // T�m harflerin k���k harf olarak d���n�z
	    
	    list.stream().map(t->t.toLowerCase()).filter(t->t.charAt(0)<t.charAt(t.length()-1)).
	    forEach (System.out::println);
	    
	    
	    
	    
	}

}
