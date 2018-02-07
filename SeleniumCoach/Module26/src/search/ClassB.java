package search;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassB{
	@BeforeClass
	public void beforeClassB(){
		System.out.println("ClassB BeforeClass");
	}
	@AfterClass
	public void afterClassB(){
		System.out.println("ClassB AfterClass");
	}
	@BeforeMethod
	public void beforeMethodB(){
		System.out.println("ClassB Before Method");
	}
	@AfterMethod
	public void afterMethodB(){
		System.out.println("ClassB After Method");
	}
	@Test(priority=1)
	public void test1B(){
		System.out.println("ClassB Test1");
	}
	@Test(priority=2)
	public void test2B(){
		System.out.println("ClassB Test2");
	}
}
