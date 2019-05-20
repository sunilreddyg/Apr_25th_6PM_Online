package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Different_Elements 
{

	public static void main(String[] args) throws InterruptedException
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("https://www.cleartrip.com/");
		//maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(5000);   //Timeout to load notification popup
		
		
		//Select roundtrip radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		
		//Identify Auto-complete editbox and type Referral keyword
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(4000);  //timeout to load suggestions
		//Select Suggestion from Displayed list
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		//Identify Auto-complete editbox and type referral keyword
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("MEL");
		Thread.sleep(4000);  //timeout to load suggestions
		//Select suggestion from displayed list
		driver.findElement(By.linkText("Melbourne, AU - Tullamarine (MEL)")).click();
		
		
		//Select Departure date from calendar--> Date picker
		driver.findElement(By.linkText("23")).click();
		Thread.sleep(3000);  //To load departure  datepicker
		
		//Type Date in Departue Editbox -->Note:--> Make sure editbox was writable.
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Tue, 6 Aug, 2019");
		
		
		//Select Dropdown using Option name
		new Select(driver.findElement(By.id("Adults")))
		.selectByVisibleText("4");
		
		
		//Click link with partial link name
		driver.findElement(By.partialLinkText("Class of travel, Airline preference")).click();
		Thread.sleep(3000);  //To load Travel preferences and Travel type 
		
		
		//Identify auto-complete editbox and type referral keyword
		driver.findElement(By.name("airline")).clear();
		driver.findElement(By.name("airline")).sendKeys("Vistara");
		Thread.sleep(5000);  //To load airline suggestion
		driver.findElement(By.linkText("Vistara (UK)")).click();
		
		
		//Click Search button 
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
		
		
		
		

	}

}
