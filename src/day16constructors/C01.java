package day16constructors;

public class C01 {
	
	
	
	
	
	
	int i = 12;  // �nstance (object) variable
	static int k = 13;  // Statik (class ) variable
	
	

	
	
	public static void main(String[] args) {

		
		C01 obj1 = new C01 ();
		
		C01 obj2 = new C01 ();
		
	}
	
	/*
	 1- Statik variable'lar calsslara aittir ve di�er ad� calass variabledir. 
	 instance variableler objectlere aittir ve di�er ad� object variabledir.
	 
	 2- Statik Variableredki de�i�iklikler kim taraf�ndan yap�l�rsa yap�ls�n,
	  t�m objeler taraf�ndan g�r�n�r. �nstance varibelrde ise de�i�kileleri
	  sadece o instance varible hangi object'e aitse onun taruf�ndan g�r�n�r.
	  
	  3)static variable'lar class'lar olusturulurken Java tarafindan olusturulur
	 Instance variable'lar ise object'ler olusturulurken olusturulur.
	 
	   4- 1 class, class icinde 1 tane static ve 1 tane de instance variable var.
	 Bu class'dan 10 object olusturulursa 1 tane static variable ve 10 tane 
	 instance variable uretilmis demektir. 	
	 */

}
