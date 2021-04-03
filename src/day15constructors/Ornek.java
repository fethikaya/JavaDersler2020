package day15constructors;

public class Ornek {
	
	String sinifIsmi = "A1";
	int kontejan = 34;
	int erkek = 18;
	int kiz = 16;
	String alan = "Sayisal";
	
	/*
	Ornek (String sinfIsmi , int kontejan){
		this.sinifIsmi = sinifIsmi;
		this.alan = alan;
		
	}
	
	*/
	
	
	//--------------------------------------------------
	
	public static void main(String[] args) {

		Ornek s1 = new Ornek ();
		System.out.println("Sinif Ismi: " + s1.sinifIsmi);
		System.out.println("Kontejan : " + s1.kontejan);
		System.out.println("Erkek : " + s1.erkek);
		System.out.println("Kýz : " + s1.kiz);
		System.out.println("Alan : " + s1.alan);
		s1.donem();
		s1.basarý();
		
		/*
		System.out.println("=====================================");
		
		Ornek s2 = new Ornek ("B2", "Sayisal");
		System.out.println("Sinif Ismi: " + s2.sinifIsmi);
		System.out.println("Kontejan : " + s2.kontejan);
		System.out.println("Alan : " + s2.alan);
		s2.donem();
		s2.basarý();
		
		*/
		
		
		
		
		
	}

	
	//-----------------------------------------------------------
	
	public void donem () {
		System.out.println("2019 - 2020 Öðretim Yýlý");
	}
	
	public void basarý () {
		System.out.println("Baþarý oraný : % 56");
	}
	
}
