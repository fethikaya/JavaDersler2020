package day27inheritance;

public class Car extends Vehicle  {

	public Car () {
		super (2); // İsteğe bağlı yazılmayabilir... Parents parametreli olduğu için burada hata veriyor. buraya parametre atayınca hata geçecektir
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
