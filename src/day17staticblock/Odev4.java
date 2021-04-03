package day17staticblock;

public class Odev4 {

		int x = 3;
		int y = 5;
		
		Odev4 (){
			x = x + 1;
			System.out.println("-x " + x);
			
			
		}
		Odev4 (int i){
			this ();
			this.y = i;
			x = x+y;
			System.out.println("-x " + x);
		}
	
		Odev4 (int i1 , int i2){
			this (3);
			this.x = - 4;
			System.out.println("-x " + x);
		}
	public static void main(String[] args) {

		Odev4 mc1 = new Odev4 (4,3);
		
	}

}
