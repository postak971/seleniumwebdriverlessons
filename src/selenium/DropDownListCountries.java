package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListCountries {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String baseURL = "http://www.way2automation.com/angularjs-protractor/banking/#/manager/openAccount";
		
		driver.get(baseURL);
		
		//Select individual element from the language dropdown list
		
		WebElement customer = driver.findElement(By.cssSelector("#userSelect"));
		Select select = new Select(customer);
		//select.selectByIndex(2);// select value by index
		
		
		  List<WebElement> customerList = select.getOptions(); //Get's all the customers and puts in the list.
		  System.out.println("The size of the list is: " + customerList.size());
		 
		  
		  //Print the list of languages,
		  
		  for(int i = 0; i < customerList.size(); i++) { 
		String customer1 = customerList.get(i).getText(); 
		  System.out.print(customer1 + ", "); }
		  
		  driver.close();
		 
		
		

	}

}
