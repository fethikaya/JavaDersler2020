package day30exeptions;

public class E01 {
					 	
	public static void main(String[] args) {

		int a = 12;
		int b = 0;
		
		String s1 = "";
		String s2 = null;
		try {
		System.out.println(a/b);
		}catch (ArithmeticException e) {
			System.out.println("Bir sayýyý sýfýra bölümezseniz");
		}
		
		System.out.println(s1.length()); // 0
		System.out.println(s2.length()); // NullPointerException
	}

}
