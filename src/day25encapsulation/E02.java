package day25encapsulation;

public class E02 {

	public static void main(String[] args) {

		E01 obj = new E01 ();
		obj.getSifre();
		System.out.println(obj.getSifre());
		
		
		obj.getIsim();
		System.out.println(obj.getIsim());
		
		
		
		obj.getOzelsifre();
		System.out.println(obj.getOzelsifre());
		
		obj.getCh();
		System.out.println(obj.getCh());
		
		
		//------------------------------
		obj.setSifre(98765);
		obj.getCh();
		System.out.println(obj.getSifre());
		
		obj.setCh('Z');
		obj.getCh();
		System.out.println(obj.getCh());
		
		
		obj.setIsim("Fethi Kaya");
		obj.getIsim();
		System.out.println(obj.getIsim());
		
		
		
		
		
		
		
		//-------------------------------------------------
		
		
		
		E03 obj1 = new E03();
		obj1.getIsim();
		System.out.println(obj1.getIsim());
		
		obj1.getYas();
		System.out.println(obj1.getYas());
		
	
		obj1.setBorc(2300.24f);
		// okunamaz diye se�ti�imiz i�in okutamay�z. 
		// De�i�tirildi ama okutamay�z. 
		
		obj1.setYas((byte) 25);  // int olarak alg�lar. biz se�erken byte se�mi�tik. bu y�zden buradan belirtmek laz�m
		obj1.getYas();
		System.out.println(obj1.getYas());
		
		
		
		
	}

}
