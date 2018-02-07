import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		driver.close();
		
	}

}
