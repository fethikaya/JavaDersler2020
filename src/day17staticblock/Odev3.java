package day17staticblock;

public class Odev3 {

	int number ;
	String name ;
	static String college = "ITS";
	
	Odev3(int r, String n, String college){
		this.number = r;
		this.name = n;
		this.college = college;
	}
	
	public static void main(String[] args) {

		Odev3 s1 = new Odev3 (111,"Karan","IMT");
		Odev3 s2 = new Odev3 (222,"Arayan","Harvart");
		
		System.out.println(s1.number);
		System.out.println(s2.number);
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		System.out.println(s1.college);
		System.out.println(s2.college);
		
	}

}
