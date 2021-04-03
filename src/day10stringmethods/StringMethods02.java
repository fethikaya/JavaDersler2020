package day10stringmethods;

import java.util.Scanner;

public class StringMethods02 {

	public static void main(String[] args) {
		
		
		
		// Karekter ve harflerin tamam�yla de�i�tirme
		String m = "Fethi 1979 Kaya";
		System.out.println(m.replaceAll("\\d", "*"));
		System.out.println(m.replaceAll("\\D", "*"));
		System.out.println(m.replaceAll("F", "*"));
		
		
		// Replace - Yer de�i�tirme, harf ve kelimenin yerini de�i�tirir...
		String l = "Bir bakm���z burday�z, Bir bakm���z ki ba�ka yerde";
		System.out.println(l.replace("yerde", "yerde yokuz"));
		
	
		
		
		
		/*
		// K���k harfleri b�y�k yapar
		String k = "d�yarbak�r etraf�nda ba�lar var";
		System.out.println(k.toUpperCase());
		
		
		
		// B�y�k harfleri k���k yapar
		String j = "DIYARBAKIR ETRAFINDA BA�LAR VAR";
		System.out.println(j.toLowerCase());

		/*
		
		// Ka� karakter oldu�unu g�sterir.
		String i = "Ah g�z�n� sevdi�im eski �ocukluk g�nleri";
		System.out.println(i.length());
		
		
		
		// sonu ne ile bitiyor?
		String h = "Yaz aylar� geldi, hava s�cak m�?";
		System.out.println(h.endsWith("s�cak m�?"));
		
		
		// kapsamak (arad���n karekterin metin i�inde olup olmad��n� kontrol eder
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
