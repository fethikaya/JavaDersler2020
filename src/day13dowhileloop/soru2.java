package day13dowhileloop;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Bir sayý giriniz");
		int s = scan.nextInt();
		
		int i=1;
		while (i<=10) {
			System.out.println(s+ "x" + i + "=" + s*i);
			
			i++;
		}
		
		scan.close ();
		
		
		
		
	}

}
