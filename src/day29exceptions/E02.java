package day29exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class E02 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
		 fis = new FileInputStream ("src/day29exceptions/TextFile"); // Bu dosyaya ula�mak i�in
		
		
		int k = 0;
		while((k = fis.read())!=-1){
			System.out.print((char)k);
		}
		
	
		
		}catch (IOException e) {
			System.out.println("Dibe ku dosya j� hatiye birin, nah� xwendin an j� xelat e");
		}finally {
			System.out.println();
	//	fis.close();
		}
		
		
		
	}

}
