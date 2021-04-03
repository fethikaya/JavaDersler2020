package day31abstraction;


public abstract class Animal {

	public abstract void asi () ;  // Abstract method, body yok
	
	public abstract void drink ();
	
	
	public void yemek () {
		System.out.println("Yemek yerler"); // Concrete method, body yok
	}
}
