package testscripts;
 
import org.testng.annotations.Test;

import businessfunctions.BusinessFunctions;
import configuration.Config;
import genericutilities.ExcelDataManager;
import genericutilities.Reporter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import configuration.setup;
public class TCLOGIN{
  @Test
  public void VerifyLoginPage() throws IOException, InterruptedException {
	  
	int rcnt = setup.bankData.getRowCount();
	 for(int i=0;i<rcnt;i++){
		 setup.bankData.SetCurrentRow(i);
		 WebDriver driver = setup.BrowserSetup();
		 driver.manage().window().maximize();
		 setup.webdriver.get(Config.BANKURL);
		 Thread.sleep(3000);
		if (setup.webdriver.getTitle().equals("Guru99 Bank Home Page")){
			 Reporter.info("Guru99Bank Application launched successfully");
			 BusinessFunctions.Login(setup.bankData.GetCellData("UserName"),setup.bankData.GetCellData("Password"),driver);
			 BusinessFunctions.CreateNewCustomer(driver);
			 BusinessFunctions.CreateAccount(driver);
		 }else{
			Reporter.info("Guru99Bank Application Not launched");
		 }
		 driver.quit();
	 }
  }
  @BeforeClass
  public void beforeclass() throws IOException{
	  //Create log4j object for logging
	  DOMConfigurator.configure("log4j.xml");
	  //Initilize excel object i. e bankdata
	  setup.excelsetup();
	  //invoke object repository file using properties utilities
	  setup.objectrepositorysetup();	  
	  //Find number of rows with test case id TCLOGIN by calling Excel data manager
	  setup.bankData.Getrows("TCLOGIN");
	  
  }
}
