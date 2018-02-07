import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YahooSearch {
public WebDriver driver;
	
	@BeforeClass
	public void openBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//driver.get("http://yahoo.com");
		driver.navigate().to("http://yahoo.com");
	}
	
	@Test(priority=1)
	public void doSearch1() throws Exception{
		driver.findElement(By.name("p")).sendKeys("Selenium");
		driver.findElement(By.id("UHSearchWeb")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Selenium - Yahoo India Search Results");
	}
	
	@AfterMethod
	public void backToHomePage() throws Exception{
		driver.navigate().back();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Yahoo");
	}
	
	@Test(priority=2)
	public void doSearch2() throws Exception{
		driver.findElement(By.name("p")).sendKeys("UFT");
		driver.findElement(By.id("UHSearchWeb")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "UFT - Yahoo India Search Results");
	}
	
	@Test(priority=3)
	public void doSearch3() throws Exception{
		driver.findElement(By.name("p")).sendKeys("Mobile");
		driver.findElement(By.id("UHSearchWeb")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Mobile - Yahoo India Search Results");
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.close();
	}
	
	
}
