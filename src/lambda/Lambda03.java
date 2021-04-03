package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Lambda03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(9);
		list.add(-13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(-12);
		list.add(15); 
		
		ciftKareMax (list);
		toplamElemanlar (list);
		carpimEl(list);
		toplamElemanlar2 (list);
		carpimEl2(list);
		min1(list);
		min2(list);
		min3(list);
		min4(list);
		ondanKucukEnBuyuk (list);
		tekKupSirala (list);
		System.out.println();
		ciftKareSirala(list);
		
	}
	
	// Listteki çift sayý olan elemanlarýn karelerini alýnýz en büyük olaný consola yazdýrýnýz. 

	public static void ciftKareMax (List <Integer> list) {
		Optional<Integer> max = list.stream().filter(Lambda01::isCift).map(t->t*t).reduce(Math::max);
		System.out.println(max);
	}
	
	
	
	// List'teki tüm elamanlarýn toplamýný consola yazdýrýnýz
	// Lambda Expression ile 
	public static void toplamElemanlar (List <Integer> list) {
		int toplam = list.stream().reduce(0,(x,y) ->x+y);
		System.out.println(toplam );
	}
	
	// Method Reference ile 
	
	public static void toplamElemanlar2 (List <Integer> list) {
		Optional<Integer> toplam = list.stream().reduce(Integer::sum);
		System.out.println(toplam );
	}	
		
	//==============================================================================
	
	// List'teki çift elamanlarýn toplamýný consola yazdýrýnýz
	// Lambda Expression ile 
	
	public static void carpimEl (List <Integer> list) {
		int carpim = list.stream().filter (Lambda01::isCift).reduce(1, (x,y)-> x*y);
	//	int carpim = list.stream().filter (t->t%2==0).reduce(1, (x,y)-> x*y);
		System.out.println(carpim);
	}
	
	// Method Reference ile 
	
	public static void carpimEl2 (List <Integer> list) {
		Optional<Integer> carpim = list.stream().filter (Lambda01::isCift).reduce(Math::multiplyExact);
		System.out.println(carpim);
	}
	
	
	//=====================================================
	
	//Listteki elemanlardan en küçüðünü 4 farklý yol kullanarak bulalým
	
	// 1) Method Reference methodlarý java'dan al (Integer classý kullan)
	    public static void min1 (List <Integer> list) {
		Optional<Integer> min = list.stream().reduce(Integer::min);
		System.out.println(min);
	}
	
	
	// 2) Method Reference methodlarý java'dan al (Math classý kullan) 
	        public static void min2 (List <Integer> list) {
			Optional<Integer> min = list.stream().reduce(Math::min);
			System.out.println(min);
		}
		
	
		// ==  Method Reference methodlarý kendimiz yapalým ==
		
		public static int minBul (int x, int y) {
			return x<y ? x:y;
	  }
		
		// 3) Method Reference kendimiz method
		public static void min3 (List <Integer> list) {
			Optional<Integer> min = list.stream().reduce(Lambda03::minBul);
			System.out.println(min);
		}
		
		
		// 4) Lambda Exqression
				public static void min4 (List <Integer> list) {
					int min = list.stream().reduce(Integer.MAX_VALUE, (x,y)->x<y?x:y);
					System.out.println(min);
				}
		// Minimum arayýnca parametre maximum, maximum arayýnca parametre minimum olmalý
	
				// =============================
				
	// Soru: Listteki elemanlardan 10 dan küçük en büyük sayýyý bulunuz. 
				
				public static void ondanKucukEnBuyuk (List <Integer> list) {
					Optional<Integer> max = list.stream().filter(t->t<10).reduce(Integer::max);
					System.out.println(max);
				}
				
	// Listeki elemanlardan tek sayý olanlarý küplerini küçükten büyüyeðe sýralayýn
				public static void tekKupSirala (List <Integer> list) {
					list.stream().filter(t->t%2!=0).map(t->t*t*t).sorted().forEach(Lambda01::printEl);
				}
	
	// Listeki elemanlardan çift sayý olanlarý karelerin büyükten küçüðü sýralayýn		
				
				public static void ciftKareSirala(List <Integer> list) {
					list.stream().filter(Lambda01::isCift).map (t->t*t).sorted(Comparator.reverseOrder()).forEach (Lambda01::printEl);
			}
				
				
				
				
}
