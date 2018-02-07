import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		System.out.println(list.size());//0
		list.add("India");
		System.out.println(list.size());//1
		list.add("UK");
		System.out.println(list.size());//2
		list.add("US");
		System.out.println(list.size());//3
		list.add("India");
		System.out.println(list.size());//4	
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		list.remove(0);
		System.out.println(list.size());	
	}
}
