package day16constructors;

public class C01 {
	
	
	
	
	
	
	int i = 12;  // Ýnstance (object) variable
	static int k = 13;  // Statik (class ) variable
	
	

	
	
	public static void main(String[] args) {

		
		C01 obj1 = new C01 ();
		
		C01 obj2 = new C01 ();
		
	}
	
	/*
	 1- Statik variable'lar calsslara aittir ve diðer adý calass variabledir. 
	 instance variableler objectlere aittir ve diðer adý object variabledir.
	 
	 2- Statik Variableredki deðiþiklikler kim tarafýndan yapýlýrsa yapýlsýn,
	  tüm objeler tarafýndan görünür. Ýnstance varibelrde ise deðiþkileleri
	  sadece o instance varible hangi object'e aitse onun tarufýndan görünür.
	  
	  3)static variable'lar class'lar olusturulurken Java tarafindan olusturulur
	 Instance variable'lar ise object'ler olusturulurken olusturulur.
	 
	   4- 1 class, class icinde 1 tane static ve 1 tane de instance variable var.
	 Bu class'dan 10 object olusturulursa 1 tane static variable ve 10 tane 
	 instance variable uretilmis demektir. 	
	 */

}
