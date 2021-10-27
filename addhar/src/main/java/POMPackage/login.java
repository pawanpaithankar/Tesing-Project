package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	
@FindBy (xpath = "//input[@class='_2IX_2- VJZDxU']")
	
	private WebElement emailid;
	
	
@FindBy (xpath ="//input[@type='password']")
	
	private WebElement password;
	

@FindBy (xpath ="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")

private WebElement login;




public login (WebDriver driver1) {
	
	
PageFactory.initElements(driver1, this);


}
	
public void logpnPage() {
	//log.click();
	emailid.sendKeys("8208117809");
	password.sendKeys("pawan@123");
	login.click();
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
