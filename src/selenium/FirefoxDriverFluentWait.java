package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirefoxDriverFluentWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","c:\\Users\\posta\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//*************************Using fluent wait***********************
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("User defined time out message after 10 seconds.")
				.ignoring(NoSuchElementException.class);
        //Explicit Wait
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		String baseURL = "https://www.hotmail.com";
		driver.get(baseURL);

		driver.findElement(By.xpath("//nav[@class='auxiliary-actions']//a[@class='internal sign-in-link'][contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='i0116']")).clear();
		driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("postak_shrestha@hotmail.com");
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='idSIButton9' and @value='Sign in']")));
		element.click();

		Thread.sleep(2000);
		driver.close();

	}

}
