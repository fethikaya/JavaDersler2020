package day14methodcreation;

import java.util.Scanner;

public class odev {

	public static void main(String[] args) {
		
	
		adSoyadCagirma();
		
		
	}
	
	
	
	
		public static void adSoyadCagirma() {
			String str1,str2;
			Scanner scan = new Scanner(System.in);
			System.out.println("lutfen adinizi giriniz");
			str1 = scan.nextLine();
			System.out.println("lutfen soyadinizi giriniz");
			str2 = scan.nextLine();
			System.out.print(str1.toUpperCase().charAt(0)+str1.toLowerCase().substring(1) + " ");
			System.out.println(str2.toUpperCase().charAt(0)+str2.toLowerCase().substring(1));
		
	}
	
	
	}

