package facebook;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserpop {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
	WebElement alerbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));

	WebElement confirmBOx  = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
	WebElement PromptBOX  = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
	WebElement Linebreak = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
	
	alerbox.click();
	confirmBOx.click();
	PromptBOX.click();
	Linebreak.click();
	Thread.sleep(3000);
	 String mainPageAddr=driver.getWindowHandle();
	 System.out.println(mainPageAddr);
	
	 Thread.sleep(3000);
	 ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
	 
	 driver.switchTo().window(addr.get(3));
	String url =driver.getCurrentUrl();
System.out.println(url);
	 
	 
	 
	 
	 
	 
	}

}
