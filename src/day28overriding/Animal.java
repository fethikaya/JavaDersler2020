package day28overriding;


public class Animal {

	
		public void sound () {
			System.out.println("Ses çikarýrlar");
		}
		
		
		public void ayakSayisi () {
			System.out.println("Ayak Sayisi bellidir");
		}
		
		public Animal myMethod () {				// Return type Animal olabilir. Non Prmiteve
			Animal obj = new Animal ();
			return null;
		}
		
}
