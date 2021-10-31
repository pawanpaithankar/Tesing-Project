package facebook;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		 Thread.sleep(3000);
		WebElement alerbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		alerbox.click();

		
		String mainpageAddr= driver.getWindowHandle();
		System.out.println(mainpageAddr);
		
		ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
		
	driver.switchTo().window(addr.get(1));
	driver.switchTo().frame("iframeResult");
  WebElement tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
		  tryit.click();
		  Alert alt = driver.switchTo().alert();
		  
		  String text = alt.getText();
			System.out.println(text);
			
			Thread.sleep(3000);
			alt.accept();
			

	}

}
