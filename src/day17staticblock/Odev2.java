package day17staticblock;

public class Odev2 {

	int count =0;
	
	Odev2 (){
		this.count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Odev2 c1 = new Odev2 ();
		Odev2 c2 = new Odev2 ();
		Odev2 c3 = new Odev2 ();
		

	}

}
