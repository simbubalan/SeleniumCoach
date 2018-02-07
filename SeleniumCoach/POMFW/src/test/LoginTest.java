package test;

import org.testng.annotations.Test;

import pages.GmailLoginPage1;
import pages.GmailLoginPage2;

public class LoginTest {
	@Test
	public void doLogin(){
		
		GmailLoginPage1 page1 = new GmailLoginPage1();
		page1.enterUserName("venkat.mindq");
		page1.clkNxtBtn();
		
		GmailLoginPage2 page2 = new GmailLoginPage2();
		page2.enterPassword("Mindq@123");
		page2.clkSignInBtn();
		
	}
	
}
