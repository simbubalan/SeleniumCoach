package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingIntoExcel {

	public static Workbook wb;
	public static Sheet sh;
	public static Row row;
	public static Cell cell;
	
	public static void main(String[] args) throws Exception {
		String filePath = "E:\\Projects\\workspaceJan930\\ExcelFiles\\src\\excel\\WriteTestData.xls";
		String fileType = filePath.substring(filePath.indexOf("."));
		File f = new File(filePath);
		FileOutputStream os = new FileOutputStream(f);
		
		if(fileType.equalsIgnoreCase(".xls"))
			wb = new HSSFWorkbook();
		else if(fileType.equalsIgnoreCase(".xlsx"))
			wb = new XSSFWorkbook();
		
		sh = wb.createSheet("Name");
		row = sh.createRow(0);
		cell=row.createCell(0);
		cell.setCellValue("ABCD");
		
		for(int i=0; i<10; i++){
			sh.createRow(i).createCell(0).setCellValue("Hello"+i);
		}
		
		wb.write(os);	
		
		
	}

}














