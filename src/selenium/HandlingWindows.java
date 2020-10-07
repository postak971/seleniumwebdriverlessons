package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Windows.html");
		System.out.println("The title of the main window: " + driver.getTitle());

		WebElement tabbedWindowButton = driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"));
		tabbedWindowButton.click();
		
		String mainWindow=driver.getWindowHandle();	
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		
		while(it.hasNext()) {
			String childWindow = it.next();
			if(!mainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);	
				System.out.println("The title of the child window: " + driver.getTitle());
				
			}
		}
		
		
		//Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(mainWindow);
		System.out.println("The title of the main windows: " + driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
		
		driver.quit();
	}
	

}
