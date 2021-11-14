package Kite_zerodha_test_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import Pom_Kite_zerodha.KiteZerodhaHomePage;
import Pom_Kite_zerodha.KiteZerodhaLoginPage1;
import Pom_Kite_zerodha.KiteZerodhaLoginPage2;
import Pom_Kite_zerodha.KiteZerodhaLogoutPage;
import Project_Base_class.Base_class;
import Utility_package.Utility_class;


public class Test1 extends Base_class
{
	KiteZerodhaLoginPage1 Login1;
	KiteZerodhaLoginPage2 Login2;
	KiteZerodhaHomePage Home;
	KiteZerodhaLogoutPage Logout;
	int TCID;
	WebDriver driver;
	

	@BeforeClass
	@Parameters("BrowserName")
	public void openBrowser(String BrowserName) throws EncryptedDocumentException, IOException {
		Reporter.log("------open browser----------");		
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			driver = initializeChromeBrowser();
		}
		
		else if(BrowserName.equalsIgnoreCase("Firefox"))
		{
			driver = initializeFireFoxBrowser();
		}
		Login1 = new KiteZerodhaLoginPage1(driver);
		Login2 = new KiteZerodhaLoginPage2(driver);
		Home = new KiteZerodhaHomePage(driver);
	}

	@BeforeMethod
	public void loginToApplication() throws Exception
	{	
		Reporter.log("------login to app----------");
		Login1.sendKiteLoginPageUsername(Utility_class.GetTestData(0, 0));
		Login1.sendKiteLoginPagePassword(Utility_class.GetTestData(1, 0));
		Login1.clickKiteLoginPageLogin();
		Login2.sendKiteLoginPagePin(Utility_class.GetTestData(2, 0));
		Login2.clickKiteLoginPageContinue();
	}

	@Test
	public void verifyProfileName() throws Exception
	{
		TCID = 200;
		Reporter.log("------running Test script----------");		
		String actUserID = Home.getKiteHomePageUserID();
		String expUserID = Utility_class.GetTestData(1, 0);
		AssertJUnit.assertEquals(actUserID, expUserID,"actUserID & expUserID are diffrent");
	}

	@AfterMethod
	public void logoutFromApplication(ITestResult result) throws IOException
	{
		Reporter.log("------logout from Application----------");
		
		Reporter.log("------capture screenshot of only failed Test cases----------");
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Utility_class.GetScreenShot(driver, TCID);
		}	
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException
	{	
		Reporter.log("------close browser----------");
		Thread.sleep(3000);
		driver.close();
		
		Login1=null;
		Login2=null;
		Home=null;
		System.out.println("After Test");
		driver = null;
		System.gc();
	}

	


}
