package actionkeys;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.DriverClass;

public class ActionKeys {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public By findLocator(String testObject){
		String locType=null;
		String locValue=null;
		By by;
		
		String str[] = testObject.split("\\|");
		locType=str[0];
		locValue=str[1];
		
		switch(locType){
			case "id":
				by = By.id(locValue);
				break;
			case "name":
				by = By.name(locValue);
				break;
			case "css":
				by = By.cssSelector(locValue);
				break;
			case "xpath":
				by = By.xpath(locValue);
				break;
			case "lnkTxt":
				by = By.linkText(locValue);
				break;
			case "parLnkTxt":
				by = By.partialLinkText(locValue);
				break;
			case "tagname":
				by = By.tagName(locValue);
				break;
			default:
				by = null;			
		}
		return by;		
	}
	
	public void openBrowser() throws Exception{
		try{
			System.out.println("Opening browser");
			System.setProperty("webdriver.gecko.driver", "E:\\Projects\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 10);
			DriverClass.testResult=true;
		}catch(Exception e){
			captureScreenshot();
			DriverClass.testResult=false;
		}
		
	}
	
	public void goToURL() throws Exception{
		try {
			System.out.println("Going to URL");
			driver.get("http://www.openhub.net");
			DriverClass.testResult=true;
		}catch(Exception e){
			captureScreenshot();
			DriverClass.testResult=false;
		}
		
	}
	
	public void input(String testObj, String testData) throws Exception{
		try {
			System.out.println("entering value");
			driver.findElement(findLocator(testObj)).sendKeys(testData);
			DriverClass.testResult=true;
		}catch(Exception e){
			captureScreenshot();
			DriverClass.testResult=false;
		}
		
	}
	
	public void clkBtn(String testObj) throws Exception{
		try {
			System.out.println("clicking Button");
			driver.findElement(findLocator(testObj)).click();
			DriverClass.testResult=true;
		}catch(Exception e){
			captureScreenshot();
			DriverClass.testResult=false;
		}
		
	}
	
	public void clkLnk(String testObj) throws Exception{
		try {
			System.out.println("clicking Link");
			driver.findElement(findLocator(testObj)).click();
			DriverClass.testResult=true;
		}catch(Exception e){
			captureScreenshot();
			DriverClass.testResult=false;
		}
		
	}
	
	public void verifyElement(String testObj) throws Exception{
		try {
			driver.findElement(findLocator(testObj));
			DriverClass.testResult=true;
		}catch(Exception e){
			captureScreenshot();
			DriverClass.testResult=false;
		}
		/*System.out.println("Verifying Element");	
		List<WebElement> list = driver.findElements(By.xpath(testObj));
		
		if(list.size()>0)
			return true;
		else
			return false;*/
		
	}
	
	public void captureScreenshot() throws Exception{
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, 
				new File("E:\\Projects\\workspaceJan930\\KWDTFW\\src\\"
						+ "screenshots\\screenshot"+System.currentTimeMillis()+".jpg"));
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
