package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

@FindBy (xpath = "//input[@type='text']")
	
	private WebElement emailid;
	
	
@FindBy (xpath ="//input[@type='password']")
	
	private WebElement password;
	

@FindBy (xpath ="//button[@value='1']")

private WebElement login;


public Loginpage(WebDriver driver1) {
	
	
PageFactory.initElements(driver1, this);


}

	public void sendemailid() {
		
		emailid.sendKeys("pawanpaithankar20@gmail.com");
	}
	
	public void sendpassword() {
		
		password.sendKeys("sutar@123");
	}
	
	public void sendclickonlogin() {
		login.click();
	}
	
	public void loginPage() {
		emailid.sendKeys("pawanpaithankar20@gmail.com");
		password.sendKeys("sutar@123");
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
