/*WAP using Java & SWD for below scenario:
- Open FF browser
- Go to Google.com site
- Perform search with "Calabash training in Hyderabad"
- Count number of pages in which most relevant results are displayed*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglePages3 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter number of strings: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		System.out.println("Enter values: ");
		
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<n; i++){
			list.add(s.nextLine());
		}
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		for(int i=0; i<list.size(); i++){
			count(list.get(i));
		}
		
		driver.close();	
		
	}
	
	public static void count(String searchTerm) throws Exception{
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys(searchTerm);
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
			
		System.out.println(searchTerm+"->"+pagesCount+"->"+resultsCount);
		
	}
}










