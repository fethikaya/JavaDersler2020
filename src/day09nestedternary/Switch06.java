package day09nestedternary;

import java.util.Scanner;

public class Switch06 {

	public static void main(String[] args) {

		
Scanner scan = new Scanner (System.in);
		
	/*Kullanıcıdan A, B, C, D harﬂerinden birini alın 
	   eğer harf C ise ekrana “Doğru cevap” yazdırın. 
	   A, B, D den biri ise ekrana “Yanlış cevap” yazdırın. 
	   Bu harﬂerin dışındaki harﬂer için “Geçersiz cevap şıkkı” yazdırın.
	 */


	System.out.println("Lütfen bir harf giriniz");
	char h = scan.next().charAt(0);
	
	switch (h) {
	
		case ('C'):
			System.out.println("Doğru Cevap");
	break;
		case ('A'):
		case ('B'):
		case ('D'):
	System.out.println("Yanlış Cevap");
	break;
	
	default: 
		System.out.println("Geçersiz cevap şıkı");
	
	
	
	
	}

	
		/*
		 Kullanıcıdan ay ismi alın 
		 eğer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın. 
		 Eğer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın. 
		 Eğer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın. 
		 Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
		 */
		


System.out.println("Lütfen bir ay adı giriniz");
String ay1 = scan.nextLine();

if (ay1. equals ("Ocak") && ay1. equals ("Mart") && ay1. equals ("Mayıs")
	&& ay1. equals ("Temmuz") && ay1. equals ("Agustus") && ay1. equals ("Ekim")
	&& ay1. equals ("Aralık")) {
	System.out.println("31 gün çeken ay");
	
}else if (ay1. equals ("Nisan") && ay1.equals ("Haziran")&& ay1.equals ("Eylül") 
		&& ay1.equals ("Kasım")) {
	System.out.println("30 gün çeken ay");
	
}else if (ay1. equals ("Şubat")) {
	System.out.println("28 gün çeken ay");
	
}else {
	System.out.println("Geçersiz ay");
}
	


		
		System.out.println("Lütfen ay ismi giriniz");
		String ay = scan.nextLine();
		
		switch (ay){
		case "Ocak":
		case "Mart":
		case "Mayıs":
		case "Temmuz":
		case "Agustos":
		case "Ekim":
		case "Aralık":
			System.out.println("Bu ay 31 gündür");
		break;
		
		case "Nisan":
		case "Haziran":
		case "Eylül":
		case "Kasım":
			System.out.println("Bu ay 30 gündür");
		break;
		
		case "Şubat":
			System.out.println("Bu ay 28 gündür");
		break;
		
		default:
			System.out.println("Geçersiz ay ismi");
			
		}
		
		
		
		
		
		
		
		
		
		
		scan.close ();
		
		
		
	}

}
