
public class FindEleInArray{
	
	public static void main(String[] args) {
		
		int arr[]= {5,12,10,11,7,2,19,9,31,17};
		
		FindEleInArray obj=new FindEleInArray();
		int minValue=obj.findSmallElementInArray(arr);
		
		System.out.println(minValue);
		
	}
	
	int findSmallElementInArray(int arr[]){
		
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]<min) {
				System.out.println("Min value:"+arr[i]);
				min=arr[i];
			}
		}
		
		return min;
		
	}
	
	
	int findMaxEleInArray(int arr[]) {
		
		if(arr!=null) {
		
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		
		return max;
		
		}
		
		else {
			System.out.println("Array Value is null! Please pass values in the Array");
			return 0;
		}
		
	}

}
