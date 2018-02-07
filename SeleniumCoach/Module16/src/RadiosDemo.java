import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadiosDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.calculator.net/");
		driver.findElement(By.linkText("Income Tax")).click();
		
		List<WebElement> radiosList = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radiosList.size());
		
		for(int i=0; i<radiosList.size();i++){
			System.out.println(radiosList.get(i).getAttribute("value")+"-"+
					radiosList.get(i).getAttribute("name")+"-"+
					radiosList.get(i).isSelected()+"-"+
					radiosList.get(i).isDisplayed());
		}
		
		driver.close();
		
	}

}









