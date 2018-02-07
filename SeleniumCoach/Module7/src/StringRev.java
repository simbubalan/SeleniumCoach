
public class StringRev {

	public static void main(String[] args) {
		String originalString = "We are in the class";
		String revString="";
		
		int len = originalString.length();
		
		for(int i=len-1; i>=0; i--){
			revString=revString+originalString.charAt(i);
		}
		
		System.out.println(revString);	
	}
}
