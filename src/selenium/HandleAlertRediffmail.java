package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertRediffmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		String baseURL;
		baseURL = "https://mail.rediff.com/cgi-bin/login.cgi";
		driver.get(baseURL);
		Thread.sleep(2000);
		
		WebElement signin = driver.findElement(By.xpath("//input[@name='proceed']"));
		Thread.sleep(2000);
		
		System.out.println("Signin button displayed: " + signin.isDisplayed());
		System.out.println("Signin button enabsled: " + signin.isEnabled());
		Thread.sleep(1000);
		signin.click();
		Thread.sleep(1000);
		
		Alert alrt = driver.switchTo().alert();
		Thread.sleep(1000);
		String msg = alrt.getText();
		System.out.println("The alert message: " + msg);		
		alrt.accept();		
		Thread.sleep(2000);	
		
		driver.close();

	}

}
