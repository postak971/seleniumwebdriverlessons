package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class airFareDotCom2 {

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
		
		//List of all the airports from the dynamic dropdown options
		List<WebElement> origin = driver.findElements(By.xpath("//button[@class='dropdown-item p-2 pointer']"));
		//System.out.println("There are " + airports.size() + " airport options.");
		//Thread.sleep(5000);
		
		//Printing all the airport options.
		
		for(int i = 0; i < origin.size(); i++) {
							
						
		if(origin.get(i).getText().contains("JFK")) {
			origin.get(i).click();
			break;
		}
		
		}
		driver.findElement(By.xpath("//div[@class='col-md-3 pl-1 pr-1 fixPadding']//input[@placeholder='Airport']")).sendKeys("Chicago");
				
		//List of all the airports from the dynamic dropdown options
		List<WebElement> destination = driver.findElements(By.xpath("//div[@class='col-md-3 pl-1 pr-1 fixPadding']//ul[*]"));
		
		
		for(int i = 0; i < destination.size(); i++) {
							
				
		if(destination.get(i).getText().contains("ORD")) {
			destination.get(i).click();
			break;
		}
		
		}
		//Click on the departure date field
		driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
		
		String departMonth = "Sep 2020";
		String departDate = "20";
		
		WebElement defaultMonth = driver.findElement(By.xpath("//div[@class='calendar right ng-star-inserted']/div/table/thead/tr/th[3]"));
		//System.out.println(defaultMonth.getText());
		//Click on the next button until intended departure month displays.
		while(true) {
			if(defaultMonth.getText().equals(departMonth)) {
				break;				
			}else {
			driver.findElement(By.xpath("//div[@class='md-drppicker ltr shown']//th[@class='next available ng-star-inserted']")).click();
			}		
		
		}
		//Get the list of dates in the month.
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='md-drppicker ltr shown']//tbody[@class='drp-animate']//td"));
		
		//Loop through the list to get the desired list.
		for(int i= 0; i < dates.size(); i++){
			String departureDate = dates.get(i).getText();
			if(departureDate.equals(departDate)){
				dates.get(i).click();
				break;
			}
			
		}
		
		//Click on the return date field to display the calendar
		driver.findElement(By.xpath("//input[@placeholder='Return']")).click();
		
		String returnMonth = "Oct 2020";
		String returnDate = "19";
		WebElement currentMonth = driver.findElement(By.xpath("//div[@class='md-drppicker ltr shown']//div[@class='calendar-table']//table//thead//tr//th[3]"));
		while(true) {
			if(currentMonth.getText().equals(returnMonth)) {
				break;
			}else 
			{
			driver.findElement(By.xpath("//div[@class='md-drppicker ltr shown']//th[@class='next available ng-star-inserted']")).click();	
			}
		}
		List<WebElement> returnDates = driver.findElements(By.xpath("//div[@class='md-drppicker ltr shown']//table[@class='table-condensed ng-star-inserted']//tbody//td"));
		for(int j=0; j< returnDates.size(); j++) {
			String returningDate = returnDates.get(j).getText();
			if(returningDate.equals(returnDate)) {
				returnDates.get(j).click();
				break;
			}
			
			
		}
		driver.findElement(By.xpath("//input[@class='btn btn-block search btn-danger btn-block mt-2']")).click();
	}

}
