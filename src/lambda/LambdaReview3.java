package lambda;

import java.util.stream.IntStream;

public class LambdaReview3 {

	public static void main(String[] args) {

		// Ilk 10 sayının 7 ile bölünebilen pozitf tam sayıların toplamını ekrana yazdırınız
		
		System.out.println(IntStream.iterate (7,t->t+7).limit(10).sum());
		
		
		
		
	}

}
