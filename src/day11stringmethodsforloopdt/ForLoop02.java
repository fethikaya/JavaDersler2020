package day11stringmethodsforloopdt;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen ba�lang�� de�eri giriniz");
		int a = scan.nextInt();
		System.out.println("L�tfen biti� de�eri giriniz");
		int b = scan.nextInt();
		
		for (int i = a; i>=b ; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
			
		}
		scan.close ();
		
		/*
		
		System.out.println("L�tfen ba�lang�� de�eri giriniz");
		int b = scan.nextInt();
		System.out.println("L�tfen biti� de�eri giriniz");
		int s = scan.nextInt();
		
		for (int i = b ; i<=s ; i++) {
			System.out.println(i);
		}
		
				
		
		
		
		
		
		System.out.println("L�tfen �lke ad� giriniz");
		String ulke = scan.nextLine();
		System.out.print(ulke.toUpperCase().charAt(1));
		System.out.println(ulke.toUpperCase().charAt(5));
		
		
		
		System.out.println("L�tfen �lke ad� giriniz");
		String ulke = scan.nextLine();
		System.out.print(ulke.toUpperCase().charAt(0));
		System.out.print(ulke.toUpperCase().charAt(1));
		
		
		
		
		System.out.println("L�tfen �lke ad� giriniz");
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
		
		
		
		
		
		
		System.out.println("L�tfen 5 rakaml� bir say� girinz");
		String s = scan.nextLine();
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		
		
		
		
		System.out.println("L�tfen 16 haneli kart numaranizi giriniz");
	    
	    String card = scan.nextLine();
		System.out.println(card.charAt(2));
		System.out.println(card.charAt(3));
		System.out.println(card.charAt(15));
		
		
		
			
		
		System.out.println("L�tfen adinizi giriniz");
		String ad = scan.nextLine();
		System.out.println("L�tfen soyad�n�z� giriniz");
		String soy = scan.nextLine();
		
		System.out.println(ad.toUpperCase().charAt(0));
		System.out.println(soy.toUpperCase().charAt(0));
		
		
		/*
		
		System.out.println("L�tfen ad�n�z� ve soyad�n�z� giriniz");
		String as = scan.nextLine();
				
		System.out.println(as.length());
				
		
		
		
		
		System.out.println(e.trim());
		System.out.println(f.substring(8,14));
		System.out.println(f.indexOf("i"));
		System.out.println(f.startsWith("B"));
		System.out.println(f.equalsIgnoreCase("G�n"));
		System.out.println(e.replaceAll("\\d", "*"));
		System.out.println(f.replace("dan gidersem", "da kal�rsam"));
		System.out.println(f.toLowerCase()); // hepsi k���k (toLowerCase)
		System.out.println(f.toUpperCase()); // Hepsi b�y�k (toUpperCase)
		System.out.println(f.length()); // 32  (Lenghth metodu)
		System.out.println(f.endsWith("r")); // True (endsWith)
		System.out.println(f.contains("g�n")); //True (Contains)
		System.out.println(f.charAt(5)); // �  (CharAt methodu)
		
		*/
		
	}

}
