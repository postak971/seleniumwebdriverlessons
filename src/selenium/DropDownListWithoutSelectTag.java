package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListWithoutSelectTag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String baseURL = "https://www.wikipedia.org/";
		
		driver.get(baseURL);
		
		//Select individual element from the language dropdown list
		
		/*
		 * WebElement language = driver.findElement(By.id("searchLanguage")); Select
		 * select = new Select(language); select.selectByValue("hi");
		 * select.selectByIndex(2); //selects by index 2.
		 */		
		List<WebElement> languageList = driver.findElements(By.xpath("//select[@id='searchLanguage']/option")); //Get's all the languages and puts in the list.
		System.out.println("The size of the list is: " + languageList.size());
		
		//Print the list of languages,
		
		for(int i = 0; i < languageList.size(); i++) {
			String lang = languageList.get(i).getText();
			System.out.print(lang + ", ");
		}
		
		driver.close();
	
		
		

	}

}
