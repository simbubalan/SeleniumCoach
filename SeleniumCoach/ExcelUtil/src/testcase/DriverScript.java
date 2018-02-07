package testcase;

import utils.ExcelUtils;

public class DriverScript {

	public static void main(String[] args) throws Exception {
		String filePath = "E:\\Projects\\workspaceJan930\\ExcelUtil\\src\\excel\\GmailLoginData.xlsx";
		String sheetName = "Credentials";
		
		ExcelUtils.setExcelFile(filePath, sheetName);
		int nr = ExcelUtils.getRowCount(sheetName);
		System.out.println(nr);
		int nc = ExcelUtils.getColumnCount(sheetName);
		System.out.println(nc);
		String userName = null;
		String password = null;
		
		for(int i=1; i<nr; i++){
			userName = ExcelUtils.getCellData(i, 0);
			password = ExcelUtils.getCellData(i, 1);
			ExcelUtils.setCellData(filePath, "Printed", i, 2);
			System.out.println(userName+"***"+password);
		}		
	}
}
