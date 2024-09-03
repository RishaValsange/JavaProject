
public class AlternateArrayElement {
	
public static void main(String[] args) {
	
	//int[] arr=new int[10];
	
	int[] arr= {1,2,3,4,5,6,7,8,9,10};
	
	//Program for finding Length of array
	System.out.println("Length of arrray is:"+arr.length);
	
	
	//Program for alternate array element
	for(int i=0; i<arr.length; i++ ) { //i+2
		
		System.out.println(arr[i]);
		i++;                            //
	}
	
}

}
