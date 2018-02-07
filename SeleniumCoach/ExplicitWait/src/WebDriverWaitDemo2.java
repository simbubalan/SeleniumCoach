import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
			
		WebDriverWait wait = new WebDriverWait(driver, 10);
				
		driver.get("http://way2sms.com");
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("html/body/form/div[1]/div/a"), "Go to Way2SMS now"));
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("9000000000");
		//driver.findElement(By.xpath("//*[@id='password']	")).sendKeys("9000000000");
		//driver.findElement(By.xpath("//*[@id='loginBTN']")).click();
	
		//driver.quit();
	}

}
