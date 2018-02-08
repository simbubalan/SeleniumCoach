package businessfunctions;
import org.openqa.selenium.WebDriver;

import configuration.Config;
import configuration.setup;
import genericutilities.Reporter;
import objectrepository.Loginpage;

public class BusinessFunctions {
	
	public static void Login(String UserName,String Password,WebDriver driver) throws InterruptedException{
		Loginpage.txt_UserName(driver).sendKeys(UserName);
		Loginpage.txt_Password(driver).sendKeys(Password);
		Loginpage.btn_Login(driver).click();
		Thread.sleep(4000);
		if(Loginpage.lnk_Logout(driver).isDisplayed()){
			Reporter.info("Login successfully");
		}else{
			Reporter.info("Login Failed");
		}
		
	}
	
	
	public static void CreateNewCustomer(WebDriver driver) throws InterruptedException{
		Loginpage.lnk_CreateCust(driver).click();
		Loginpage.txt_CustomerName(driver).sendKeys(setup.bankData.GetCellData("NewCustName"));
		Loginpage.txt_DOB(driver).sendKeys(setup.bankData.GetCellData("CustDOB"));
		Loginpage.txt_Address(driver).sendKeys(setup.bankData.GetCellData("CustAddress"));
		Loginpage.txt_City(driver).sendKeys(setup.bankData.GetCellData("CustCity"));
		Loginpage.txt_State(driver).sendKeys(setup.bankData.GetCellData("CustState"));
		Loginpage.txt_Pin(driver).sendKeys(setup.bankData.GetCellData("CustPincode"));
		Loginpage.txt_Email(driver).sendKeys(setup.bankData.GetCellData("CustEmail"));
		Loginpage.txt_MobileNumber(driver).sendKeys(setup.bankData.GetCellData("CustPhone"));
		Loginpage.txt_CustPassword(driver).sendKeys(setup.bankData.GetCellData("CustPassword"));
		Loginpage.btn_Submit(driver).click();
		Thread.sleep(3000);
		if(Loginpage.We_CustomerRegMsg(driver).isDisplayed()){
			Reporter.info("Customer Register Sucessfully");
		}else{
			Reporter.info("Customer Not Registered");
		}
		Config.gCustomerid = Loginpage.We_Customerid(driver).getText();
		System.out.println(Config.gCustomerid);
		
		//Capature Customer name
	}
	
	
	
	public static void CreateAccount(WebDriver driver) throws InterruptedException{
		Loginpage.lnk_AddAccount(driver).click();
		Loginpage.txt_Custid(driver).sendKeys(Config.gCustomerid);
		Loginpage.Txt_intialDeposit(driver).sendKeys(setup.bankData.GetCellData("IntialDeposit"));
		Loginpage.btn_AccountSubmit(driver).click();
		Thread.sleep(3000);
		if(Loginpage.We_AccRegMsg(driver).isDisplayed()){
			String AccountID = Loginpage.We_AccRegID(driver).getText();
			Reporter.info("Account Number "+AccountID +" Generated  Sucessfully");
			
		}else{
			Reporter.info("Account Number not Generated ");
		}
		
	}
	
}