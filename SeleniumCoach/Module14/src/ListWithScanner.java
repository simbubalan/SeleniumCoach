import java.util.ArrayList;
import java.util.Scanner;

public class ListWithScanner {

	public static void main(String[] args) {
		System.out.println("Enter number of strings: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		System.out.println("Enter values: ");
		
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<n; i++){
			list.add(s.nextLine());
		}
		
		System.out.println(list.size());
		
		for(int i=0; i<n; i++){
			System.out.println(list.get(i));
		}
	}

}
