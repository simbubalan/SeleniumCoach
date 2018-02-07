import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://google.com";
		driver.get(url);
		
		//WebElement gmailLink = driver.findElement(By.className("gb_P"));
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		System.out.println(gmailLink.isDisplayed());
		System.out.println("Values is: "+gmailLink.getAttribute("href"));
		System.out.println(gmailLink.getText());
		System.out.println(gmailLink.getLocation());
		System.out.println(gmailLink.getTagName());//a
		gmailLink.click();
		
		
		
		
		
	}

}
