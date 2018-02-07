import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownsDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.calculator.net/");
		
		//driver.findElement(By.linkText("Income Tax")).click();
		driver.findElement(By.partialLinkText("Income")).click();
		WebElement dropDownElement = driver.findElement(By.name("cfilestatus"));
		//retrieve options
		List<WebElement> list = dropDownElement.findElements(By.tagName("option"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
		}
		
		//to check selected value(s)
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText()+"->"+list.get(i).isSelected());
		}
		
		//select a value
		list.get(1).click();
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText()+"->"+list.get(i).isSelected());
		}
		
		for(int i=0; i<list.size(); i++){
			
			if(list.get(i).getText().equalsIgnoreCase("Married Filing Separately"))
				list.get(i).click();
		}
		
		driver.close();		
	}

}
