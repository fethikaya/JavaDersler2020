package day26passbyvalueinheritance;

public class Cat extends Mammal {

	public static void main(String[] args) {

		
		Cat objc = new Cat ();
		objc.temiz();
		objc.dringk();
		objc.feed();
		objc.eat();
		objc.miyav();
		
		
		
	}

	
	public void miyav () {
		System.out.println("Kediler miyavlarlar");
	}
	
	public void temiz () {
		System.out.println("Kediler Temizler");
	}
	
}
