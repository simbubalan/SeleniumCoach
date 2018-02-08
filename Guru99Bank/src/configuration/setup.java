package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import genericutilities.ExcelDataManager;

public class setup {
	public static Properties pro;
	public static FileInputStream fsrc;
	public static WebDriver webdriver;
	public static ExcelDataManager bankData;
	
	public static void initialize() throws IOException{
		excelsetup();
	}
	
	public static WebDriver BrowserSetup() throws IOException{
		if(bankData.GetCellData("BrowserSetup").equalsIgnoreCase("firefox")){
			webdriver = new FirefoxDriver();
			System.out.println("firefox found");
		}else if(bankData.GetCellData("BrowserSetup").equalsIgnoreCase("chrome")) {
			//chrome browser
		}else if(bankData.GetCellData("BrowserSetup").equalsIgnoreCase("chrome")){
			//ie browser
		}
		return webdriver;
	}
	
	public static void objectrepositorysetup() throws IOException{
		File src = new File("C:\\Users\\ctl-user\\workspace\\Guru99Bank\\src\\objectrepository\\Object.properties");
		fsrc = new FileInputStream(src);
		pro= new Properties();
		pro.load(fsrc);	
	}
	
	public static void excelsetup() throws IOException{
		//intialize excel file
	bankData = new ExcelDataManager(Config.TESTDATAPATH,"Sheet1");

	}
}
