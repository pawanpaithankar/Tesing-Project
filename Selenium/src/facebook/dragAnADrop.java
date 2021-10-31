package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAnADrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(source, target).build().perform();
		
		

	}

}
