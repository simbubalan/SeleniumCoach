package pages;

import org.openqa.selenium.By;

public class InboxPage extends BasePage{
	
	By compose = By.xpath("//div[text()='COMPOSE']");
	By profileLink = By.xpath("//*[@class='gb_9a gbii']");
	By logout = By.id("gb_71");
	By recipient = By.xpath("//*[@id=':md']"); 
	By subject = By.name("subjectbox");
	By body = By.xpath("//*[@id=':n5']");
	By sendBtn = By.xpath("//*[@id=':lt']");
	
	public void sendMail(){
		driver.findElement(compose).click();
		driver.findElement(recipient).sendKeys("venkat.mindq@gmail.com");
		driver.findElement(subject).sendKeys("Test Mail");
		driver.findElement(body).sendKeys("venkat.mindq@gmail.com");
		driver.findElement(sendBtn).click();		
	}
	
	public void doLogout(){
		driver.findElement(profileLink).click();
		driver.findElement(logout).click();
	}
	
	
	
	
	

}
