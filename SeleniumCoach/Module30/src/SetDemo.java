import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		//HashSet<String> set = new HashSet<String>();
		Set<String> set = new HashSet<String>();
		System.out.println(set.size());//0
		set.add("IND");
		System.out.println(set.size());//1
		set.add("UK");
		System.out.println(set.size());//2
		set.add("IND");
		System.out.println(set.size());//2; duplicate
		//apply iterator to a set to retrieve elements
		Iterator<String> ite = set.iterator();
		/*System.out.println(ite.hasNext());
		System.out.println(ite.next());
		System.out.println(ite.hasNext());
		System.out.println(ite.next());
		System.out.println(ite.hasNext());*/
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
		
		
		
	}

}
