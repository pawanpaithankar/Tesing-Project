package facebook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
       
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		ele.click();
		
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		
		String text = alt.getText();
		System.out.println(text);
		Thread.sleep(3000);
		alt.sendKeys("velocity");
		Thread.sleep(3000);
		alt.accept();

		
		
		
		
		
		
		
		
		
		
		
	}

}
