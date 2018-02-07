
public class TestMath {

	public static void main(String[] args) {
		MathOperations obj1 = new MathOperations();
		obj1.printSum();
		System.out.println("---------------------");
		MathOperations obj2 = new MathOperations(10, 100);
		obj2.printSum();
		System.out.println("-----------------------");
		MathOperations obj3 = new MathOperations(2000);
		obj3.printSum();//3000
	}

}
