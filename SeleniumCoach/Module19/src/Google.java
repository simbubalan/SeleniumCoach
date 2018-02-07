import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Google {
	
	public WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=2)
	public void goToTestSite(){
		driver.get("http://www.google.com");
	}
	
	@Test(priority=3)
	public void doSearch(){
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("btnG")).click();
	}
	
	@Test(priority=4)
	public void closeBrowser(){
		driver.close();
	}
}
