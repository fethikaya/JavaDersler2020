package day04scanner;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {


	Scanner scan = new Scanner (System.in);
	
	System.out.println("Yaricapi giriniz");
	float r = scan.nextFloat();
	System.out.println("Alan = " + 3.14159*r*r);
	
	System.out.println("Cevre = " + 2*3.14159*r);
	scan.close();
	
	
	
	}

}
