package day25encapsulation;

public class E01 {

	private int sifre = 1234;
	
	private String isim = "Ali Can";
	
	private String ozelsifre = "ilyas";
	
	private char ch = 'A';
	
	
	//-------------------------------------------------------
	
	public static void main(String[] args) {

		
	}

	public int getSifre () {
	return sifre;
	}
	
	
	public String getIsim() {
		return isim;
	}
	
	
	
	
	// Variable oluþturup encapculation yapýnýz
	// diðer class'lardan okunabilmesi için gerekini yapýnýz
	// diðer klacstan okunuuz
	
	
	public String getOzelsifre () {
		return ozelsifre;
	}
	
	
	public char getCh () {
		return ch;
	}
	
	
	
	
	public void setSifre (int sifre) {
		this.sifre = sifre;
		
	}
	
	public void setCh (char ch) {
		this.ch = ch;
	}
	
	
	public void setIsim (String isim) {
		this.isim = isim;
	}
	
	
	
	
	//------------------------------------------------------------------
	
	
	
	
	
}
