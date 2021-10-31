package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


	
	@FindBy (xpath = "//a[@aria-label='Marketplace'] ")
	
	private WebElement Marketplace;
	
	
@FindBy (xpath = "//a[@href='/groups/']")
	
	private WebElement Groups;
	

@FindBy (xpath ="(//div[@class='bp9cbjyn j83agx80 byvelhso l9j0dhe7'])[2]")

private WebElement Watch;




@FindBy (xpath = "//div[@aria-label='Account']")

private WebElement account;





public HomePage(WebDriver driver1) {
	
	
PageFactory.initElements(driver1, this);


}

public void OpenMarketplace() {
	
Marketplace.click();
}

public void OpenGroups() {
	
	Groups.click();
}

public void OpenWatch() {
	Watch.click();
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
