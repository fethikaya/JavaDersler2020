package day12forday12forvewhileloop;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("L�tfen ba�lang�c say� giriniz");
		int s1 = scan.nextInt();
		System.out.println("L�tfen biti� say�y� giriniz");
		int s2 = scan.nextInt();
		
		int sum = 0;
		
		for (int i = s1 ; i<=s2 ;i++) {
			sum = sum+i;
				
		}
		
		System.out.println(sum + ",");
		
		scan.close ();
		
		/*
		
		System.out.println("L�tfen Ba�lang�c harfini giriniz");
		char h1 = scan.next().toUpperCase().charAt(0);
		System.out.println("L�tfen Bitti� harfi giriniz");
		char h2 =scan.next ().toUpperCase().charAt(0);
		
		for (char i = h1 ;i<=h2;i++ ) {
			System.out.print(i + " ");
		}
		
		
		
		System.out.println("L�tfen ba�lang�c noktas�n� giriniz");
		int n1 = scan.nextInt();
		System.out.println("L�tfen biti� noktas�n� giriniz");
		int n2 = scan.nextInt();
		
		int product = 1;
		
		for (int i = n1 ; i<=n2; i++) {
			product = product*i;
				
		}
		
		System.out.println(product);
		
		
		
		
		
		
		
		
		
		
	
		
		
		System.out.println("L�tfen ba�lang�c rakam� giriniz");
		int r1 = scan.nextInt();
		System.out.println("L�tfen biti� rakam� giriniz");
		int r2 = scan.nextInt();
		
		for (int i = r1; i<=r2 ;i++) {
			if (i%3==0) {
				System.out.print(i + " ");
				
			}
		}
		
		
		
		System.out.println("L�tfen ba�lang�s say�y� giriniz");
		int b1 = scan.nextInt();
		
		System.out.println("L�tfen biti� say�y� giriniz");
		
		int b2 = scan.nextInt();
		
				
		for (int i = b1 ; i<=b2 ; i++) {
			
			if (i%2==0) {
				
				System.out.print(i+ " ");
		
				
			}
		}
		
		
		*/
		
		
		
		
		
		
	}

}
