package day09nestedternary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		/*
		 Kullanýcý ay ismini girince o ayýn mevsini ekrana yazýnýz
		 */
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Ay ismi giriniz");
		String ay = scan.nextLine();
		
		
		switch (ay) {
		
			case "Aralýk":
			case "Ocak":
			case "Þubat":
				System.out.println("Kýþ");
			break;
				
			case "Mart":
			case "Nisan":
			case "Mayis":
				System.out.println("Ýlkbahar");
			break;
			
			
			case "Haziran":
			case "Temmuz":
			case "Agustos":
				System.out.println("Yaz");
			break;
		
			case "Eylül":
			case "Ekim":
			case "Kasým":
				System.out.println("Sonbahar");
			break;
			
			default:
				System.out.println("Geçerli ay ismini giriniz");
		}	
		
		scan.close ();
		
		
	}

}
