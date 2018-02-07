
public class WrapperClassDemo {

	public static void main(String[] args) {
		int a = 10;//primitive
		Integer b = new Integer(a);//class//auto boxing
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int c = Integer.parseInt("100");
		System.out.println(c);
		
			
		int d = b.intValue();//unboxing
		System.out.println(d);
		
		
		
	}

}
