
public class StaticVsNS {
	public static int a = 10;//static 
	public int b = 20;//non-static
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		sMethod();
		nsMethod();
	}
	
	public static void sMethod(){
		System.out.println("Static Method");
		System.out.println(a);
		System.out.println(b);
	}
	
	public void nsMethod(){
		System.out.println("Non Static Method");
		System.out.println(a);
		System.out.println(b);
	}

}
