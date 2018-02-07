import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test(priority=1)
	public void doLogin(){
		System.out.println("User is logigng in");
		Assert.assertEquals(true, true);
	}
	
	@Test(priority=2, dependsOnMethods="doLogin")
	public void balTF(){
		System.out.println("User is doing bal TF");
		Assert.assertEquals(false, true);
	}
	
	@Test(priority=3, dependsOnMethods={"doLogin","balTF"})
	public void doLogout(){
		System.out.println("User is logigng out");
		Assert.assertEquals(true, true);
	}
	
}
