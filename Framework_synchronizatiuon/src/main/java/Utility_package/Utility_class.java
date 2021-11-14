package Utility_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility_class 
{
	//Author - Abhilash Bhawar
	//This method is used to Fecth the Test Data from the Excel sheet 
	// Need to Pass Two parameters ie. 1.rowIndex 2. colIndex
	 
	public static String GetTestData(int Rowindex, int Columnindex) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Sagar\\eclipse-workspace\\Framework_synchronizatiuon\\Test_data\\Test_Data.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String value = sh.getRow(Rowindex).getCell(Columnindex).getStringCellValue();
		
		return value;
		
	}
	
	//Author - Abhilash Bhawar
	//This method is used to take ScreenShote of the Failed Test cases.
	// Need to Pass two Parameters ie. WebDriver Driver & int TCID.
	public static void GetScreenShot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest =  new File("C:\\Users\\Sagar\\eclipse-workspace\\Framework_synchronizatiuon\\Screen_shot_of_failed_TC\\ScreenShot"+TCID+".jpg");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
	}
}
