package objectrepository;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


import org.openqa.selenium.By;
import genericutilities.Reporter;
import configuration.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage{
	private static WebElement element = null;
	
	public static WebElement txt_UserName(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Login.txt.UserName")));
		}catch(Exception e){
			Reporter.info("UserName TextBox not found");
			throw(e);
		}
		return element;
	}
	
	public static WebElement txt_Password(WebDriver driver){
		try{
			element = driver.findElement(By.name(setup.pro.getProperty("Login.txt.Password")));
		}catch(Exception e){
			Reporter.info("Password TextBox not found");
			throw(e);
		}
		return element;
	}
	
	public static WebElement btn_Login(WebDriver driver){
		try{
			element = driver.findElement(By.name(setup.pro.getProperty("Login.btn.Login")));
		}catch(Exception e){
			Reporter.info("Password TextBox not found");
			throw(e);
		}
		
		return element;
	}
	
	public static WebElement lnk_Logout(WebDriver driver){
		try{
			element = driver.findElement(By.linkText(setup.pro.getProperty("Home.lnk.Logout")));
		}catch(Exception e){
			Reporter.info("Logout link not found");
			throw(e);
		}
		
		return element;
	}
	
	public static WebElement txt_CustomerName(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Customer.txt.CustomerName")));
		}catch(Exception e){
			Reporter.info("CustomerName TextBox not found");
			throw(e);
		}
		return element;
	}
	
	public static WebElement Rd_Gender(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Customer.txt.Gender")));
		}catch(Exception e){
			Reporter.info("Gender TextBox not found");
			throw(e);
		}
		return element;
	}
	
	public static WebElement txt_DOB(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Customer.txt.DOB")));
		}catch(Exception e){
			Reporter.info("DOB TextBox not found");
			throw(e);
		}
		return element;
	}

	public static WebElement txt_Address(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Customer.txt.Address")));
		}catch(Exception e){
			Reporter.info("Address TextBox not found");
			throw(e);
		}
		return element;
	}

	public static WebElement txt_City(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Customer.txt.City")));
		}catch(Exception e){
			Reporter.info("City TextBox not found");
			throw(e);
		}
		return element;
	}
	
	public static WebElement txt_State(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Customer.txt.State")));
		}catch(Exception e){
			Reporter.info("State TextBox not found");
			throw(e);
		}
		return element;
	}
	
	public static WebElement txt_Pin(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Customer.txt.Pincode")));
		}catch(Exception e){
			Reporter.info("PinCode TextBox not found");
			throw(e);
		}
		return element;
	}
	
	public static WebElement txt_MobileNumber(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Customer.txt.MobileNum")));
		}catch(Exception e){
			Reporter.info("MobileNumber TextBox not found");
			throw(e);
		}
		return element;
	}	
	
	public static WebElement txt_Email(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Customer.txt.Email")));
		}catch(Exception e){
			Reporter.info("Email TextBox not found");
			throw(e);
		}
		return element;
	}
	
	
	public static WebElement txt_CustPassword(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Customer.txt.Password")));
		}catch(Exception e){
			Reporter.info("Customer Password TextBox not found");
			throw(e);
		}
		return element;
	}
	
	
	public static WebElement btn_Submit(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Customer.btn.Submit")));
		}catch(Exception e){
			Reporter.info("Submit TextBox not found");
			throw(e);
		}
		return element;
	}

	public static WebElement We_CustomerRegMsg(WebDriver driver){
		try
		{

			element = driver.findElement(By.xpath(setup.pro.getProperty("Customer.we.CustRegisterMsg")));
		}catch(Exception e){
			Reporter.info("CustRegisterMsg WebElement not found");
			throw(e);
		}
		return element;
	}

	
	public static WebElement txt_Custid(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Account.txt.Custid")));
		}catch(Exception e){
			Reporter.info("Custid TextBox not found");
			throw(e);
		}
		return element;
	}
	
	
	public static WebElement WL_Accounttype(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Account.wl.Accounttype")));
		}catch(Exception e){
			Reporter.info("Accounttype TextBox not found");
			throw(e);
		}
		return element;
	}
	
	public static WebElement Txt_intialDeposit(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Account.txt.intialDeposit")));
		}catch(Exception e){
			Reporter.info("intialDeposit TextBox not found");
			throw(e);
		}
		return element;
	}

	public static WebElement We_Customerid(WebDriver driver){
		try
		{

			element = driver.findElement(By.xpath(setup.pro.getProperty("Customer.we.Custid")));
		}catch(Exception e){
			Reporter.info("Customer id WebElement not found");
			throw(e);
		}
		return element;
	}

	public static WebElement We_AccRegMsg(WebDriver driver){
		try
		{

			element = driver.findElement(By.xpath(setup.pro.getProperty("Account.We.AccountRegMsg")));
		}catch(Exception e){
			Reporter.info("Account Registered Msg  WebElement not found");
			throw(e);
		}
		return element;
	}

	public static WebElement We_AccRegID(WebDriver driver){
		try
		{

			element = driver.findElement(By.xpath(setup.pro.getProperty("Account.We.AccountRegId")));
		}catch(Exception e){
			Reporter.info("Account Registered ID  WebElement not found");
			throw(e);
		}
		return element;
	}
	
	public static WebElement lnk_CreateCust(WebDriver driver){
		try
		{

			element = driver.findElement(By.linkText(setup.pro.getProperty("Home.lnk.NewCustomer")));
		}catch(Exception e){
			Reporter.info("Create Cutomer Link  WebElement not found");
			throw(e);
		}
		return element;
	}
	
	public static WebElement lnk_AddAccount(WebDriver driver){
		try
		{

			element = driver.findElement(By.linkText(setup.pro.getProperty("Home.lnk.NewAccount")));
		}catch(Exception e){
			Reporter.info("Add Account Link not found");
			throw(e);
		}
		return element;
	}
	
	public static WebElement btn_AccountSubmit(WebDriver driver){
		try
		{

			element = driver.findElement(By.name(setup.pro.getProperty("Account.btn.Submit")));
		}catch(Exception e){
			Reporter.info("Add Account Submit Button not found");
			throw(e);
		}
		return element;
	}
}

