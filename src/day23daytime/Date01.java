package day23daytime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		
		// 275 gün sonranýn tarihini ekrana nasýl yazdýrýrz?
		
		ld.plusDays(275);
		System.out.println(ld.plusDays(275));
		
		ld.plusMonths(3);
		System.out.println(ld.plusMonths(3));
		
		ld.plusYears(3);
		System.out.println(ld.plusYears(3));
		
		// Geçmiþ Tarih bulma
		
		ld.minusDays(34);
		System.out.println(ld.minusDays(34));
		
		ld.minusMonths(6);
		System.out.println(ld.minusMonths(6));
		ld.minusYears(4);
		System.out.println(ld.minusYears(4));
		
		
		
		// Tarihi nasýl farklý formatta yazdýrabiliriz. 
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		dtf.format(ld);
		System.out.println(dtf.format(ld));
		
		
		// MM => Kaçýncý ay ==> MMM : ayýn ilk 3 harfi  / MMMM > Ay ismi tamami
		// d ==> 10 dan küçük günler için tek rakam basar, ama 10 ve yukarýsý için çift rakam
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/DD/yy");
		
		dtf1.format(ld);
		System.out.println(dtf1.format(ld));
		
		
	}

}
