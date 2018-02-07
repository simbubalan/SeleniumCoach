
public class StaticVsNS2 {
	public static int a = 10;//static 
	public int b = 20;//non-static
	
	public static void main(String[] args) {
		StaticVsNS2 obj = new StaticVsNS2();
				
		System.out.println(a);
		System.out.println(obj.b);
		sMethod();
		obj.nsMethod();
	}
	
	public static void sMethod(){
		System.out.println("Static Method");
	}
	
	public void nsMethod(){
		System.out.println("Non Static Method");
	}

}
