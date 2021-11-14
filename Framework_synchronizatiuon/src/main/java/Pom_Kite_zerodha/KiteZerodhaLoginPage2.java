package Pom_Kite_zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZerodhaLoginPage2 {


	
	@FindBy(xpath = "//input[@id='pin']")
	WebElement pin;
	

	
	@FindBy(xpath = "//button[text()='Continue ']")
	WebElement continueButton;
	
	
	
	public KiteZerodhaLoginPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	
	
	
	
	public void sendKiteLoginPagePin(String userPin) {
		pin.sendKeys(userPin);
	}
	
	public void clickKiteLoginPageContinue() {
		continueButton.click();
	}
	
}
