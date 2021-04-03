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
	    
	    
	// Listeki isimlerden "a" ve "n" içerenlerin harf sayýsýnýn toplamýný yazdýrýn
	    
	    System.out.println(list.stream().filter(t->t.contains("a")&& t.contains("n")).
	    		mapToInt(t->t.length()).sum());
	
	    // Listeki isimlerden ilk harfi son harfinden alfabedik olarak önde olan iimleri yazý
	    // Tüm harflerin küçük harf olarak düþünüz
	    
	    list.stream().map(t->t.toLowerCase()).filter(t->t.charAt(0)<t.charAt(t.length()-1)).
	    forEach (System.out::println);
	    
	    
	    
	    
	}

}
