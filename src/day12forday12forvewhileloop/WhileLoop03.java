package day12forday12forvewhileloop;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen baþlangýç sayý");
		int s1 = scan.nextInt();
		System.out.println("Lütfen bitiþ sayýsý");
		int s2 = scan.nextInt();
		
		int sum = 0;
		
		int k = s1;
		while (k<=s2) {
			sum = sum+k;
			System.out.print(sum+ ",");
			
			k++;
			
		}
		
	
		
		/*
		
		System.out.println("Lütfen baþlangýc rakamýný giriniz");
		int r1 = scan.nextInt();
		System.out.println("Lütfen bitiþ rakamýný giriniz");
		int r2 = scan.nextInt();
		
		int i = r1;
		
		while (i<=r2) {
			if (i%2==0) {
				System.out.println(i);
				
				i++;
				
			}
		}
		
		
		
		
	
	
		
		System.out.println("Lütfen Baþlangýc sayýyý giriniz");
		int s1 = scan.nextInt();
		System.out.println("Lütfen Bitiþ sayýyý giriniz");
		int s2 = scan.nextInt();
		
		int i = s1;
		while (i<=s2) {
			System.out.print (i + ",");
			i++;
			
		}
		
		
		
		
		
		int i = 3;
		while (i<=13){
			System.out.print(i+ " ");
			i=i+2;
		}
	
		*/
		
		
		
		
		
		
		
		
	}

}
