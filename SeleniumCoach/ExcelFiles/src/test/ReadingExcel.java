package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static Workbook wb;
	public static Sheet sh;
	public static Row row;
	public static Cell cell;
	
	public static void main(String[] args) throws Exception {
		String filePath = "E:\\Projects\\workspaceJan930\\ExcelFiles\\src\\excel\\TestData.xls";
		String fileType = filePath.substring(filePath.indexOf("."));
		File f = new File(filePath);
		FileInputStream is = new FileInputStream(f);
		
		if(fileType.equalsIgnoreCase(".xls"))
			wb = new HSSFWorkbook(is);
		else if(fileType.equalsIgnoreCase(".xlsx"))
			wb = new XSSFWorkbook(is);
		
		sh = wb.getSheet("Sheet1");
		int nr = sh.getLastRowNum()+1;
		row = sh.getRow(0);
		cell=row.getCell(0);
		//System.out.println(cell.getStringCellValue());
		
		for(int i=0; i<nr; i++){
			System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
		}
		
		
		
	}

}














