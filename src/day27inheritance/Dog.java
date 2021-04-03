package day27inheritance;

public class Dog extends Mammal {

	public boolean sadik = true;  // Variable
	
	public Dog () {  // Consturoctor
		super (); // burada gizli bir super vardýr ve isteðe baðlý, yazýlmayabilir. Parants anlmaýn agleir
		System.out.println("Dog");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog obj = new Dog ();
		obj.drink();
		obj.eat();
		obj.feed();
		obj.havlama();
		obj.koklama();
		System.out.println(obj.sadik);
		System.out.println(obj.dogum);
		System.out.println(obj.age);
	}
	 public void havlama () {
		 System.out.println("Köpekler Havlarlar");
	 }
	 public void koklama () {
		 System.out.println("Köpekler iyi koku alýrlar");
	 }

}
