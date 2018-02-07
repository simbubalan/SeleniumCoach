
public class TestMath {

	public static void main(String[] args) {
		MathOperations obj = new MathOperations();
		obj.a=10;
		obj.b=20;
		obj.printSum();
		int result = obj.printMul();
		System.out.println(result);
		System.out.println(obj.isGreater());
		MathOperations.sayHi();
		
		System.out.println("-----------------------");
		MathOperations obj2 = new MathOperations();
		obj2.a=30;
		obj2.b=20;
		obj2.printSum();
		System.out.println(obj2.printMul());
		System.out.println(obj2.isGreater());
		MathOperations.sayHi();
		
	}

}
