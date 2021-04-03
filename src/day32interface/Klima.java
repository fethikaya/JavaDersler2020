package day32interface;

public interface Klima {

	int i = 15;
	
	void isitma ();
	
	void antiBakteri ();
	
	void fiyat ();
	
	
	public default void sogutma () {
		System.out.println("Ýyi soðutur");
	}
	
	
}
