package day09nestedternary;

import java.util.Scanner;

public class Switch05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		/*
		 Kullanıcıdan ay ismi alın 
		 eğer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın. 
		 Eğer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın. 
		 Eğer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın. 
		 Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
		 */
		
		
		System.out.println("Lütfen ay ismi giriniz");
		String meh = scan.nextLine();
		
		switch ("meh"){
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
		
		
		
		/*
		 Kullanıcıdan bir tamsayı alın 
		 eğer tamsayı 9 ise ekrana “Bir basamaklı en büyük sayı” yazdırın. 
		 99 ise ekrana “İki basamaklı en büyük sayı” yazdırın. 
		 999 ise ekrana “Üç basamaklı en büyük sayı” yazdırın. 
		 Bu sayıların dışındaki sayılar için “Yorum yok” yazdırın.
		 */
		
		System.out.println("Lütfen bir tam sayı giriniz");
		int tms = scan.nextInt();
		
		switch (tms) {
		
		case 9:
			System.out.println("Bir basamaklı en büyük sayı");
		break;
		 
		case 99:
			System.out.println("İki basamaklı en büyük sayı");
		break;
		
		case 999:
			System.out.println("Üç basamaklı en büyük sayı");
			
		default:
			System.out.println("Yorum yok");
		
		}
		
		
		if (tms ==9) {
			System.out.println("Bir basamaklı büyük");
		} else if (tms ==99) {
			System.out.println("İk basamaklı büyük");
		}else if (tms == 999) {
			System.out.println("3 basamaklı büyük");
		}else {
			System.out.println("Yorum yok");
		}
		
		
		
		/*
		 Kullanıcıdan bir harf alın 
		 eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın. 
		 “b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın. 
		 Bu harﬂerin dışında bir character için “Geçersiz character” yazdırın.
		 
		 */
		
		
		System.out.println("Lütfen bir hafr giriniz");
		char harf = scan.next ().charAt(0);
		
		switch (harf) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Sesli Harf");
		break;
		
		case 'b':
		case 'c':
		case 'd':
		case 'f':
		case 'g':
			System.out.println("Sesiz Harf");
		break;
		
		default:
		System.out.println("Geçersiz karekter");
			
			
		}
		
		
		
		/*
		 Kullanıcıdan bir gun alın 
		 eğer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdırın. 
		 “Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdırın. 
		 “Pazar” ise ekrana  “Hıristiyanlar için kutsal gün” yazdırın. 
		 Diler günler icin “Kutsal gün değil” yazdırın
		 
		 */
		

		
		
		
		System.out.println( "Lütfen bir gün giriniz");
		String gun = scan.nextLine();
		
		switch (gun) {
		case "Cuma":
			System.out.println("Muslumanlar için mubarek gün");
		break;
		
		case "Cumartesi":
			System.out.println("Yahudiler için kutsal gün");
		break;
		
		case "Pazar":
			System.out.println("Hritiyanlar için kutsal gün");
		break;
		
		default:
			System.out.println("Kutsal gün değil");
		
		}
		
		System.out.println("Lütfen gün adı giriniz");
		String day = scan.nextLine();
		if (day.equals ("Cuma")) {
			System.out.println("Muslumanlar için kutsal gün");
		}else if (day.equals ("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gün");
		}else if (day. equals("Pazar")) {
			System.out.println("Hristiyanlar için kutsal gün");
		
		}else {
			System.out.println("Kutsal gün değil");	
			
		}
		
		
		
		
		
		
		
		scan.close ();
		
	}

}
