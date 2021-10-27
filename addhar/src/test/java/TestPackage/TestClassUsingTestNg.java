package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.Base;
import POMPackage.login;



public class TestClassUsingTestNg extends Base {
	
	
	private WebDriver driver;
	
	private login log;
	
	
	@BeforeTest
	@Parameters ("browser")
	public void beforeTest(String browser) {
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver =  OpenchromeBrowser();
		}
		if(browser.equalsIgnoreCase("Firefox"))
			
		{
			driver = OpenFirefoxBrowser();
		}
	}
	 
	@BeforeClass
	public void beforeclass(){
		
	/*	driver= new ChromeDriver();
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Desktop\\chromedriver.exe");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");*/
		
		log =new login(driver);
		
	}
		 
		 
		
		 
		 @Test
		 public void testC(){
			 log.logpnPage();
		 } 
			
	
	
	
	
	
	
	
	
	
	
	

}
