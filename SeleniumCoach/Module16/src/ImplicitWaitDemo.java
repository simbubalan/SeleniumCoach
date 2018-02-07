//WAP using Java and SWD for below scenario:
//Open FF browser
//go to calculator.net app
//go to income tax page
//Select "Married Filing Separately" from drop down
//Set Tax year = 2017
//Set income value = 100000$
//Calculate tax Owe/Refund amount

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.calculator.net/");
		
		driver.findElement(By.linkText("Income Tax")).click();
		//Thread.sleep(2000);
		WebElement dropDownElement = driver.findElement(By.name("cfilestatus"));
		Select s = new Select(dropDownElement);
		s.selectByVisibleText("Married Filing Separately");
		
		driver.findElement(By.id("ctaxyearb")).click();
		
		WebElement incomeField = driver.findElement(By.id("csalaryincome"));
		incomeField.clear();
		incomeField.sendKeys("100000");
		
		driver.findElement(By.xpath("//input[@value='Calculate']")).click();
		//Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//h2[@class='h2result']")).getText());
		
		driver.close();		
	}
}













