package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	

private WebDriver driver1;
private WebDriverWait  wait;

	@FindBy (xpath ="(//div[@class='eFQ30H'])[1]")
	
	public WebElement electronic ;
	
	
	@FindBy (xpath="(//div[@class=\"_1fwVde\"]/a)[2]")
	
	public WebElement mi;
	
	

	
	
	
@FindBy (xpath="//div[@class='_28p97w']")  
	
	public WebElement account;    




	@FindBy (xpath="(//a[@class='_2kxeIr'])[10]")   
	
	public WebElement logout;                   //a[@class='_6WOcW9 _2-k99T']

	
	






	
//a[@class='_6WOcW9']
	
	public HomePage (WebDriver driver) {
		 this.driver1  = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	

	
	
	public void electronic(WebDriver driver) {
		
	
		Actions clk = new Actions(driver1);
		clk.moveToElement(electronic).build().perform();
		clk.moveToElement(mi).click().build().perform();
	
		
}
	


public void openaccount() {
	
	account.click();
	
	
	
}


public void clickonlogut() {
	
	
	logout.click();
}
	
	
	
	
	
	
	
	
	
	
	

}
