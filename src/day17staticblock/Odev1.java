package day17staticblock;

public class Odev1 {

	int x;
	static int y;
	
	Odev1  (int i) {
		x = x +1;
		y = y+1;
		
	}
	
	//=========================================
	public static void main(String[] args) {

		new Odev1 (2);
		Odev1 mc = new Odev1 (3);
		
		System.out.println(mc.x + " " + mc.y);
		
	}
	
	//==========================================
	
	
	
	
	
	
	//==========================================
}
