package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxIndividual {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL;
		baseURL = "https://ironspider.ca/forms/checkradio.htm";
		driver.get(baseURL);
		Thread.sleep(2000);
		
		WebElement radioRed = driver.findElement(By.xpath("//form[contains(text(),'My favourite colors are:')]//input[@value='red']"));
		if(!radioRed.isSelected()) {
			radioRed.click();
			Thread.sleep(2000);
			//radioRed.clear();
		}
		driver.close();

	}

}
