package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sroll_UP_down {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Add Class']"));
		
		

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		/*js.executeScript("window.scrollBy(0,800)"); //scroll down
		js.executeScript("window.scrollBy(0,-500)");// scroll up
		js.executeScript("window.scrollBy(500,0)"); // scroll right
		js.executeScript("window.scrollBy(-500,0)"); // scroll left	*/	
	}

}
