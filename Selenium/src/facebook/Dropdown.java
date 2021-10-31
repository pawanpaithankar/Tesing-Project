package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		
		WebElement cheackbox = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		cheackbox.click();
		
		Thread.sleep(3000);
	WebElement listckbox = driver.findElement(By.xpath("//select[@id='day']"));
	
	   
	Select s =new Select(listckbox );
	
	s.selectByIndex(3);
	s.selectByValue("11");
		s.selectByVisibleText("9");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}
	
	

	
	
	
}
