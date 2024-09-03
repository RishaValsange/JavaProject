
public class ReverseArray {
	
	public static void main(String[] args) {
		
		int arrr[]= {5,10,11,12,13,16,31,33};
		
		int arr[]=new int[arrr.length];
		int m=0;
		
		for(int i=arrr.length-1; i>=0; i--) {
			
			arr[m]=arrr[i];
			m++;
	
		}
		
		for(int val:arr) {
			
			System.out.println(val);
			
		}
	}

}
