package selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllTheLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String baseURL = "https://www.wikipedia.org/";
		
		driver.get(baseURL);		
	
		List<WebElement> links = driver.findElements(By.tagName("a")); //Get's all the links
		System.out.println("The size of the list is: " + links.size());
		
		//Print all the links and the attribute names.
		
		for(int i = 0; i < links.size(); i++) {
			String linkText = links.get(i).getText();
			System.out.println(linkText + links.get(i).getAttribute("href"));			
			
		}
		
		driver.close();
	
		
		

	}

}
