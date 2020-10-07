package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(2000);		
		
		driver.switchTo().frame("singleframe");
		System.out.println("The title of the frame is: " + driver.getTitle());
		
		WebElement textBox = driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
		
		textBox.sendKeys("How are you?");
		Thread.sleep(2000);
		textBox.clear();		
		
		//returning to the main window
		
		driver.switchTo().defaultContent();
		System.out.println("The tile of the main window is: " + driver.getTitle());
		
		
		driver.close();

	}

}
