package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {
	
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	WebElement cheackbox = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
			cheackbox.click();
		Thread.sleep(3000);
			
		WebElement select = driver.findElement(By.xpath("//input[@value='-1']"));
			
			
		boolean result= select.isSelected();
			 
			if(result) {
				 
				 System.out.println("it is default selected");
			}
		else
			 {
			 System.out.println("it is not selected");
			 select.click();
			 
					
			 }
			 WebElement hiddenelement = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));

			boolean custom= hiddenelement.isDisplayed();
			
			
			if(custom)
			{
				System.out.println("it is present on screen");
			}
			else {
				System.out.println("it not present on screeen");
				
			}
			 WebElement loginbutton = driver.findElement(By.xpath("//label[text()='Custom']"));
			       String text= loginbutton.getText();
			       loginbutton .getText();
			       if(text.equals("Custom"))
					{
						System.out.println("text is verify");
					}
					else {
						System.out.println("itext is verify");
						
					}   
			       driver.quit();

	}

}
