package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLcellwise {

	public static void main(String[] args) {
	
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Desktop\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> listofrow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		int rowcount= listofrow.size();
		
		System.out.println("rowcount"+rowcount);
		
		for(int i=0; i<rowcount; i++)
		{
		
		List<WebElement>listcell=(List<WebElement>) listofrow.get(i).findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
		
		int cellcount= listcell.size();
		
		System.out.println("cellcount"+cellcount);
		
		
		for(int j=0;  j<cellcount; j++) {
	
		String value=listcell.get(j).getText();
		System.out.println(value);
	}

}
}
}
