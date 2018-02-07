package search;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassA {
	@BeforeClass
	public void beforeClassA(){
		System.out.println("ClassA BeforeClass");
	}
	@AfterClass
	public void afterClassA(){
		System.out.println("ClassA AfterClass");
	}
	@BeforeMethod
	public void beforeMethodA(){
		System.out.println("ClassA Before Method");
	}
	@AfterMethod
	public void afterMethodA(){
		System.out.println("ClassA After Method");
	}
	@Test(priority=1)
	public void test1A(){
		System.out.println("ClassA Test1");
	}
	@Test(priority=2)
	public void test2A(){
		System.out.println("ClassA Test2");
	}
}
