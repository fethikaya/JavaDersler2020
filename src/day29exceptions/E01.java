package day29exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

	public static void main(String[] args) throws IOException {

		
		FileInputStream fis = new FileInputStream ("src/day29exceptions/TextFile"); // Bu dosyaya ulaþmak için
		
		
		int k = 0;
		while((k = fis.read())!=-1){
			System.out.print((char)k);
		}
		
		fis.close();
	}

}
