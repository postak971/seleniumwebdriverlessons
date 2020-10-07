package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByName {

		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		String baseURL = "https://learn.letskodeit.com/";
		driver.get(baseURL);
		driver.findElement(By.xpath("//a[@href='/pages/practice']")).click();
		driver.findElement(By.xpath("//*[@name='enter-name']")).sendKeys("Postak");
			

	}

}
