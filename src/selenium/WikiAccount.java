package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\posta\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String baseURL = "https://en.wikipedia.org/wiki/Wikipedia";

		driver.get(baseURL);

		Thread.sleep(2000);
		driver.findElement(By.linkText("Create account")).click();

		//Creating the web-element for the userName field.

		WebElement userName = driver.findElement(By.xpath("//input[@id='wpName2']"));
		Thread.sleep(2000);

		System.out.println("Username texbox displayed? " + userName.isDisplayed()); // Verify if the Username textbox displayed?
		System.out.println("Username textbox enabled? " + userName.isEnabled());//Verify if the Username textbox is enabled
		userName.sendKeys("Shrestha2020");; //Enter the username.

		Thread.sleep(2000);

		//Creating the web-element for the password textbox.

		WebElement passWord = driver.findElement(By.id("wpPassword2"));
		//driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("Shrestha22");

		System.out.println("Password textbox is displayed? " + passWord.isDisplayed()); //Verify the password textbox is visible.
		System.out.println("Password textbox is enabled ? "+ passWord.isEnabled()); //Verify the password textbox is enabled.
		passWord.sendKeys("Letmein2020@"); // Enter the password 

		Thread.sleep(3000);
		//Create WebElement for re-enter password text box
		WebElement confirmPW = driver.findElement(By.id("wpRetype"));

		System.out.println("Confirm password textbox displayed? " +confirmPW.isDisplayed()); //Verify the Confirm Password textbox is visible.
		System.out.println(" Confirm password textbox enabled? " + confirmPW.isEnabled()); //Verify the Confirm Password textbox is enabled.
		confirmPW.sendKeys("Letmein2020@"); // Retype the password in Confirm Password field

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //wait time added to manually enter the captcha value.

		Thread.sleep(12000);

		//Submitting the form

		WebElement create = driver.findElement(By.xpath("//button[@id='wpCreateaccount']"));
		System.out.println("The create account button is displayed? " + create.isDisplayed());
		System.out.println("The create account button is enabled? " + create.isEnabled());
		create.click();
		
		Thread.sleep(3000);

		driver.close();


	}

}
