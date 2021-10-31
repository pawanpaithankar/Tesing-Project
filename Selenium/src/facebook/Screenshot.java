package facebook;


import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar\\Desktop\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		LocalDateTime d= LocalDateTime.now();
		System.out.println(d);
		String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		
		  
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		
		File dest = new File ("E:\\pawan\\image"+FileName+".jpg");
		FileHandler.copy(source, dest);
	
		

	}
	

}
