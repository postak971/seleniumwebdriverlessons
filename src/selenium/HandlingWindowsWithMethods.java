
package selenium;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsWithMethods {
	
	static WebDriver driver;  //Global variable driver so that it can be called in multiple methods.

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Windows.html");
		System.out.println("The title of the main windows: " + driver.getTitle());

		WebElement tabbedWindowButton = driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"));
		tabbedWindowButton.click();
		
		SwichToWindow(2);	
		System.out.println("The title of the child window: " + driver.getTitle());
		

		SwichToWindow(1);
		System.out.println("The title of the main window: " + driver.getTitle());
		
		driver.close();
		driver.quit();
		
		
	}
	public static void SwichToWindow(int index) throws InterruptedException {		

		/*
		 * Set<String> windowHandles = driver.getWindowHandles(); 
		 * Iterator<String> it = windowHandles.iterator();
		 * 
		 * String mainWindow = it.next(); 
		 * String childWindow = it.next();
		 * 
		 * driver.switchTo().window(childWindow);
		 */
		String windowHandle = null;

		Set<String> windowHandles = driver.getWindowHandles(); 
		Iterator<String> it = windowHandles.iterator();

		for(int i = 1; i <= index ; i++) {
			windowHandle = it.next();						
		}
		driver.switchTo().window(windowHandle);			

	}

}
