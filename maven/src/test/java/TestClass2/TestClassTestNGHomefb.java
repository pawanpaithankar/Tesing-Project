package TestClass2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BasePackage.Base;
import POMPackage.HomePage;
import POMPackage.Loginpage;
import TestUtility.Utility;


public class TestClassTestNGHomefb extends Base {
	
	private WebDriver driver;
	private HomePage homepage;
	private Loginpage log;
	
	
	int testID;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	@BeforeTest
	@Parameters ("browser")
	public void beforeTest(String browser) {
			
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		
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
	public void beforeClass() {

		 homepage = new HomePage(driver);
	}
		
	@BeforeMethod
	public void beforemethod() {
		 log = new Loginpage(driver);
		 log.loginPage();
		
	
		
		
	}
	
	@Test
	public void testA() {
		 
		testID=200;
		System.out.println("test");
		 homepage.OpenWatch();
		
		 homepage.OpenMarketplace();
		
		homepage.OpenGroups();
		
		String url = driver.getCurrentUrl();
	Assert.assertEquals(url, "https://www.facebook.com/groups/ed/");
		

		
	}

	
	
	
	
	@AfterMethod
	public void aftermethod(ITestResult result) throws IOException, InterruptedException {
		
		if(ITestResult.FAILURE == result.getStatus()) {
		
		Thread.sleep(3000);
			Utility.takeScreenshot(driver,testID);
			
		}
	
		
	}
	
	
	
	@AfterClass
	public void afterClass() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
