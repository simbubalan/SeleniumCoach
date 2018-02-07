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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridDemo {
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Parameters({"nodeURL","browser"})
	@BeforeClass
	public void openBrowser(String nodeAddress, String browserType) throws Exception{
		System.out.println(nodeAddress);
		System.out.println(browserType);
		DesiredCapabilities cap = new DesiredCapabilities();		
		
		if(browserType.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver", "E:\\Projects\\geckodriver.exe");
			cap = DesiredCapabilities.firefox();
		}
		else if(browserType.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\Projects\\chromedriver.exe");
			cap = DesiredCapabilities.chrome();
		}
		else if(browserType.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "E:\\Projects\\IEDriverServer.exe");
			cap = DesiredCapabilities.internetExplorer();
		}
		
		driver = new RemoteWebDriver(new URL(nodeAddress), cap);
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









