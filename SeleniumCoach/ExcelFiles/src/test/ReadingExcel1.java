package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel1 {

	public static void main(String[] args) throws Exception {
		String filePath = "E:\\Projects\\workspaceJan930\\ExcelFiles\\src\\excel\\TestData.xlsx";
		File f = new File(filePath);
		
		FileInputStream is = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(is);
		XSSFSheet sh = wb.getSheetAt(0);
		XSSFRow row = sh.getRow(0);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(2).getCell(0).getStringCellValue());
		
		System.out.println(sh.getFirstRowNum());
		System.out.println(sh.getLastRowNum());
		int nr = sh.getLastRowNum()+1;
		System.out.println(nr);
		
		System.out.println(row.getFirstCellNum());//0
		System.out.println(row.getLastCellNum());//1
		int nc = row.getLastCellNum();
		System.out.println(nc);
		
		//all rows	
		for(int i=0; i<nr; i++){
			System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
		}
	}

}














