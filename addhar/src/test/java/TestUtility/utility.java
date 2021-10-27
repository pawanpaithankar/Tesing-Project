package TestUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
	
	
	public static String getExeldata(int row,int col) throws EncryptedDocumentException, IOException{
		
		
		
	String path = "C:\\Users\\Sagar\\Desktop\\New folder (2)\\planing.xlsx";
	
	
	FileInputStream file = new FileInputStream(path);
	
String value=WorkbookFactory.create(file).getSheet("Sheet4").getRow(row).getCell(col).getStringCellValue();
	
	
	return value;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String data= getExeldata(0,1);
		System.out.println(data);
		
	}
	
	public static void captureScreenshot(WebDriver driver) throws IOException {
		
	
			
			
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			
			
		 driver = new ChromeDriver();
			
			driver.get("https://en-gb.facebook.com/");
			
			LocalDateTime d= LocalDateTime.now();
			System.out.println(d);
			String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
			
			  
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			
			File dest = new File ("E:\\pawan\\image"+FileName+".jpg");
			FileHandler.copy(source, dest);
		
			

		}
		
	}
	
	


