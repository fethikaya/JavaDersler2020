package day27inheritance;

public class Cat extends Mammal {

	public boolean biyik = true;  // Varriable
	public Cat () {  // Constructor
		System.out.println("Cat");
	}
	
	
	public static void main(String[] args) {

		Cat obj = new Cat ();
		obj.eat();
		obj.drink();
		obj.feed();
		obj.meow();
		obj.clean();
		
	}
	public void clean () {
		System.out.println("Kediler temizlenirler");
	}
	public void meow () {
		System.out.println("Kediler miyavlarlar");
	}
}
