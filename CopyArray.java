
public class CopyArray {
	
	public static void main(String[] args) {
		
		int[] arr= {5,10,11,12,16};
		
		int[] arr1=new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			
			arr1[i]=arr[i];
		}
		
		for(int i=0; i<arr1.length; i++) {
			
			System.out.println(arr1[i]);
			
		}
		
	}

}
