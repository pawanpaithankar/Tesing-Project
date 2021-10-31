package facebook;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WAIT {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar\\Desktop\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	// implicit wait > waiting time
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://en-gb.facebook.com/");
	// Explicit wait = waiting time + condition
	//WebDriverWait wait =new WebDriverWait(driver,20);
	
	//WebElement create=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Create New Account']")));	
	
	//WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	
	
	}
}
