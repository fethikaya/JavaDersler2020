package day24accessmodifierstringbuilder;

public class SB01 {

	public static void main(String[] args) {

		
		// 1. yol 
		StringBuilder stb1 = new StringBuilder ();
		
		System.out.println(stb1);
		
		stb1.append("Java");
		System.out.println(stb1);
		
		stb1.append("Kolaydir");
		System.out.println(stb1);
		
		// 2.yol
		StringBuilder stb2 = new StringBuilder (5);
		stb2.append("Ali");
		System.out.println(stb2);
		
		stb2.append("Kazandi");
		System.out.println(stb2);
		
		
		//  3.yol
		
		StringBuilder stb3 = new StringBuilder ("Java");
		System.out.println(stb3);
		
		
		/* Soru
		 1- 3. yolu kullanarak, bir StringBuilder oluþturun.
		 2- Bu stringe ekleme yapýn.
		 3- bu stringin belli bir bölümünü ekrana yazýnýz 
		 */
		
		
		StringBuilder stb4 = new StringBuilder ("Fethi");
		stb4.append("Kaya").append("Diyarbakýr");
		System.out.println(stb4);
		System.out.println(stb4.substring(5));
		
		stb4.charAt(4); // 3.index
		
		stb4.delete(5, 9);
		System.out.println(stb4);
		
		stb4.getClass();
		System.out.println(stb4.getClass());
		
		stb4.indexOf("Diyar");
		System.out.println(stb4.indexOf("Diyar"));
		
		
		stb4.insert(4, "*");
		System.out.println(stb4);
		
		
		stb4.lastIndexOf("a");
		System.out.println(stb4.lastIndexOf("a"));
		
		
		stb4.length();
		System.out.println(stb4.length());
		
		
		stb4.replace(5, 8, " ");
		System.out.println(stb4);
		
		
		//------------------------------
		
		// Stiringi terstenyazdýrma  loop kullanarak
		
		String s = "";
		
		for (int i = stb4.length()-1 ; i>=0; i--) {
			
			s= s + stb4.charAt (i);
		}
		
		System.out.println(s);
		
		
		// 2. yol  StringBuild kullanark
		
		stb4.reverse();
		System.out.println(stb4);
		
		stb4.setCharAt(6, 'F');
		System.out.println(stb4);
		
		
		
		//-----------------------------
		StringBuilder stb5 = new StringBuilder (11);
		stb5.append("Java");
		System.out.println(stb5.capacity());  // 11
		System.out.println(stb5.length());  //4
		
		
		
		StringBuilder stb6 = new StringBuilder ("Java Kolay");
		stb6.append("X");
		System.out.println(stb6);
		
		stb6.substring(8);
		System.out.println(stb6);
		
		
		
		stb6.substring(3);
		System.out.println(stb6);
		
		
		StringBuilder stb = new StringBuilder("Learn ");
		char[] ch = new char[] { 'J', 'A', 'V', 'A' };
		stb.append(ch);

		System.out.println(stb);
		
		
		
		
		String str = "Learn";
		System.out.println(str + "Java");
		
		
	}

}
