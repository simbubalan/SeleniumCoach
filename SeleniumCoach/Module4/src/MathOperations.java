
public class MathOperations {
	
	public int a;
	public int b;
	
	public MathOperations(){
		a=1;
		b=1;
	}
	
	public MathOperations(int x){
		a=x;
		b=1000;
	}
	
	public MathOperations(int x, int y){
		a=x;
		b=y;
	}
	
	public void printSum(){
		System.out.println(a+b);
	}
	
	public int printMul(){
		int c = a*b;
		return c;
	}
	
	public boolean isGreater(){
		//System.out.println(a>b);
		return a>b;
	}
	
	public static void sayHi(){
		System.out.println("Hi");
	}
	
}
