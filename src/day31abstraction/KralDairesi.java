package day31abstraction;

public class KralDairesi extends Otel{

	public static void main(String[] args) {
		
		KralDairesi krl = new KralDairesi ();
		krl.kahvalti();
		krl.cay();
		krl.wifi();
		
		
		
		
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvalt� saat 08:00 - 10:00");
	}
	
	
	@Override
	public void cay() {
		System.out.println("Odalara �ay servisimiz vard�r");
		super.cay();
	}

}
