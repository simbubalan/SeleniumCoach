import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static  FirefoxDriver driver;
	public static void main(String[] args) throws Exception {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://google.com";
		driver.get(url);
		
		doSearch("Selenium Test");
		
		driver.close();
	}
	
	public static void doSearch(String searchTerm) throws InterruptedException{
		driver.findElement(By.className("gsfi")).sendKeys(searchTerm);
		driver.findElement(By.name("btnG")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
	}

}
