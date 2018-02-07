
public class TestCar {

	public static void main(String[] args) {
		Car a = new Car();
		System.out.println(a.mirrors);
		System.out.println(a.wheels);
		a.start();
		a.accel();
		a.stop();
		System.out.println("----------------------");
		BMW b = new BMW();
		System.out.println(b.mirrors);
		System.out.println(b.wheels);
		b.start();
		b.accel();
		b.stop();
		b.fillFuel();
	}

}
