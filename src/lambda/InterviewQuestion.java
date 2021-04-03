package lambda;

public class InterviewQuestion {

	/*
	 Toplamlarý verilen bir sayiya eþit olan tüm ikilleri bulunuz. 
	 örnek:
	 {4,5,7,11,9,13,8,12} araydaki toplamlarý 20 olan ikililer
	 (9,11) (7,13) (8,12)
	 */
	
	public static void main(String[] args) {

		int arr[] = {4, 5, 20, 11, 9, 13, 8, 12, 0};
		int x = 20;
		bulIkilileri(arr, x);
		
	}
	
	public static void bulIkilileri (int arr [], int x) {
	
		for (int i = 0; i <arr.length; i++) {
			for (int k = i+1; k<arr.length;k++) {
				if (arr [i]+ arr [k] ==x){
					System.out.println(arr [i] + "+" + arr[k] + "=" + x);
				}
			}
		}
	
		
	}

}
