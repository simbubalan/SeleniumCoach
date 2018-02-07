import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.calculator.net/");
		
		driver.findElement(By.linkText("Income Tax")).click();
		WebElement dropDownElement = driver.findElement(By.name("cfilestatus"));
		
		Select s = new Select(dropDownElement);
		//to retrieve options
		List<WebElement> list = s.getOptions();
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
		}
		
		//to select an option
		s.selectByIndex(1);
		s.selectByValue("MarriedJoint");
		s.selectByVisibleText("Married Filing Separately");
		
		//to retrieve selected values
		System.out.println(s.isMultiple());
		List<WebElement> allSelectedList = s.getAllSelectedOptions();
		System.out.println(allSelectedList.size()); 
		
		WebElement selected = s.getFirstSelectedOption();
		System.out.println(selected.getText());
		
		
		
		
		
		
		
		
		
	}

}













