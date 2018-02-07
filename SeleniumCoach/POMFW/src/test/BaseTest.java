package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import pages.BasePage;

public class BaseTest {
	public BasePage obj;
	
	@Parameters("browser")
	@BeforeTest
	public void setUP(String browserType) throws Exception{
		obj = new BasePage();
		obj.openBrowser(browserType);
	}
	
	@AfterTest
	public void tearDown() throws Exception{
		obj.closeBrowser();
	}
}
