package search;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Yahoo extends BaseClass{

	@BeforeClass
	public void goToSite(){
		driver.navigate().to("http://yahoo.com");
	}
	
	@Test(dataProviderClass=DataClass.class, dataProvider="searchData")
	public void doSearch(String searchKey) throws Exception{
		driver.findElement(By.name("p")).sendKeys(searchKey);
		driver.findElement(By.id("UHSearchWeb")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), searchKey+" - Yahoo India Search Results");
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
	}
	*/
	
}
