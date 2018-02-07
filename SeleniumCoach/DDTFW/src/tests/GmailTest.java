package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import or.ObjRepository;

public class GmailTest extends ObjRepository{
	
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void openBrowser(){
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}
	public static void goToURL(){
		driver.get("http://www.gmail.com");
	}
	
	public static boolean enterCredentials(String uname, String pswrd){
		try{
			driver.findElement(By.xpath(userNameField)).sendKeys(uname);
			driver.findElement(By.xpath(nextBtn)).click();
			
			wait.until(ExpectedConditions.urlContains("password"));
			
			driver.findElement(By.xpath(passwordField)).sendKeys(pswrd);
			driver.findElement(By.xpath(signInBtn)).click();
			
			driver.findElement(By.xpath(sentMailLink));
			System.out.println("Valid credentails");
			
			doLogout();
			return true;
		}catch(Exception e){
			System.out.println("Invalid credentails");
			return false;
		}
	}
	
	public static void doLogout(){
		driver.findElement(By.xpath(profileLink)).click();
		driver.findElement(By.xpath(signOutBtn)).click();
	}
	
	public static void closeBrowser(){
		driver.quit();
	}
}
