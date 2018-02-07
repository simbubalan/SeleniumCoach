package framework;

import actionkeys.ActionKeys;
import utils.ExcelUtils;

public class DriverClass {
	public static String testKeyword;
	public static String testObject;
	public static String testdata;
	public static boolean testResult;
	public static ActionKeys obj = new ActionKeys();

	public static void main(String[] args) throws Exception {
		String filePath = "E:\\Projects\\workspaceJan930\\ActionKeys\\src\\excel\\Sample.xlsx";
		String sheetName = "Sheet1";
		
		ExcelUtils.setExcelFile(filePath, sheetName);
		int nr = ExcelUtils.getRowCount(sheetName);
		
		for(int i=1; i<nr; i++){
			testKeyword= ExcelUtils.getCellData(i, 3);
			testObject = ExcelUtils.getCellData(i, 4);
			testdata = ExcelUtils.getCellData(i, 5);
			testResult=false;
			executeTest(testKeyword);
			if(testResult==true)
				ExcelUtils.setCellData(filePath, "Pass", i, 6);
			else
				ExcelUtils.setCellData(filePath, "Fail", i, 6);
			
		}
	}
	
	public static void executeTest(String keyword) {
		System.out.println(testKeyword);
		
		if(testKeyword.equalsIgnoreCase("openBrowser"))
			obj.openBrowser();
		else if(testKeyword.equalsIgnoreCase("goToURL"))
			obj.goToURL();
		else if(testKeyword.equalsIgnoreCase("input"))
			obj.input(testObject, testdata);
		else if(testKeyword.equalsIgnoreCase("clkBtn"))
			obj.clkBtn(testObject);
		else if(testKeyword.equalsIgnoreCase("clkLnk"))
			obj.clkLnk(testObject);
		else if(testKeyword.equalsIgnoreCase("verifyElement"))
			obj.verifyElement(testObject);
		else if(testKeyword.equalsIgnoreCase("closeBrowser"))
			obj.closeBrowser();		
	}
	

}
