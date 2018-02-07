package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.RowIdLifetime;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static Workbook wb;
	public static Sheet sh; 
	public static Row row;
	public static Cell cell;
	
	
	public static void setExcelFile(String Path, String SheetName) throws Exception {

		try {
			
			String fileType = Path.substring(Path.indexOf(".")); 
			File f = new File(Path);
			FileInputStream is = new FileInputStream(f);
			if(fileType.equals(".xls"))
				wb = new HSSFWorkbook(is);
			else if(fileType.equals(".xlsx"))
				wb = new XSSFWorkbook(is);
			
			sh=wb.getSheet(SheetName);
		} catch (Exception e){
				throw (e);
		}
	}
	
	public static int getRowCount(String sheetName){
		int index = wb.getSheetIndex(sheetName);
		sh = wb.getSheetAt(index);
		int number=sh.getLastRowNum()+1;
		
		return number;
	}

	public static int getColumnCount(String sheetName){

		sh= wb.getSheet(sheetName);
		row = sh.getRow(0);
		
		return row.getLastCellNum();

	}
	
	public static String getCellData(int RowNum, int ColNum) throws Exception{

	try{
			cell = sh.getRow(RowNum).getCell(ColNum);
			String CellData = cell.getStringCellValue();
			return CellData;

		}catch (Exception e){
				return"";
		}
	}
	
	public static void setCellData(String Path,String Result,  int RowNum, int ColNum) throws Exception	{

	try{
			row  = sh.getRow(RowNum);
			cell = row.getCell(ColNum);

			if (cell == null) {
					cell = row.createCell(ColNum);
					cell.setCellValue(Result);
			
			} else {
					//Cell = Row.createCell(ColNum+2);
					cell.setCellValue(Result);
			}

	FileOutputStream fileOut = new FileOutputStream(Path);

	wb.write(fileOut);
	fileOut.flush();
	fileOut.close();

	}catch(Exception e){
		throw (e);
			}

		}

}