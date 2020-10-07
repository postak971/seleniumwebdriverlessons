package selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JURadioButtonsAndCheckBoxes {
	
	WebDriver driver;
	String baseURL;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		baseURL = "https://learn.letskodeit.com/";
		driver.get(baseURL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/pages/practice']")).click();
		Thread.sleep(2000);
		
	}


	@Test
	public void test() throws InterruptedException {
		WebElement bmdRadioBtn = driver.findElement(By.id("bmwradio"));
		bmdRadioBtn.click();
		Thread.sleep(2000);
		
		WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
		benzRadioBtn.click();
		
		Thread.sleep(2000);
		WebElement hondaRadioBtn = driver.findElement(By.id("hondaradio"));
		hondaRadioBtn.click();
		
		WebElement bmdCheckBox = driver.findElement(By.id("bmwcheck"));
		bmdCheckBox.click();
		Thread.sleep(2000);
		
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click();
		
		Thread.sleep(2000);
		WebElement hondaCheckBox = driver.findElement(By.id("hondacheck"));
		hondaCheckBox.click();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
