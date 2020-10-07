package selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintElementsWithinBlock {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.wikipedia.org/");		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='other-projects']/div/a")); //Get's all the links
		System.out.println("The size of the list is: " + links.size()); //size list is 12.

		//Trying to click on each link and navigate back and repeat the same process until I click all 12 links.

		for(int i = 0; i < links.size(); i++) {
			String linksName = links.get(i).getText();
			//links.get(i).click();
			System.out.println(linksName);
			//driver.navigate().back();			
		}
		
		driver.close();




	}

}
