import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailUserName {
	public static FirefoxDriver driver;
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter user name: ");
		String userName = s.nextLine();
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		
		isValidUserName(userName);
		
		driver.close();
				
	}
	
	public static void isValidUserName(String uname) throws Exception{
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		try{
			WebElement passwordField = driver.findElement(By.name("Passwd"));
			System.out.println(uname+" is Valid user name");
			
		}catch(Exception e){
			System.out.println(uname+" is invalid user name");
		}
	}
	

}
