package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClickTheLinkInListAndNavigateBack {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String baseURL = "https://www.wikipedia.org/";

		driver.get(baseURL);
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='central-featured']/div/a")); 
		System.out.println("The size of the list is: " + links.size());

		// Loop through links, click on each link, navigate back, reload the link and
		// continue.

		for (int i = 0; i < links.size(); ++i) {
			links.get(i).click();
			driver.navigate().back();
			// reloading the list or there will be stale-element exception
			links = driver.findElements(By.xpath("//div[@class='central-featured']/div/a"));

		}
		// print the link text and href values

		for (int i = 0; i < links.size(); ++i) {
			System.out.print(links.get(i).getText() + "--> " + links.get(i).getAttribute("href"));
		}

		driver.close();

	}

}
