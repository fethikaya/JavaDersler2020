package day12forday12forvewhileloop;

import java.util.Scanner;

public class WhileLoop05 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner (System.in);
		
		
		
	
		
		System.out.println("Lütfen bir sözcük giriniz");
		
		String soz = scan.nextLine();
		if (soz.contains("a")) {
			System.out.println("a");
			
		}else {
			System.out.println("a harfi yoktur");
		}
		
		scan.close ();
		
		/*
		
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=scan.nextLine();
		char ch=kelime.charAt(0);
		char ch1=kelime.charAt(kelime.length()-1);
		
		System.out.println(ch1+kelime.substring(1,kelime.length()-1)+ch);
	
		
		
		
		System.out.println("Lütfen bir sayý giriniz");
		int a = scan.nextInt();

		for (int i =1; i<=a; i++ ) {
			if (a%i==0) {
				System.out.print(i+ ",");
			}
		}
		
		
		
		
		
		
		System.out.println("Lütfen baylangýc sayý giriniz");
		int s1 = scan.nextInt();
		System.out.println("Lütfen bitiþ sayýyý giriniz");
		int s2 = scan.nextInt();
		
		int i = s1;
		while (i<=s2) {
			if (i%3==0 && i%5==0) {
				System.out.print(i+ ",");
			}i++;
		}
		
		
		
		
		
		
		
		
		int i = 8;
		while (i<=180) {
			if (i%5==0) {
				
			System.out.print(i + ",");
							
			}i++;
			
		}
		
		*/
		
		
		
		
		
		
	}

}
