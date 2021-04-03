package day27inheritance;

public class Bird extends Animal {

	public boolean kanat = true;  // Variable
	
	public Bird () {  // Constroctor
		System.out.println("Bird");
	}
	
	
	public static void main(String[] args) {

		Bird obj = new Bird ();
		
		obj.drink();
		obj.eat();
		obj.flay();
		
	}
	public void flay () {
		System.out.println("Uçarlar");
	}
	public void tweet () {
		System.out.println("Öterler");
	}

}
