package Kite_zerodha_test_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pom_Kite_zerodha.KiteZerodhaHomePage;
import Pom_Kite_zerodha.KiteZerodhaLoginPage1;
import Pom_Kite_zerodha.KiteZerodhaLoginPage2;
import Project_Base_class.Base_class;
import Utility_package.Utility_class;

public class Test2 extends Base_class
{

	KiteZerodhaLoginPage1 login1;
	KiteZerodhaLoginPage2 login2;
	KiteZerodhaHomePage home;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		Reporter.log("------open browser----------");		
		initializeChromeBrowser();
		login1 = new KiteZerodhaLoginPage1(driver);
		login2 = new KiteZerodhaLoginPage2(driver);
		home = new KiteZerodhaHomePage(driver);
	}

	@BeforeMethod
	public void loginToApplication() throws Exception
	{	
		Reporter.log("------login to app----------");
		login1.sendKiteLoginPageUsername(Utility_class.GetTestData(0, 0));
		login1.sendKiteLoginPagePassword(Utility_class.GetTestData(1,0));
		login1.clickKiteLoginPageLogin();
		login2.sendKiteLoginPagePin(Utility_class.GetTestData(2, 0));
		login2.clickKiteLoginPageContinue();
	}

	@Test
	public void verifyProfileName() throws Exception
	{
		int TCID = 100;
		Reporter.log("------running Test script----------");		
		String actUserID = home.getKiteHomePageUserID();
		String expUserID = Utility_class.GetTestData(1, 0);
		Assert.assertEquals(actUserID, expUserID,"actUserID & expUserID are diffrent");
		Utility_class.GetScreenShot(driver,TCID);
	}

	@AfterMethod
	public void logoutFromApplication()
	{
		Reporter.log("------logout from Application----------");
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException
	{	
		Reporter.log("------close browser----------");
		Thread.sleep(3000);
		driver.close();
		
		// for remove extra memory of this class while object creation
		login1=null;	
		login2=null;
		home=null;
}

}
