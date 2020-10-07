package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class airFareDotCom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\posta\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.get("https://www.airfare.com/");
		//Closing the popup which is in the same window.		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'No, thanks')]"))).click();
		
		//Sending key to the departure city
		driver.findElement(By.xpath("//div[@class='col-md-3 pr-1 fixPadding']//input[@placeholder='Airport']")).sendKeys("New York");
		driver.findElement(By.xpath("//button[contains(text(),'JFK-John F Kennedy, New York, USA')]")).click();
		
		//List of all the airports from the dynamic dropdown options
		//List<WebElement> airports = driver.findElements(By.xpath("//button[@class='dropdown-item p-2 pointer']"));
		//System.out.println(airports.size());
		//Thread.sleep(5000);
		
		//for(int i = 0; i < airports.size(); i++) {
			//WebElement airport = airports.get(i);
			//if(airport.getText().contains("JFK")) {
				//airport.click();	
		//break;
				//System.out.println(airport.getText());
			
		//}
		WebElement destination = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-3 pl-1 pr-1 fixPadding']//input[@placeholder='Airport']")));
		destination.sendKeys("Chicago");
		driver.findElement(By.xpath("//button[contains(text(),'MDW-Midway, Chicago, Illinois, USA')]")).click();
	}

}
