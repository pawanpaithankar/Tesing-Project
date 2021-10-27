package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class classA {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\pawan\\geckodriver.exe");		
		WebDriver driver = new FirefoxDriver();
		
		
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");

	}

}
