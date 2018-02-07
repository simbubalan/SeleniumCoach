package test;

import org.testng.annotations.Test;

import pages.InboxPage;

public class SendMailTC {
	
	public InboxPage page3;
			
	/*@Test(priority=1)
	public void sendEmail(){
		page3 = new InboxPage();
		page3.sendMail();
	}*/
	@Test
	public void logOut(){
		page3 = new InboxPage();
		page3.doLogout();
	}
}
