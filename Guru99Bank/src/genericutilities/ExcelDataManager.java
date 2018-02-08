package genericutilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataManager {
	private XSSFSheet ExcelSheet;
	private XSSFWorkbook WorkBook;
	private XSSFCell Cell;
	private XSSFRow Row;
	private XSSFRow[] Rows;
	private int index;
	
	
	// Constructor to invoke excel file
	public ExcelDataManager(String Path,String Sheet) throws IOException{
		FileInputStream file = new FileInputStream(Path);
		Reporter.info("Imported Test Data");
		WorkBook = new XSSFWorkbook(file); 
		ExcelSheet = WorkBook.getSheet(Sheet);
	}
  
	// To get cell data based on address of cell
	public String GetCellData(int iRow,int Col){
		Row = ExcelSheet.getRow(iRow);
		Cell = Row.getCell(Col);
		return Cell.getErrorCellString();
	}
	
 //Returns the row value based on cell text
	public XSSFRow GetRow(String CellText){
		XSSFRow row = null;
		boolean Flag=false;
		int i=0;
		int rowCount = ExcelSheet.getLastRowNum();
		outerloop:
		for(i=0; i<rowCount ;i++){
			row = ExcelSheet.getRow(i);
			int colCount = row.getLastCellNum();
				for(int j=0;j<colCount;j++){
					if (row.getCell(j).getStringCellValue().equalsIgnoreCase(CellText)){
						Flag = true;
						break outerloop;
					}
				}
		}
		if(Flag=false){
			Reporter.error("No Row Found");
			return null;	
		}else{
			return ExcelSheet.getRow(i);
		}
	}
	
	// Returns Column index or Column num
	public int GetColIndex(String ColumnName){
		int j=0;
		boolean Flag = false;
		XSSFRow row = ExcelSheet.getRow(0);
		int colCount = row.getLastCellNum();
			for(j=0;j<colCount;j++){
				if (row.getCell(j).getStringCellValue().equalsIgnoreCase(ColumnName)){
					Flag= true;
					break;
				}
			}
			if(Flag=false){
				Reporter.error("No Column Found");
				return -1;	
			}else{
				return j;
			}	
	}
	
	// Function to return cell value for any Test case
	public String GetCellData(String ColumnName){
		int colNum = 0;
		colNum = GetColIndex(ColumnName);
		if (Rows.length==0 || (colNum == -1)){
			Reporter.info("No value returned for"+ColumnName);
			return null;
		}else{
			String CellValue = Row.getCell(colNum).toString();
			Reporter.info(ColumnName+" Column Vaue is "+CellValue);
			return CellValue;
		}
		
	}
	
	///Get no of rows in test data 
	public void Getrows(String TCID)
	{
		int irow = 0;
		int jcolnum= 0;
		index =0;
		String Strvalue;
		irow = ExcelSheet.getLastRowNum()+1;
		Rows = new XSSFRow[irow];
		for(int i=0;i<irow;i++){
			jcolnum = ExcelSheet.getRow(i).getLastCellNum();
			for(int j=0;j<jcolnum;j++){
				Strvalue = ExcelSheet.getRow(i).getCell(j).toString();
				if(Strvalue.equalsIgnoreCase(TCID)){
					Rows[index] = ExcelSheet.getRow(i);
					index=index+1;
				}
			}
		}
	}
	
	public void SetCurrentRow(int iRowNum){
		if (index==0){
			Reporter.error("No Data Found");
		}else{
			Row = Rows[iRowNum];
		}
		
	}
	
	public int getRowCount(){
		if (index>0){
			return index;
			
		}else{
			Reporter.error("No Data Found");
			return -1;
		}
	}
		
	}



