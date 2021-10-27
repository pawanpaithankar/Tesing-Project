package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class abc {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\pawan\\geckodriver.exe");		
		WebDriver driver = new FirefoxDriver();
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
		System.out.println("flipcard");

	}

}
