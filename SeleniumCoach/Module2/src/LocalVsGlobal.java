
public class LocalVsGlobal {
	//global
	public static int c = 30; 

	public static void main(String[] args) {
		//local
		int a = 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void udMethod(){
		//local
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("UD Method");
	}

}
