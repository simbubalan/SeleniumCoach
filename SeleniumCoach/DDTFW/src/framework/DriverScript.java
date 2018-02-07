package framework;

import tests.GmailTest;
import utils.ExcelUtils;

public class DriverScript {
		
	public static void main(String[] args) throws Exception {
		
		String filePath = "E:\\Projects\\workspaceJan930\\DDTFW\\src\\excel\\GmailLoginData.xlsx";
		String sheetName = "Credentials";
		
		ExcelUtils.setExcelFile(filePath, sheetName);
		int nr = ExcelUtils.getRowCount(sheetName);
		System.out.println(nr);
		int nc = ExcelUtils.getColumnCount(sheetName);
		System.out.println(nc);
		String userName = null;
		String password = null;
		boolean testResult = false;
		for(int i=1; i<nr; i++){
			userName = ExcelUtils.getCellData(i, 0);
			password = ExcelUtils.getCellData(i, 1);
			System.out.println(userName+"***"+password);
			
			GmailTest.openBrowser();
			GmailTest.goToURL();
			testResult = GmailTest.enterCredentials(userName, password);
			if(testResult==true)
				ExcelUtils.setCellData(filePath, "Pass", i, 2);
			else
				ExcelUtils.setCellData(filePath, "Fail", i, 2);
			
			GmailTest.closeBrowser();
			
		}		
		
	}
}
