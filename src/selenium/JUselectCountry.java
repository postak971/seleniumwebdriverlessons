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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JUselectCountry {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseURL = "https://www.farandhigh.com/";
		

	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		driver.findElement(By.xpath("//ul[@class='uk-nav uk-nav-navbar']/li[1]")).click();
				
		//WebDriverWait wait = new WebDriverWait(driver,15);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='uk-nav uk-nav-navbar']/li/a")));
		//List<WebElement> countries = driver.findElements(By.xpath("//ul[@class='uk-nav uk-nav-navbar']/li/a"));
		//Select sel = new Select(countries);
		
		//for(int i = 0; i < countries.size(); i++) {
			//String countryName = countries.get(i).getText();
			//System.out.println(countryName);
			//countries.get(i).click();
			//driver.getCurrentUrl();
			//Thread.sleep(3000);
			//driver.navigate().back();
			
		//}
		
		

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();

	}

}
