
public class Test {
	
	public static void main(String[] args) {
		
		//int arr[]=null;
		int arr[]= {10,11,5,12,7,2,19,9,31,33};
		
		FindEleInArray obj =new FindEleInArray();
		int maxValue=obj.findMaxEleInArray(arr);
		
		//System.out.println(maxValue);
		System.out.println("Max Value is:"+maxValue);
		
		int minValue=obj.findSmallElementInArray(arr);
		System.out.println("Min Value is:"+minValue);
		
		
		Student sObj=new Student();
		sObj.setName(null);
		
	}

}
