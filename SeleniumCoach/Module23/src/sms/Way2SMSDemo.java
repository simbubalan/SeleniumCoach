/*WAP using JAVA, SWD and TestNG for below scenario:

- Open FF browser
- Go to way2sms web site
- Login
- Go to send sms page
- Enter reciepant mobile number, Text msg and send
- Logout
- Close Browser*/
package sms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Way2SMSDemo {
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void goToURL(){
		driver.get("http://way2sms.com");
	}
	
	@Test(priority=2)
	public void login(){
		driver.findElement(By.id("username")).sendKeys("8309386750");
		driver.findElement(By.id("password")).sendKeys("Mindq123");
		driver.findElement(By.id("loginBTN")).click();
		
		String actual = driver.findElement(By.xpath("//div[@class='welcome']/h3")).getText();
		String expected = "Welcome to Way2SMS";
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test(priority=3, dependsOnMethods="login")
	public void goToSendSMSPage(){
		driver.findElement(By.xpath("//*[@value='Send Free SMS']")).click();
		driver.findElement(By.xpath("//*[@id='sendSMS']/a")).click();		
	}
	
	@Test(priority=4, dependsOnMethods="login", dataProviderClass=DataClass.class, dataProvider="mobileData")
	public void sendSMS(String mobNo, String smsTxt) throws Exception{
		WebElement frameElement = driver.findElement(By.id("frame"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("mobile")).sendKeys(mobNo);
		driver.findElement(By.id("message")).sendKeys(smsTxt);
		driver.findElement(By.id("Send")).click();
		
		String actual = driver.findElement(By.xpath("//p[@class='mess']/span")).getText();
		String expected = "Message has been submitted successfully.";
		driver.findElement(By.xpath("//div[@class='wrap']/p[1]")).click(); 
		driver.switchTo().defaultContent();
		Assert.assertEquals(actual, expected);		
	}
	
	@Test(priority=5, dependsOnMethods="login")
	public void logout(){
		
		driver.findElement(By.className("lout")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='Login']/div[2]/h2")).getText().contains("Existing"), true);
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.close();
	}	
}













