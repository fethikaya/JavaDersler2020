package day17staticblock;

public class Odev {

	
	static int count = 0;
	public static void increment () {
		
		
		count ++;
	}
	
	//=========================================
	public static void main(String[] args) {

		Odev obj1 = new Odev ();
		Odev obj2 = new Odev ();
	//	obj1 increment ();
	//	obj2 increment ();
		
		System.out.println("Obj1 Count is: " + obj1.count);
		System.out.println("Obj1 Count is: " + obj2.count);
	}
	
	//==========================================
	
	
	
	
	
	
	//==========================================
}
