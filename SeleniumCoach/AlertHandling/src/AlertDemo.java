import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.rediffmail.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		
		
	}

}
