package actionkeys;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.DriverClass;

public class ActionKeys {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public void openBrowser(){
		try{
			System.out.println("Opening browser");
			System.setProperty("webdriver.gecko.driver", "E:\\Projects\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 10);
			DriverClass.testResult=true;
		}catch(Exception e){
			DriverClass.testResult=false;
		}
		
	}
	
	public void goToURL(){
		try {
			System.out.println("Going to URL");
			driver.get("http://www.openhub.net");
			DriverClass.testResult=true;
		}catch(Exception e){
			DriverClass.testResult=false;
		}
		
	}
	
	public void input(String testObj, String testData){
		try {
			System.out.println("entering value");
			driver.findElement(By.xpath(testObj)).sendKeys(testData);
			DriverClass.testResult=true;
		}catch(Exception e){
			DriverClass.testResult=false;
		}
		
	}
	
	public void clkBtn(String testObj){
		try {
			System.out.println("clicking Button");
			driver.findElement(By.xpath(testObj)).click();
			DriverClass.testResult=true;
		}catch(Exception e){
			DriverClass.testResult=false;
		}
		
	}
	
	public void clkLnk(String testObj){
		try {
			System.out.println("clicking Link");
			driver.findElement(By.xpath(testObj)).click();
			DriverClass.testResult=true;
		}catch(Exception e){
			DriverClass.testResult=false;
		}
		
	}
	
	public void verifyElement(String testObj){
		try {
			driver.findElement(By.xpath(testObj));
			DriverClass.testResult=true;
		}catch(Exception e){
			DriverClass.testResult=false;
		}
		/*System.out.println("Verifying Element");	
		List<WebElement> list = driver.findElements(By.xpath(testObj));
		
		if(list.size()>0)
			return true;
		else
			return false;*/
		
	}

	public void closeBrowser(){
		try {
			System.out.println("closing browser");
			driver.quit();
			DriverClass.testResult=true;
		}catch(Exception e){
			DriverClass.testResult=false;
		}
		
	}
		
}
