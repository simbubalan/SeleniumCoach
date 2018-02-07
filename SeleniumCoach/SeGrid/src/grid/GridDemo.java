package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GridDemo {
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeClass
	public void openBrowser() throws Exception{
		//driver = new FirefoxDriver();
		String nodeURL = "http://192.168.1.230:5555/wd/hub"; 
		//DesiredCapabilities capabilities = new DesiredCapabilities().firefox();
		
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\geckodriver.exe");
		driver = new RemoteWebDriver(new URL(nodeURL), DesiredCapabilities.firefox());
		wait = new WebDriverWait(driver, 10);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
	}
	
	@Test
	public void doSearch(){
		driver.findElement(By.name("q")).sendKeys("Selenium Grid");
		driver.findElement(By.name("btnG")).click();
		driver.findElement(By.linkText("Next"));
		String actual = driver.getTitle().toLowerCase();
		String expected = "Selenium Grid - Google Search".toLowerCase();
		Assert.assertEquals(actual, expected);		
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
	
}









