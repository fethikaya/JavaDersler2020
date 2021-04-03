package day23daytime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time01 {

	public static void main(String[] args) {

		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		lt.plusMinutes(7);
		System.out.println(lt.plusMinutes(7));
		
		
		lt.plusHours(6);
		System.out.println(lt.plusHours(6));
		
		
		// Zamanda geri gitme
		
		lt.minusSeconds(23);
		System.out.println(lt.minusSeconds(23));
		
		
		
		//  Time formatý deðiþtirme
		// hh = 12 saatlik sistemi  = HH = 24 saatlik sistem
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf.format(lt));
				
		
		// Farklý Ülkelerde yerelsaat
		
		LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));
		
		LocalTime.now(ZoneId.of("Japan"));
		System.out.println(LocalTime.now(ZoneId.of("Japan")));
		
		
		LocalTime.now(ZoneId.of("Europe/Moscow"));
		System.out.println(LocalTime.now(ZoneId.of("Europe/Moscow")));
		
	}

}
