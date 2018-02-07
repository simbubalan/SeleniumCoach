
public class ExceptionsDemo3 {

	public static void main(String[] args) {
		System.out.println("A");
		
		try{
			int a[] = new int[-2];
		}finally{
			System.out.println("B");
		}
		
		System.out.println("C");
		
	}

}
