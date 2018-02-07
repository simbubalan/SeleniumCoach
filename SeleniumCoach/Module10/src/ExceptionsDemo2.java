
public class ExceptionsDemo2 {

	public static void main(String[] args) {
		System.out.println("A");
		
		try{
			System.out.println(10/0);
		}catch(Exception e){
			System.out.println("Exception");
		}
		
		System.out.println("B");
	}

}
