package day26passbyvalueinheritance;

public class Dog extends Mammal{

	public static void main(String[] args) {

		Dog objd = new Dog ();
		objd.havlama();
		objd.dringk();
		objd.eat();
		objd.feed();
		objd.koku();
		
		
		
		
		
	}

	public void havlama () {
		System.out.println("Köpekler havlarlar");
	}
	
	
	public void koku () {
		System.out.println("Iyi koku alýrlar");
	}
}


