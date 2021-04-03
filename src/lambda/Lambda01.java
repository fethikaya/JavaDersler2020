package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

	/*
	 * 1)
	 Lambda "Functional Programming" diye geçiyor. 
	 Methot kullanma programa dillidir.
	 Burada method kullacaðýz. Lambda da kod yazmaycaðýz. Var olan method va. Biz onu kullanacaðýz.
	 ihtiyacýmýz konu ile ilgili method vardýr, onu bulup kullancaðýz. 
	 örnek. for loop ile yapcaðýmýz bir method vardý. Burada for loop kullanmaycaðýz. o methodu bulup kullancaðýz.
	 - Biz kod yazarken hata yapabiliriz, ama Lambda da hazýr methodu alýrsak hata olmaz.
	 - Çok kýsa ve pratik olacak.
	 
	 2)
	 * "Functional Programming" nasýl yaparým deðil?
	    ne yaparým diye düþünülür. 
	 3) "Functional Programming" hýz olarak, kod kýsalýðý olarak, kod okunabilirliði olarak
	 	ve hatasýz kod yazma olarak çok faydalýdýr. 
	 4) Lambda sadece collection’larda(List, Queue ve Set) array’lerde kullanilabilir.
	 
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
	
	// “Structured Programming” List elemanlarýný tammaný ayný satýrda, aralarýnda boþluk býrakarak konsola yazdýrýnýz. 
	
	public static void printElStruncturde (List <Integer> list) {
	for (Integer w : list) {
		System.out.print(w + " ");
	}
}
	
	// “Ginçtednül Programming” List elemanlarýný tammaný ayný satýrda, aralarýnda boþluk býrakarak konsola yazdýrýnýz. 
	
	//Lambda Exprensison
	public static void pirntElFunctional1 (List <Integer> list) {
	list.stream().forEach(t->System.out.print(t + " "));	
	}
	
	// Method Refernce kendim oluþturduðum method ile
	// Methot Refernce ==> Class Ismi :: Method Isým
	
	public static void printEl (int t) {
		System.out.print( t + " ");
	}
	public static void pirntElFunctional2 (List <Integer> list) {
		list.stream().forEach(Lambda01::printEl);	
		}
	
	// Method Refence Java'nýn oluþturduðu methodlar ile...
	public static void pirntElFunctional3 (List <Integer> list) {
		list.stream().forEach(System.out::print);	
		}
	
	
	// “Structured Programming” çift sayý olanlarý List elemanlarýný tammaný ayný satýrda, 
	// aralarýnda boþluk býrakarak konsola yazdýrýnýz. 
	
	public static void printCiftElStructured (List <Integer> list) {
		for (Integer w:list) {
			if (w%2==0) {
				System.out.println(w + " ");
			}
		}
	}
	// “Structured Programming” çift sayý olanlarý List elemanlarýný tammaný ayný satýrda, 
		// aralarýnda boþluk býrakarak konsola yazdýrýnýz. 
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
	// “Structured Programming” ondan küçak ve tek sayý olanlarý List elemanlarýný tammaný ayný satýrda, 
			// aralarýnda boþluk býrakarak konsola yazdýrýnýz. 
	
	public static void printKucukOnTekFunction (List <Integer> list) {
		list.stream().filter(t->t%2!=0 && t<10).forEach(Lambda01::printEl);
	}
	
	
	
	// “Functionl Programming” ondan küçük veya çift sayý olan list elamanlarýnýn tammaný ayný satýrda, 
			// aralarýnda boþluk býrakarak konsola yazdýrýnýz.

	
	public static void printKucukOnVeyaCiftFunctional(List<Integer> list) {
		list.stream().filter(t->t%2==0 || t<10).forEach(Lambda01::printEl);
	}
	
}
	
