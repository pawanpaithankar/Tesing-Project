package TestClass2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POMPackage.Loginpage;



public class TestClassusingTestNGlogin {
	
	
	private WebDriver driver;
	private Loginpage logpage;

	
	@BeforeClass
	public void beforeClass() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Desktop\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		 
		// logpage = new Loginpage(driver);
		
	// homepage = new HomePage(driver);
	}
	
	
	/*@BeforeMethod
	public void beforemethod() {
		
		
	
		
		
	}*/
	
	@Test
	public void testA() {
		 logpage = new Loginpage(driver);
		 logpage.loginPage();
		
		
	}
	
		
	
	/*@AfterMethod
	public void aftermethod() {
		
		
	}*/
	
	@AfterClass
	public void afterClass() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
