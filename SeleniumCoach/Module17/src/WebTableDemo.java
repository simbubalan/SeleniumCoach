import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> list = driver.findElements(By.tagName("table"));
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).isDisplayed());
		}
		
		WebElement tagsTable = driver.findElement(By.xpath("//*[@id='main']/table[2]"));
		List<WebElement> rows = tagsTable.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		WebElement rowElement = tagsTable.findElement(By.xpath("//tbody/tr[2]"));
		List<WebElement> values = rowElement.findElements(By.tagName("td"));
		System.out.println(values.size());//2
		
		
		for(int i=0; i<values.size(); i++){
			System.out.println(values.get(i).getText()+" "+values.get(i).isDisplayed());
		}
		
		driver.close();
	}

}


















