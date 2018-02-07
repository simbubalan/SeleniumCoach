import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = s.nextInt();//reads integer
		System.out.println("Enter a boolean: ");
		boolean b = s.nextBoolean();//reads true/false
		System.out.println("Enter a decimal: ");
		double d= s.nextDouble();//reads decimal
		s.nextLine();
		System.out.println("Enter a string: ");
		String str = s.nextLine();//reads string
		System.out.println("Enter a character: ");
		char c = s.nextLine().charAt(0);//reads character
		
		System.out.println(a+"-"+b+"-"+d+"-"+str+"-"+c);	
	}

}
