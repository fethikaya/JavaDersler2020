package day30exeptions;

public class E03 {

	public static void main(String[] args) {

		String s = "12345";
		String t = "abcde";
		
		int i = Integer.parseInt(s);
		System.out.println(i+2); // 123457
		
		
		int j = Integer.parseInt(t);
		
		//Integer wrapper class'inin icindeki parseInt() methodu String'leri sayiya cevirmek icin kullanilir.
		
		//Eger bir String rakamlardan olusturulmamissa parseInt() methodunu kullanarak onu sayiya cevirmek isterseniz
		//NumberFormatException alirsiniz.Cunku Java rakam disindaki characterleri parseInt() methodu ile sayiya ceviremez.
		
	}

}
