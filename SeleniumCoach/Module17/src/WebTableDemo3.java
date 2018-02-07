import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableDemo3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> countriesList = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/td[3]"));
		System.out.println(countriesList.size());
		
		String country = null;
		String curVal = null;
		int count = 0;
		//picking
		for(int i=0; i<countriesList.size(); i++){
			country = countriesList.get(i).getText();
			//checking
			for(int j=i; j<countriesList.size(); j++){
				curVal = countriesList.get(j).getText();
				
				if(curVal.equals(country)){
					count++;
				}
				
			}
			
			System.out.println(country+"->"+count);
			count=0;
		}
		
		driver.close();		
	}
}










