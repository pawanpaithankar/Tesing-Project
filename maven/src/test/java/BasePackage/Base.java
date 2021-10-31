package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public static WebDriver OpenchromeBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Desktop\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		return driver;
		
	}

	
	public static WebDriver OpenFirefoxBrowser() {
						
			System.setProperty("webdriver.gecko.driver", "E:\\pawan\\geckodriver.exe");
			 WebDriver driver= new FirefoxDriver();		
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.manage().window().maximize();
			driver.get("https://en-gb.facebook.com/");
			return driver;
			
		}

}
