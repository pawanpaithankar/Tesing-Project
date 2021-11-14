package Pom_Kite_zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZerodhaLoginPage1 {

	@FindBy(xpath = "//input[@id='userid']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	

	@FindBy(xpath = "//button[text()='Login ']")
	WebElement loginButton;
	

	public KiteZerodhaLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
	public void sendKiteLoginPageUsername(String username) {
		userName.sendKeys(username);
	}
	
	public void sendKiteLoginPagePassword(String userPassword) {
		password.sendKeys(userPassword);
	}
	
	public void clickKiteLoginPageLogin() {
		loginButton.click();
	}
	

	
	
}
