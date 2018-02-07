import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpecificAreaLinks {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links are: "+allLinks.size());
		
		WebElement langArea = driver.findElement(By.id("_eEe"));
		List<WebElement> specificLinks = langArea.findElements(By.tagName("a"));
		System.out.println("Lang. specific Links are: "+specificLinks.size());
		
		driver.close();
	}

}









