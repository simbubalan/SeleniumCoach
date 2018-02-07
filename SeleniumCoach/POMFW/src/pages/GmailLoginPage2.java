package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GmailLoginPage2 extends BasePage{
	
	By password = By.id("Passwd");
	By signInBtn = By.xpath("//input[@id='signIn']");
	
	public void goToRUL(){
		driver.get("http://gmail.com");
	}
	
	public void enterPassword(String data){
		wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		driver.findElement(password).sendKeys(data);
	}
	
	public void clkSignInBtn(){
		driver.findElement(signInBtn).click();
	}
	
	
}
