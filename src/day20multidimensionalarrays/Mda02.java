package day20multidimensionalarrays;

public class Mda02 {

	public static void main(String[] args) {

		
		
		// �nteger Multidemensional array olu�turun ve t�m elmanlar�n�n toplaman� yazd�r�n
		
		
		int mdai [][] = {{1,2},{3},{4,5,6}};
		
		// 1.yol Hard codiung (tercih edilmez)
		
		System.out.println(mdai [0][0] + mdai [0][1]+ mdai[1][0]+ mdai[2][0]+mdai [2][1]+ mdai[2][2]);
		
		
		// 2. yol for loop  (Dynamic coding,,,Tercih edilen)
		
		
		int sum =0;
		for (int i = 0; i < mdai.length; i++) {
			
			for (int k = 0; k < mdai[i].length; k++) {
				sum = sum + mdai[i][k];
			//	System.out.print("T�m elamanlar :"+ mdai[i][k] + ","); // T�m elemanlar
			}
		}
		
		System.out.println(sum);
		
	}

}
