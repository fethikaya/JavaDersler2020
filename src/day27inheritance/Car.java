package day27inheritance;

public class Car extends Vehicle  {

	public Car () {
		super (2); // �ste�e ba�l� yaz�lmayabilir... Parents parametreli oldu�u i�in burada hata veriyor. buraya parametre atay�nca hata ge�ecektir
		System.out.println("Car");
	}
	
	public Car (String name) {
		this ();
		System.out.println("Car");
	}
	
	//-----------------------------------------------------------------------
	
	public static void main(String[] args) {

		Car car = new Car ();
		
	}

}
