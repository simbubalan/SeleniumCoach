import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		
		WebElement secondRowFirstCol = driver.findElement(By.xpath("//*[@id='main']/table/tbody/tr[2]/td[1]"));
		System.out.println(secondRowFirstCol.getText());
		
		List<WebElement> thirdRow = driver.findElements(By.xpath("//*[@id='main']/table/tbody/tr[3]/td"));
		System.out.println(thirdRow.size());
		
		for(int i=0; i<thirdRow.size(); i++){
			System.out.println(thirdRow.get(i).getText());
		}
		System.out.println("**********************");
		List<WebElement> FirstCol = driver.findElements(By.xpath("//*[@id='main']/table/tbody/tr/td[1]"));
		System.out.println(FirstCol.size());
		
		for(int i=0; i<FirstCol.size(); i++){
			System.out.println(FirstCol.get(i).getText());
		}
		
		System.out.println("**********************");
		List<WebElement> allValues = driver.findElements(By.xpath("//*[@id='main']/table/tbody/tr/td"));
		System.out.println(allValues.size());
		
		for(int i=0; i<allValues.size(); i++){
			System.out.println(allValues.get(i).getText());
		}
		
		System.out.println("**********************");
		List<WebElement> allHeaders = driver.findElements(By.xpath("//*[@id='main']/table/tbody/tr/th"));
		System.out.println(allHeaders.size());
		
		for(int i=0; i<allHeaders.size(); i++){
			System.out.println(allHeaders.get(i).getText());
		}
		
		driver.close();
	}
}


















