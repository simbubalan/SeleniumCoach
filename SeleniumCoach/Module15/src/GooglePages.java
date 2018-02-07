import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*WAP using Java & SWD for below scenario:
- Open FF browser
- Go to Google.com site
- Perform search with "Calabash training in Hyderabad"
- Count number of pages in which most relevant results are displayed*/

public class GooglePages {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Calabash training in Hyderabad");
		driver.findElement(By.name("btnG")).click();
		
		Thread.sleep(2000);
		
		int pagesCount = 1;
		
		try{
			WebElement nxtLink = driver.findElement(By.linkText("Next"));
			
			while(nxtLink.isDisplayed()){
				pagesCount++;
				nxtLink.click();
				Thread.sleep(2000);
				nxtLink = driver.findElement(By.linkText("Next"));
			}
		}catch(Exception e){
			System.out.println("Last page is reached");
		}
		
		System.out.println(pagesCount);
		
		driver.close();		
	}
}










