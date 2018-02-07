import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSearch {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//Point p = new Point(100, 100);
		//driver.manage().window().setPosition(p);

		//Dimension d = new Dimension(500, 400);
		//driver.manage().window().setSize(d);
		
		driver.get("http://yahoo.com");
		
		WebElement searchBox = driver.findElement(By.id("UHSearchBox"));
		searchBox.sendKeys("selenium");
		
//		WebElement searchBtn = driver.findElement(By.id("UHSearchWeb"));
//		searchBtn.click();
		driver.findElement(By.id("UHSearchWeb")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		
		String pageTitle = driver.getTitle();
		
		String expected = "selenium".toLowerCase();
		String actual = pageTitle.toLowerCase();
		
		if(actual.contains(expected))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.close();
		
		
	}

}
