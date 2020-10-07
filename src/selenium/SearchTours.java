package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchTours {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.farandhigh.com/");
			
			
			//WebElement countries = driver.findElement(By.id("country_id"));
			//Select select = new Select(countries);
			//select.selectByValue("hi"); 
			//select.selectByIndex(2); //selects by index 2.			
			//List<WebElement> countryList = select.getOptions(); //Get's all the languages and puts in the list.
			//System.out.println("The size of the list is: " + countryList.size());
			
			List<WebElement> countryList = driver.findElements(By.xpath("//select[@id='country_id']/descendant::*"));
			System.out.println("The size of the list is: " + countryList.size());
					
			
			for(int i = 1; i < countryList.size(); i++) {
				//WebDriverWait wait = new WebDriverWait(driver,10);
				//wait.until(ExpectedConditions.visibilityOfAllElements(countryList));
				countryList.get(i).click();
				driver.findElement(By.xpath("//input[@id='btn-toursearch']")).click();
				Thread.sleep(3000);
				driver.navigate().back();
				continue;
				
			}			
			driver.close();	
		}
	}


