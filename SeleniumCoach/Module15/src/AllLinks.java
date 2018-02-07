import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinks {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++){
			System.out.println(i+"*"+list.get(i).isDisplayed()+"*"+list.get(i).getText()
					+"*"+list.get(i).getAttribute("href")
					+"*"+list.get(i).getLocation());
		}
		
		int count =0;
		
		for(int i=0; i<list.size(); i++){
			
			if(list.get(i).isDisplayed())
				count++;
		}
		
		System.out.println("Visible linsk are: "+count);
		
		driver.close();
	}

}









