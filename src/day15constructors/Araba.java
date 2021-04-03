package day15constructors;

public class Araba {

	int yil = 2019;
	String marka = "Toyota";
	String model = "Rav4";
	int fiyat = 20000;
	
	Araba (String model, int fiyat){
		this.model = model;
		this.fiyat = fiyat;
	}
	
	Araba (int yil, String marka, String model,int fiyat){
		this.yil = yil;
		this.marka = marka;
		this.model = model;
		this.fiyat = fiyat;
				
	}
	
	
	Araba (){
		
	}
	
	//-----------------------------
	
	public static void main(String[] args) {

			Araba a1 = new Araba ();
			System.out.println("Fiyat: " + a1.fiyat);
			System.out.println("Marka: " + a1.marka);
			System.out.println("Model :" + a1.model );
			System.out.println("Yil: " + a1.yil);
		a1.hizlanma();
		a1.tuketim();
		
		
		System.out.println("=================" );
		
		Araba a2 = new Araba ("Corolla", 1200);
		System.out.println("Fiyat: " + a2.fiyat);
		System.out.println("Marka: " + a2.marka);
		System.out.println("Model :" + a2.model );
		System.out.println("Yil: " + a2.yil);
		a2.hizlanma();
		a2.tuketim();
		
		
		
		System.out.println("=======================");
		
		Araba a3 = new Araba (2020,"Audi", "R8",  50000);
		System.out.println("Fiyat: " + a3.fiyat);
		System.out.println("Marka: " + a3.marka);
		System.out.println("Model: " + a3.model);
		System.out.println("Yil: " + a3.yil);
		a3.hizlanma();
		a3.tuketim();

		
		
	}

	
	//-------------------------------------------------------

	
	public void hizlanma () {
		System.out.println("7 Saniyede 100km/sa ulasýr");
	}
	
	
	public void tuketim () {
		System.out.println("km'de 0.1 dolar");
	}
	
	
	
	
}
