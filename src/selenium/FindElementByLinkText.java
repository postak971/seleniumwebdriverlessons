package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","c:\\Users\\posta\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		String baseURL = "https://learn.letskodeit.com/";
		driver.get(baseURL);
		//driver.findElement(By.linkText("Login")).click();
		//Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Pract")).click();
		

	}

}
