package day28overriding;

public class Cat extends Animal {

	public static void main(String[] args) {
		Cat cat = new Cat ();
		cat.sound();
		
		
	}
	
	public void sound () {
		System.out.println("Miyavlarlar");
		
	}

		@Override  // Annotation
		public void ayakSayisi() {
		System.out.println("Dört ayaklarý var");
	}

		@Override
		public Animal myMethod() {
			Animal obj1 = new Animal ();
			return null;
		}
	
	
	
	
}