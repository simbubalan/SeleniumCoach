import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		
		System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/h1")).getText());
		System.out.println(driver.findElement(By.xpath("//h2[@class='hidden-small']")).getText());
		
		
		driver.findElement(By.xpath("//p[@class='create-account']/span[2]/a")).click();
	}

}
