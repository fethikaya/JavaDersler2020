package day09nestedternary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		/*
		 Kullan�c� ay ismini girince o ay�n mevsini ekrana yaz�n�z
		 */
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Ay ismi giriniz");
		String ay = scan.nextLine();
		
		
		switch (ay) {
		
			case "Aral�k":
			case "Ocak":
			case "�ubat":
				System.out.println("K��");
			break;
				
			case "Mart":
			case "Nisan":
			case "Mayis":
				System.out.println("�lkbahar");
			break;
			
			
			case "Haziran":
			case "Temmuz":
			case "Agustos":
				System.out.println("Yaz");
			break;
		
			case "Eyl�l":
			case "Ekim":
			case "Kas�m":
				System.out.println("Sonbahar");
			break;
			
			default:
				System.out.println("Ge�erli ay ismini giriniz");
		}	
		
		scan.close ();
		
		
	}

}
