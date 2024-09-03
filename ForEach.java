
public class ForEach {
	
	public static void main(String[] args) {
		
		String[] arr= {"Ris", "Vaish", "Sak", "Prat"};
		
		ForEach obj=new ForEach();
		obj.iterateArrayUsingForEach(arr);
		
	}
	
	void iterateArrayUsingForEach(String[] arr) {
		
		for(int i=arr.length-1; i>=0; i--) //length is 4 but index is 3
			                               //hence length-1
		{
			
			System.out.println(arr[i]);
		}
		
		
		//for each loop
		for(String value:arr) {
			
			System.out.println(value);//reverse and alternating is not possible
			
		}
		
		
	}

}
