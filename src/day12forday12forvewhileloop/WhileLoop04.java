package day12forday12forvewhileloop;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		
		
		
		
		System.out.println("Lutfen bir rakam  giriniz");
		int rak=scan.nextInt();
		
		int s=rak;
		int i=1;
		int product=1;
		while (i<=10) {
			product=(int) (s*i);
			System.out.println(s+"x"+ i+" = "+product);
			i++;
			
			
			
		}
		
		scan.close ();
		
		/*
		System.out.println("Lütfen giriş rakamını giriniz");
		int r1 = scan.nextInt();
		System.out.println("Lütfen son rakamı giriniz");
		int r2 = scan.nextInt();
		
		int product =1;
		int i = r1;
		while (i<=r2) {
			product = product * i;
			i++;
				System.out.print(product);
			
		}
		
		
		
		
		System.out.println("Lütfen harf giriniz");
		char h1= scan.next().toUpperCase().charAt(0);
		System.out.println(" Lütfen son harfi giriniz");
		char h2 = scan.next ().toUpperCase().charAt(0);
		
		char i = h1;
		while (i<=h2) {
			i++;
			System.out.print(i+ ",");
		
		
		}
		
		
		
		
		
	
	
		
		*/
		
		
		
		
		
		
		
		
	}

}
