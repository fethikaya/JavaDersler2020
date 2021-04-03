package day26passbyvalueinheritance;

public class Mammal extends Animal {

	public static void main(String[] args) {

		
		Mammal objM = new Mammal ();
		objM.dringk();
		objM.eat();
		objM.feed();
		
		
	}

	
	public void feed () {
		System.out.println("Yavrularýný beslerler");
	}
	
}
