package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

	/*
	 * 1)
	 Lambda "Functional Programming" diye ge�iyor. 
	 Methot kullanma programa dillidir.
	 Burada method kullaca��z. Lambda da kod yazmayca��z. Var olan method va. Biz onu kullanaca��z.
	 ihtiyac�m�z konu ile ilgili method vard�r, onu bulup kullanca��z. 
	 �rnek. for loop ile yapca��m�z bir method vard�. Burada for loop kullanmayca��z. o methodu bulup kullanca��z.
	 - Biz kod yazarken hata yapabiliriz, ama Lambda da haz�r methodu al�rsak hata olmaz.
	 - �ok k�sa ve pratik olacak.
	 
	 2)
	 * "Functional Programming" nas�l yapar�m de�il?
	    ne yapar�m diye d���n�l�r. 
	 3) "Functional Programming" h�z olarak, kod k�sal��� olarak, kod okunabilirli�i olarak
	 	ve hatas�z kod yazma olarak �ok faydal�d�r. 
	 4) Lambda sadece collection�larda(List, Queue ve Set) array�lerde kullanilabilir.
	 
	 */
	public static void main(String[] args) {

		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		printElStruncturde (list);
		System.out.println();
		pirntElFunctional1 (list);
		System.out.println();
		pirntElFunctional2 (list);
		System.out.println();
		pirntElFunctional3 (list);
		System.out.println();
		printCiftElStructured (list);
		System.out.println();
		printCiftElStructured1 (list);
		System.out.println();
		 printCiftElStructured2 (list);
		 System.out.println();
		 printKucukOnTekFunction (list);
		 System.out.println();
		 printKucukOnVeyaCiftFunctional (list);
		 
		 
		 
	}
	
	// �Structured Programming� List elemanlar�n� tamman� ayn� sat�rda, aralar�nda bo�luk b�rakarak konsola yazd�r�n�z. 
	
	public static void printElStruncturde (List <Integer> list) {
	for (Integer w : list) {
		System.out.print(w + " ");
	}
}
	
	// �Gin�tedn�l Programming� List elemanlar�n� tamman� ayn� sat�rda, aralar�nda bo�luk b�rakarak konsola yazd�r�n�z. 
	
	//Lambda Exprensison
	public static void pirntElFunctional1 (List <Integer> list) {
	list.stream().forEach(t->System.out.print(t + " "));	
	}
	
	// Method Refernce kendim olu�turdu�um method ile
	// Methot Refernce ==> Class Ismi :: Method Is�m
	
	public static void printEl (int t) {
		System.out.print( t + " ");
	}
	public static void pirntElFunctional2 (List <Integer> list) {
		list.stream().forEach(Lambda01::printEl);	
		}
	
	// Method Refence Java'n�n olu�turdu�u methodlar ile...
	public static void pirntElFunctional3 (List <Integer> list) {
		list.stream().forEach(System.out::print);	
		}
	
	
	// �Structured Programming� �ift say� olanlar� List elemanlar�n� tamman� ayn� sat�rda, 
	// aralar�nda bo�luk b�rakarak konsola yazd�r�n�z. 
	
	public static void printCiftElStructured (List <Integer> list) {
		for (Integer w:list) {
			if (w%2==0) {
				System.out.println(w + " ");
			}
		}
	}
	// �Structured Programming� �ift say� olanlar� List elemanlar�n� tamman� ayn� sat�rda, 
		// aralar�nda bo�luk b�rakarak konsola yazd�r�n�z. 
	public static void printCiftElStructured1 (List <Integer> list) {
	list.stream().filter(t->t%2==0).forEach(t->System.out.print(t + " "));
}
	// Method Refernece kendi methodum ile
	
	public static boolean isCift (int t) {
		return t%2==0;
		
	}
	public static void printCiftElStructured2 (List <Integer> list) {
	list.stream().filter(Lambda01::isCift).forEach(Lambda01::printEl);
}
	// �Structured Programming� ondan k��ak ve tek say� olanlar� List elemanlar�n� tamman� ayn� sat�rda, 
			// aralar�nda bo�luk b�rakarak konsola yazd�r�n�z. 
	
	public static void printKucukOnTekFunction (List <Integer> list) {
		list.stream().filter(t->t%2!=0 && t<10).forEach(Lambda01::printEl);
	}
	
	
	
	// �Functionl Programming� ondan k���k veya �ift say� olan list elamanlar�n�n tamman� ayn� sat�rda, 
			// aralar�nda bo�luk b�rakarak konsola yazd�r�n�z.

	
	public static void printKucukOnVeyaCiftFunctional(List<Integer> list) {
		list.stream().filter(t->t%2==0 || t<10).forEach(Lambda01::printEl);
	}
	
}
	
