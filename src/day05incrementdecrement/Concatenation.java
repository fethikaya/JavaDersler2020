package day05incrementdecrement;

public class Concatenation {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Kolaydir";
		System.out.println(s1 + s2);
		System.out.println(s1 + " " + s2);
		
		
		String s3 = "Ali";
		String s4 = "Can";
		System.out.println( s3+s4);
		
		String s5 = "Ayse ";
		String s6 = "Han";
		System.out.println(s5+s6);
		
		
		
		int f1 = 8;
		int f2 = 4;
		int f3 = 1;
		String m1 = "Fethi";
		String m2 = "Diyarbakir";
		String m3 = "dogumlu";
				
		System.out.println(f2 + "" + f3 + " "+ m1 + " " + m2 + " " +m3); //41 Fethi Diyarbakir dogumlu
	    System.out.println( (f1+f3) + " " + m1+ " "+ m2+ " " + (f1-f2) + " " + m3 ); // 9 Fethi Diyarbakir 4 dogumlu
		System.out.println(f2*5 + 1 + " " + m2); // 21 Diyarbakir
		System.out.println(m2 + " "+ (f2*5+f3) + " " + m1 + " " + (f2*10+f3) ); // Diyarbakýr 21 Fethi 41
		
		
		
		
		
		
		

	}

}
