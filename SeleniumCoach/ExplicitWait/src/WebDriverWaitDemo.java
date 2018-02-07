import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10); //or
		//Wait wait = new WebDriverWait(driver, 10);	
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("btnG")).click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.titleContains("Selenium"));
		//wait.until(ExpectedConditions.alertIsPresent());		
		String actual = driver.getTitle().toLowerCase();
		String expected = "Selenium - Google Search".toLowerCase();
		System.out.println(actual);
		System.out.println(expected);
		if(actual.equals(expected))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.quit();
	}

}
