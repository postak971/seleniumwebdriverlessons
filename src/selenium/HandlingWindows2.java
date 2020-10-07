package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.popuptest.com/goodpopups.html");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		WebElement windowOne = driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]"));
		windowOne.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator <String> it = windowHandles.iterator();
		
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		driver.manage().window().maximize();
		System.out.println("The title of the pop-up window:" + driver.getTitle());
		
		Thread.sleep(2000);
		
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='blu']")).click();
		
		
		Thread.sleep(2000);
		
		
		driver.quit();
	}

}
