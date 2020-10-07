package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseURL;
		baseURL = "https://outlook.live.com/owa/?nlp=1";
		
		driver.get(baseURL);
		
		Thread.sleep(2000);
		
		WebElement signin = driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		System.out.println("The signin button displayed:" + signin.isDisplayed());
		System.out.println("The signin button enbaled: " + signin.isEnabled());
		signin.click();
		Thread.sleep(2000);
		
		String error =  driver.findElement(By.xpath("//div[@id='usernameError']")).getText();
		
		System.out.println("The error message displayed: " + error);
		
		driver.close();
		
		

	}

}
