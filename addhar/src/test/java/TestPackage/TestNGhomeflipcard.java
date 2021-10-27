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
import POMPackage.HomePage;
import POMPackage.login;



public class TestNGhomeflipcard extends Base {

	

	private WebDriver driver;
	
	private login log;
	private HomePage home;

	
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
			
		log =new login(driver);
		home = new HomePage(driver);
		

	}
	 
/*	@Test
	 public void testB() {	

	log.logpnPage();
	home.electronic(driver);
	
	 
	
	 }*/
	
	
	
	@Test
	 public void testB() {	

	log.logpnPage();
	home.electronic(driver);
	
	
	 
	
	 }
	 
	 @AfterClass
	 public void afteclass() {
		//driver.close();
	
	 }
	 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
