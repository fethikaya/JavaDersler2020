package day15constructors;

public class C01 {

	C01(){
		System.out.println("Parametresiz constructor");
	}
	C01(int i){
		System.out.println("Integer parametreli constructor");
	}
	C01(String s){
		System.out.println("String parametreli constructor");
	}
	
	C01(String s, int i){
		System.out.println("Iki parametreli constructor");
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		
		C01 obj1 = new 	C01 ();
		
		C01 obj2= new C01 ("Ali")	;
		C01 obj3= new C01 (12);
		C01 obj4= new C01 ("Fethi", 5);
		
		
	}
	
	public void toplama () {
		System.out.println("Toplama");
	}

}
