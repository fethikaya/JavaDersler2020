package lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lambda08 {

	public static void main(String[] args) {

		System.out.println(sum1 (10));
		System.out.println(sum2 (10));
		System.out.println(sumCift (10));
		System.out.println(sumIlkCiftX (20));
		System.out.println(sumIlkCiftX2 (20));
		System.out.println(sumTekX (20));
		System.out.println(sumTekX1 (20));
		ikiXKuveti (5);
		System.out.println();
		istenenSayiKuvetYazdir (3,6);
		System.out.println();
		System.out.println(istenenSayiIstenilenKuvvet (3,6));
		System.out.println(sayiFaktorelHesapla (5));
		// System.out.println(sumCift (10));
		// System.out.println(sumCift (10));
		// System.out.println(sumCift (10));
		// System.out.println(sumCift (10));
	
	}

	
	// 1 den 10 kadar tamsay�lar� toplayan bir program yaz�n�z. 
	
	// Structured Programing
	public static int sum1 (int x) {
		int sum = 0;
		for (int i =1; i<=x;i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	// Functional Programming
	public static int sum2 (int x) {
		return IntStream.range (1, x+1).sum(); // �lki dahil ikincisi dahil de�il
		}
	
	public static int sum3 (int x) {
		return IntStream.rangeClosed (1, x+1).sum(); // Hepsi dahil
		}
	
	
	// 1 den 10 kadar �ift tamsay�lar�n toplayan bir program yaz�n�z. 
	
	public static int sumCift (int x) {
		return IntStream.rangeClosed (1,x).filter (t->t%2==0).sum();
	}

	
	// ilk x pozitif �ift say�y� toplayan program yaz�n�z
	
	// 1.yol
	public static int sumIlkCiftX (int x) {
		return IntStream.rangeClosed(1, 2*x).filter(t->t%2==0).sum();
	}
	// 2. yol
	
	public static int sumIlkCiftX2 (int x) {
		return IntStream.iterate(2, t->t+2).limit(x).sum();
	}
	
	// ilk x potizitf tek tam say�y� toplayan progr�m yaz�n�z
	//1.yol
	public static int sumTekX (int x) {
		return IntStream.rangeClosed(1, x*2-1).filter(t->t%2==1).sum();
	}
	
	//2.yol
	public static int sumTekX1 (int x) { 
		return IntStream.iterate(1, t->t+2).limit(x).sum();
	}
	

	// 2'nin ilk 5 kuvetini ekrana yazd�ran prorgam� yaz�n�z
	
	public static void ikiXKuveti (int x) {
		IntStream.iterate(2, t->t*2).limit(x).forEach(Lambda01::printEl);
	}
	
	// istenilen bir sayinin ilk x kuvetini ekrana yazd�r�n 
	
	public static void istenenSayiKuvetYazdir (int a, int x) {
		IntStream.iterate(a, t->t*a).limit(x).forEach(Lambda01::printEl);
	}
	
	// istenilen bir sayinin istenilen kuvvetini ekrana yazd�ran program yazn�z
	
	public static int istenenSayiIstenilenKuvvet (int a, int x) {
		return IntStream.iterate(a, t->t*a).limit(x).reduce(0, (m,n)->n);
	}
	
	
	// istenilen bir say�n�n fakt�ryelini hesapyalan program� yaz�n�z
	
	public static OptionalInt sayiFaktorelHesapla (int x) {
		return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact);
		//return IntStream.rangeClosed(1, x).reduce(1,(m,n)->m*n);
	}
	
	
	
}
