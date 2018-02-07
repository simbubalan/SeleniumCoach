
public class BMW extends Car{
	//method overridding
	public void start(){
		wheels=6;
		System.out.println("BMW is starting"+wheels);
	}
	
	public void fillFuel(){
		System.out.println("BMW is filling Fuel");
	}
}
