package day30exeptions;

public class E04 {

	//Java byte, short, int, long, float, and double (primitive'ler arasinda) arasinda 
	//casting yapabilir. Ama Wrapper class'lari String'e ceviremez.
	//Bunu yapmaya calisirsaniz ClassCastException alirsiniz.
	// ClassCastException Rum Time Exceptions dir. 

	
	public static void main(String[] args) {

		Object obj = new Integer (100);
		System.out.println( (Byte) obj);
	}

}
