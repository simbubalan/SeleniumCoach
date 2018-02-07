
public class LargestNumber {

	public static void main(String[] args) {
		int[] a = {10, 80, 30, 40, 50};
		
		int largest = a[0];
		
		for(int i=1; i<a.length; i++){
			if(largest<a[i])
				largest=a[i];
		}
		
		System.out.println("Largest is: "+largest);	
		
		int smallest = a[0];
		
		for(int i=1; i<a.length; i++){
			if(smallest>a[i])
				smallest=a[i];
		}
		
		System.out.println("Smallest is: "+smallest);	
	}
}
