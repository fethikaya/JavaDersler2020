package day26passbyvalueinheritance;

public class Bird extends Mammal {

	public static void main(String[] args) {

		Bird objb = new Bird ();
		objb.flay();
		objb.eat();
		objb.dringk();
		
	}

	public void flay () {
		System.out.println("Ucarlar");
	}
	
}
