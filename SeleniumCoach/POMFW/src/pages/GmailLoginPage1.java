package pages;

import org.openqa.selenium.By;

public class GmailLoginPage1 extends BasePage{
	
	By username = By.id("Email");
	By nextBtn = By.xpath("//input[@id='next']");
	
	
	public void enterUserName(String data){
		//String pageURL = driver.getCurrentUrl();
		try {
			//if(pageURL.equalsIgnoreCase("https://www.google.com/gmail/about/"))
				driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		driver.findElement(username).sendKeys(data);
	}
	
	public void clkNxtBtn(){
		driver.findElement(nextBtn).click();
	}
	
	
}
