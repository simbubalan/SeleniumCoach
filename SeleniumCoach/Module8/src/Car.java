
public class Car {
	
	public int wheels;
	public int mirrors;
	
	public void start(){
		wheels=4;
		System.out.println("Car is starting "+wheels);
	}
	
	public void accel(){
		System.out.println("Car is accelerating");
	}
	
	public void stop(){
		System.out.println("Car is stopping");
	}
}
