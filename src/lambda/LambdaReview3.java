package lambda;

import java.util.stream.IntStream;

public class LambdaReview3 {

	public static void main(String[] args) {

		// Ilk 10 say�n�n 7 ile b�l�nebilen pozitf tam say�lar�n toplam�n� ekrana yazd�r�n�z
		
		System.out.println(IntStream.iterate (7,t->t+7).limit(10).sum());
		
		
		
		
	}

}
