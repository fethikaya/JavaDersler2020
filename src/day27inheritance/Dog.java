package day27inheritance;

public class Dog extends Mammal {

	public boolean sadik = true;  // Variable
	
	public Dog () {  // Consturoctor
		super (); // burada gizli bir super vard�r ve iste�e ba�l�, yaz�lmayabilir. Parants anlma�n agleir
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
		 System.out.println("K�pekler Havlarlar");
	 }
	 public void koklama () {
		 System.out.println("K�pekler iyi koku al�rlar");
	 }

}
