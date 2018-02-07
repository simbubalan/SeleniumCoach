package search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google {
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browserType){
		if(browserType.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver", "E:\\Projects\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\Projects\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "E:\\Projects\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
			System.out.println("Invalid browser type");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void goToURL(){
		driver.get("http://google.com");
	}
	
	@Test(priority=2)
	public void doSearch() throws InterruptedException{
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(2000);
		String actual = driver.getTitle().toLowerCase();
		String expected = "Selenium - Google Search".toLowerCase();
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
	
	
}















