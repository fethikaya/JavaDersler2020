package day31abstraction;


public abstract class Mammal extends Animal{

	public abstract void feed ();  // Abstract
	
	
	public void move () {   // Concrete
		System.out.println("Hareket ederler");
	}
	
}
