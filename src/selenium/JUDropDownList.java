package selenium;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JUDropDownList {
	WebDriver driver;
	String baseURL;
	

	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\posta\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		baseURL = "https://learn.letskodeit.com/p/practice";
	}	

	@Test
	public void test() {
		driver.get(baseURL);
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element); // select the	options.
		//sel.selectByValue("Benz"); Selecting by a value

		
		
		List<WebElement> carList = sel.getOptions(); //Returns all options belonging to this select tag.
		
		for(int i = 0; i < carList.size(); i++) {
			sel.selectByIndex(i); //selects each element from the drop down.
			//Printing the name of each selection.
			//String optionName = carList.get(i).getText();//gets the visible text of this element.
			//System.out.print(optionName + ", ");
			System.out.print(carList.get(i).getText() + ",");
			
		}
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
