package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByIdAndXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		String baseURL = "http://www.newtours.demoaut.com/";
		driver.get(baseURL);
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("tutorial");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("tutorial");
		//driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
		driver.findElement(By.name("login")).click();
		
	}

}
