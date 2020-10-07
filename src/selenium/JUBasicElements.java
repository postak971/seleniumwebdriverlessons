package selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUBasicElements {
	WebDriver driver;
	String baseURL;



	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\posta\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "https://learn.letskodeit.com/";
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}



	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user_email']")).clear();

	}
	@After
	public void tearDown() throws Exception {
		driver.quit();

	}
}
