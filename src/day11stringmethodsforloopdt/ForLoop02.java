package day11stringmethodsforloopdt;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen baþlangýç deðeri giriniz");
		int a = scan.nextInt();
		System.out.println("Lütfen bitiþ deðeri giriniz");
		int b = scan.nextInt();
		
		for (int i = a; i>=b ; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
			
		}
		scan.close ();
		
		/*
		
		System.out.println("Lütfen baþlangýç deðeri giriniz");
		int b = scan.nextInt();
		System.out.println("Lütfen bitiþ deðeri giriniz");
		int s = scan.nextInt();
		
		for (int i = b ; i<=s ; i++) {
			System.out.println(i);
		}
		
				
		
		
		
		
		
		System.out.println("Lütfen ülke adý giriniz");
		String ulke = scan.nextLine();
		System.out.print(ulke.toUpperCase().charAt(1));
		System.out.println(ulke.toUpperCase().charAt(5));
		
		
		
		System.out.println("Lütfen ülke adý giriniz");
		String ulke = scan.nextLine();
		System.out.print(ulke.toUpperCase().charAt(0));
		System.out.print(ulke.toUpperCase().charAt(1));
		
		
		
		
		System.out.println("Lütfen ülke adý giriniz");
		String ulke = scan.nextLine();
		
		switch (ulke) {
		case "Almanya":
			System.out.println("DE");
		break;
	
		case "Amerika":
			System.out.println("USA");
		break;
		
		case "Ingiltere":
			System.out.println("UK");
		break;
		
		default:
			System.out.println("NA");
		
		}
		
		
		
		
		
		
		System.out.println("Lütfen 5 rakamlý bir sayý girinz");
		String s = scan.nextLine();
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		
		
		
		
		System.out.println("Lütfen 16 haneli kart numaranizi giriniz");
	    
	    String card = scan.nextLine();
		System.out.println(card.charAt(2));
		System.out.println(card.charAt(3));
		System.out.println(card.charAt(15));
		
		
		
			
		
		System.out.println("Lütfen adinizi giriniz");
		String ad = scan.nextLine();
		System.out.println("Lütfen soyadýnýzý giriniz");
		String soy = scan.nextLine();
		
		System.out.println(ad.toUpperCase().charAt(0));
		System.out.println(soy.toUpperCase().charAt(0));
		
		
		/*
		
		System.out.println("Lütfen adýnýzý ve soyadýnýzý giriniz");
		String as = scan.nextLine();
				
		System.out.println(as.length());
				
		
		
		
		
		System.out.println(e.trim());
		System.out.println(f.substring(8,14));
		System.out.println(f.indexOf("i"));
		System.out.println(f.startsWith("B"));
		System.out.println(f.equalsIgnoreCase("Gün"));
		System.out.println(e.replaceAll("\\d", "*"));
		System.out.println(f.replace("dan gidersem", "da kalýrsam"));
		System.out.println(f.toLowerCase()); // hepsi küçük (toLowerCase)
		System.out.println(f.toUpperCase()); // Hepsi büyük (toUpperCase)
		System.out.println(f.length()); // 32  (Lenghth metodu)
		System.out.println(f.endsWith("r")); // True (endsWith)
		System.out.println(f.contains("gün")); //True (Contains)
		System.out.println(f.charAt(5)); // Ü  (CharAt methodu)
		
		*/
		
	}

}
