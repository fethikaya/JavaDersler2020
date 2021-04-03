package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L01 {

	public static void main(String[] args) {

		// Array'ý liste çevirmek...
		
		
		int arr[] = {1, 3, 5};

		int x = 0;

		for(int w : arr) {

		   x = x + w*w;

		}

		System.out.print(x);
		
		
		
		String s [] = {"A","B","C"};
		
		List <String> sl = new ArrayList <> ();
		
		
		sl = Arrays.asList(s); //  Array'ý liste çevirmek
		
		Object [] ListenArray = sl.toArray();
		
		
		
		
		
	}

}
