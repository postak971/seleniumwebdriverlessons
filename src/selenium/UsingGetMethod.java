package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		String baseURL = "https://learn.letskodeit.com/";
		
		driver.get(baseURL);
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://learn.letskodeit.com/p/practice");
		driver.navigate().back();
		//driver.navigate().forward();
		
		//driver.quit();
		
		

	}

}
