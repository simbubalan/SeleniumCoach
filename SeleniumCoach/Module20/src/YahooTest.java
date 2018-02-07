import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YahooTest {
	public WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=2)
	public void goToTestSite(){
		driver.get("https://login.yahoo.com/config/mail?&.src=ym&.intl=in");
	}
	
	@Test(priority=3)
	public void doLogin() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("venkat");
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
		
		boolean actual = false;
		
		try{
			actual = driver.findElement(By.xpath("//*[@title='Compose']")).isDisplayed();
		}catch(Exception e){
			
		}
		
		Assert.assertEquals(actual, true);
	}
	
	@Test(priority=5, dependsOnMethods="doLogin")
	public void sendMail(){
		driver.findElement(By.xpath("//*[@title='Compose']")).click();
		driver.findElement(By.xpath("//*[@id='to-field']")).sendKeys("venkat.mindq@yahoo.com");
		driver.findElement(By.xpath("//*[@id='subject-field']")).sendKeys("10Feb2017");
		driver.findElement(By.xpath("//*[@id='rtetext']")).sendKeys("Test Email");
		driver.findElement(By.xpath("//*[@class='btn default']")).click();
		
		boolean actual = false;
		
		try{
			actual = driver.findElement(By.xpath("//*[@class='notification-text']")).isDisplayed();
		}catch(Exception e){
			
		}
		
		Assert.assertEquals(actual, true);
	}
	
	@Test(priority=6, dependsOnMethods="doLogin")
	public void doLogout(){
		driver.findElement(By.xpath("//*[@class='D(ib) MouseOver Td(n) Td(n):h yucs-trigger Lh(1) Lts($ws) M(-10px) P(10px)']")).click();
		driver.findElement(By.xpath("//*[@id='yucs-signout']")).click();
	}
	
	@Test(priority=7)
	public void closeBrowser(){
		driver.close();
	}
	
}

















