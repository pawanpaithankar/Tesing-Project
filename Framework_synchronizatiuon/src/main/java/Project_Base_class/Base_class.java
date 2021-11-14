package Project_Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Base_class
{

	public  static WebDriver driver;
	public static WebDriver initializeChromeBrowser()
	{
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");

System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Sagar\\eclipse-workspace\\Framework_synchronizatiuon\\Test_resources\\chromedriver.exe");
		driver = new ChromeDriver();
		 return driver;
}
	public static WebDriver initializeFireFoxBrowser()
	{
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--disable-notifications");

System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Sagar\\eclipse-workspace\\Framework_synchronizatiuon\\Test_resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
}

}
