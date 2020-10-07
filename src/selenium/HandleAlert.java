package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String baseURL;
		baseURL = "https://mail.rediff.com/cgi-bin/login.cgi";				
				
		driver.get(baseURL);
		Thread.sleep(2000);
		
		WebElement signin = driver.findElement(By.xpath("//input[@name='proceed']"));
		Thread.sleep(2000);
		System.out.println("Signin button displayed? " + signin.isDisplayed());
		System.out.println("Signin button enabled? " + signin.isEnabled());
		Thread.sleep(2000);
		signin.click();
		Thread.sleep(2000);
		
		/* if we have to perform any operation like press ok button, press cancel button, get the error message etc.
		we need to create an object for Alert */
		
		Alert alrt = driver.switchTo().alert();
		String msg = alrt.getText();		
		System.out.println("The alert message: " + msg);
		alrt.accept();
		
		Thread.sleep(2000);
		
			driver.close();

	}

}
