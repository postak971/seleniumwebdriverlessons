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

public class JUList {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		baseURL = "https://learn.letskodeit.com/";
		driver.get(baseURL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/pages/practice']")).click();
	}

	

	@Test
	public void test() throws InterruptedException {
		boolean isChecked = false;
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type, 'radio') and contains(@name, 'cars')]"));
		for(int i = 0; i < radioButtons.size(); i++) {
			isChecked = radioButtons.get(i).isSelected();
			
			if(!isChecked) {
				radioButtons.get(i).click();
				Thread.sleep(2000);
			}
		}
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
