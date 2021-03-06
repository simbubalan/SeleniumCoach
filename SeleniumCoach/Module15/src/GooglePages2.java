/*WAP using Java & SWD for below scenario:
- Open FF browser
- Go to Google.com site
- Perform search with "Calabash training in Hyderabad"
- Count number of pages in which most relevant results are displayed*/

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglePages2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Calabash training in Hyderabad");
		driver.findElement(By.name("btnG")).click();
		
		Thread.sleep(2000);
		
		int pagesCount = 1;
		
		List<WebElement> results =driver.findElements(By.className("g")); 
		int resultsCount = results.size();
		
		List<WebElement> list =  driver.findElements(By.linkText("Next"));
			
		while(list.size()!=0){
			pagesCount++;
			list.get(0).click();
			Thread.sleep(2000);
			results =driver.findElements(By.className("g")); 
			resultsCount = resultsCount+results.size();
			list =  driver.findElements(By.linkText("Next"));
		}
			
		System.out.println(pagesCount);
		System.out.println(resultsCount);
		driver.close();		
	}
}










