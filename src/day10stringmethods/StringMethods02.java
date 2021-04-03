package day10stringmethods;

import java.util.Scanner;

public class StringMethods02 {

	public static void main(String[] args) {
		
		
		
		// Karekter ve harflerin tamamýyla deðiþtirme
		String m = "Fethi 1979 Kaya";
		System.out.println(m.replaceAll("\\d", "*"));
		System.out.println(m.replaceAll("\\D", "*"));
		System.out.println(m.replaceAll("F", "*"));
		
		
		// Replace - Yer deðiþtirme, harf ve kelimenin yerini deðiþtirir...
		String l = "Bir bakmýþýz burdayýz, Bir bakmýþýz ki baþka yerde";
		System.out.println(l.replace("yerde", "yerde yokuz"));
		
	
		
		
		
		/*
		// Küçük harfleri büyük yapar
		String k = "dýyarbakýr etrafýnda baðlar var";
		System.out.println(k.toUpperCase());
		
		
		
		// Büyük harfleri küçük yapar
		String j = "DIYARBAKIR ETRAFINDA BAÐLAR VAR";
		System.out.println(j.toLowerCase());

		/*
		
		// Kaç karakter olduðunu gösterir.
		String i = "Ah gözünü sevdiðim eski çocukluk günleri";
		System.out.println(i.length());
		
		
		
		// sonu ne ile bitiyor?
		String h = "Yaz aylarý geldi, hava sýcak mý?";
		System.out.println(h.endsWith("sýcak mý?"));
		
		
		// kapsamak (aradýðýn karekterin metin içinde olup olmadýðný kontrol eder
		String g = "Ah Almanya ah!";
		System.out.println(g.contains("fman"));
		
				
		String a = "Java";
		String b = "Java";
		String c = "Java";
		System.out.println(a==b);
		System.out.println(a.equals (b));
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println(b.equals(a));
		*/
		
		
		
		
		
		
		
	}

}
