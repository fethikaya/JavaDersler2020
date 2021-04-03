package day32interface;

public class Audi implements Car, Klima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void motor() {
		System.out.println("2.8 Turba Benzinli");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri");
		
	}

	@Override
	public void teker() {
		System.out.println("Michelin 24 inch çelik cant");
	}

	@Override
	public void isitma() {
		System.out.println("Akýllý isitma var");
		
	}

	@Override
	public void antiBakteri() {
		System.out.println("Anti baktari 100 %  baktari koruma");
		
	}

	@Override
	public void fiyat() {
		// TODO Auto-generated method stub
		
	}

}
