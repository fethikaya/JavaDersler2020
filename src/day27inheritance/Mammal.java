package day27inheritance;

public class Mammal extends Animal {

	public boolean dogum = true; // Variable
	
	public Mammal () {   // Constructor
		System.out.println("Mammal");
	}
	
	public static void main(String[] args) {
		
		
		Mammal obj = new Mammal ();
		obj.drink();
		obj.eat();
		obj.feed();
		
		
	}

	public void feed () {
		System.out.println("Yavrularýný beslerler");
	}
}
