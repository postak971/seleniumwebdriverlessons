package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopThroughCheckBoxList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL;
		baseURL = "https://ironspider.ca/forms/checkradio.htm";
		driver.get(baseURL);
		Thread.sleep(2000);

		boolean isClicked = false;
		boolean isActive = false;

		List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@type = 'radio' and contains(name, browser)]"));

		for(int i = 0; i < radioBtns.size(); i++) {
			isClicked = radioBtns.get(i).isSelected();
			isActive = radioBtns.get(i).isEnabled();
			if(!isClicked || !isActive) {
				radioBtns.get(i).click();			
			}

		}
		Thread.sleep(2000);
		driver.close();

	}

}
