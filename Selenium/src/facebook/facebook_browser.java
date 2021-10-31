package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebook_browser {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement loginbutton = driver.findElement(By.xpath("/button[text()='Log In']"));
	       String text= loginbutton.getText();
	       
	       if(text.equals("Log In"))
	       {
	    	   System.out.println("text is verified");
	       }
	       else
	       {
	    	   System.out.println("text is wrong");
	       }

		//WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	//	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		//WebElement login= driver.findElement(By.xpath("//button[@value='1']")); 
		//email.sendKeys("pawanpaithankar20@gmail.com");
		//pass.sendKeys("sutar@123");
		//login.click();
		

	//	WebElement cheackbox = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	//	cheackbox.click();
	//	Thread.sleep(3000);
		
	//	WebElement select = driver.findElement(By.xpath("//input[@value='-1']"));
		
		//select.click();
		 
		 
		 
		
		 

		
		
		
		
	}
	
	
	
	
	

}
