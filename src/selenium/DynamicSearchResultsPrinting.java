package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicSearchResultsPrinting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 15);

		driver.get("https://www.hostelworld.com/");

		//WebElement element = driver.findElement(By.xpath("//input[@id='location-text-input-field']"));

		WebElement element = driver.findElement(By.xpath("//input[@id='location-text-input-field']"));
		Thread.sleep(2000);
		element.sendKeys("London");
		
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search-input-field']")));

		//element.sendKeys("London");

		//List<WebElement> resultList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='predicted-search-results']/descendant::div")));

		List<WebElement> resultList = driver.findElements(By.xpath("//ul[@id='predicted-search-results']/descendant::div"));
		//Thread.sleep(2000);
		
		System.out.println("List size: " + resultList.size());

		for(int i = 0; i < resultList.size(); i++) {

			System.out.println(resultList.get(i).getText());
						
			//resultList.get(i).click();
			//driver.navigate().back();
			
		}
		
		driver.close();

	}

}
