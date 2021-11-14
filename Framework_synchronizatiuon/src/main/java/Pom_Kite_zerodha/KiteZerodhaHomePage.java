package Pom_Kite_zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZerodhaHomePage {
	WebDriver driver;
	
	// 1. declaration
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;

	// 2. initialization
	public KiteZerodhaHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String getKiteHomePageUserID() 
	{
		String actText = userID.getText();
		return actText;
	}

}
