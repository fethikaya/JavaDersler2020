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
		System.out.println("Kahvaltý saat 08:00 - 10:00");
	}
	
	
	@Override
	public void cay() {
		System.out.println("Odalara çay servisimiz vardýr");
		super.cay();
	}

}
