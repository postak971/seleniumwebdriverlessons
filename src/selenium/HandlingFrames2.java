package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		Thread.sleep(2000);		
		
		driver.switchTo().frame("packageListFrame");
		
		driver.findElement(By.linkText("com.thoughtworks.selenium.webdriven")).click();
		System.out.println("The title of the page " + driver.getTitle());
		
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		System.out.println("The title of the page " + driver.getTitle());
		
		driver.quit();

	}

}
