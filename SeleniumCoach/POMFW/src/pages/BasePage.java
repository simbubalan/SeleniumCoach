package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BasePage {
	public static WebDriver driver;
	public static WebDriverWait wait; 
	
	
	public void openBrowser(String browserName) throws Exception{
		try{
			System.out.println("Opening browser");
			
			if(browserName.equalsIgnoreCase("FF")){
				System.setProperty("webdriver.gecko.driver", "E:\\Projects\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver", "E:\\Projects\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver", "E:\\Projects\\IEDriverServer2.53.1\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
			wait = new WebDriverWait(driver, 15);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://gmail.com");
						
		}catch(Exception e){
			
		}
		
	}
	
	
	public void closeBrowser(){
		try {
			System.out.println("closing browser");
			driver.quit();
			
		}catch(Exception e){
			
		}
		
	}
}
