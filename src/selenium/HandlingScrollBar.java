package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingScrollBar {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\posta\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//clicking on the departure date field.
		
		//scrolls the page down by 2000 pixels.
		
		js.executeScript("window.scrollBy(0,2000)");
		
		//scrolls down to the page until the email field is viewable.
		
		WebElement element = driver.findElement(By.id("philadelphia-field-email"));
				js.executeScript("arguments[0].scrollIntoView();", element);

	}

}
