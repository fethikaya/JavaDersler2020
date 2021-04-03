package day35collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class Ts01 {

	public static void main(String[] args) {

		LocalTime time1 =LocalTime.now();
		System.out.println(time1);
		
		
		TreeSet <String> ts01 = new TreeSet <> ();
		ts01.add("Apple");
		ts01.add("Mango");
		ts01.add("Grape");
		ts01.add("Fig");
		ts01.add("Orange");
		ts01.add("Peach");
		System.out.println(ts01); // [Apple, Fig, Grape, Mango, Orange, Peach]
		
		// TreeSett de elemanlar Natural Order'a(Alfabedik sýra) göre sýrlanýrlar. 
		
		LocalTime time2 =LocalTime.now();
		System.out.println(time2);
		
		
		
		
		HashSet <String> hs01 = new HashSet <> ();
		hs01.add("Apple");
		hs01.add("Mango");
		hs01.add("Grape");
		hs01.add("Fig");
		hs01.add("Banana");
		hs01.add("Orange");
		System.out.println(hs01);
		
		LocalTime time3 =LocalTime.now();
		System.out.println(time3);
		
		
		
		
		HashSet <String> hs02 = new HashSet <> ();
		hs02.add("Apple");
		hs02.add("Mango");
		hs02.add("Grape");
		hs02.add("Fig");
		hs02.add("Banana");
		hs02.add("Orange");
		System.out.println(hs02);
		TreeSet <String> ts02 = new TreeSet <> (hs02);  // HashSeti TreeSete çevirdi
		System.out.println(ts02);
		
		LocalTime time4 =LocalTime.now();
		System.out.println(time4);
	}

}
