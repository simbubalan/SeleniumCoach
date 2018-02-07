import org.testng.annotations.Test;

public class TestNGDemo2 {
	@Test(priority=1)
	public void login(){
		System.out.println("User is logging in");
	}
	
	@Test(priority=2)
	public void balTF(){
		System.out.println("User is doing bal TF");
	}
	
	@Test(priority=3)
	public void logout(){
		System.out.println("User is logging out");
	}
	
	
}
