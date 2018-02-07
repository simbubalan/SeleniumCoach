package search;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Google extends BaseClass{

	@BeforeTest
	public void printName1(){
		System.out.println("Google Test is begining");
	}
	
	@AfterTest
	public void printName2(){
		System.out.println("Google Test is completed");
	}
	
	@BeforeClass
	public void GoToSite(){
		driver.navigate().to("http://google.com");
	}
	
	@Test(dataProviderClass=DataClass.class, dataProvider="searchData")
	public void doSearch(String searchKey) throws Exception{
		driver.findElement(By.name("q")).sendKeys(searchKey);
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), searchKey+" - Google Search");
	}
	
	@AfterMethod
	public void backToHomePage() throws Exception{
		driver.navigate().back();
		Thread.sleep(2000);
		//Assert.assertEquals(driver.getTitle(), "Yahoo");
	}
	
	/*@AfterClass
	public void closeBrowser(){
		driver.close();
	}*/
	
	
}
