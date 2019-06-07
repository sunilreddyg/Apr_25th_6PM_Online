package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame 
{

	public static void main(String[] args) 
	{
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		//Switch to window using Frame ID/Name property
		driver.switchTo().frame("modal_window");
		
		
		//IDentify email editbox under frame.
		WebElement Email_EB=driver.findElement(By.id("email"));
		Email_EB.clear();
		Email_EB.sendKeys("qadarshan@gmail.com");
		
		
		//IDentify TripID editbox under frame
		WebElement TripID=driver.findElement(By.id("tripidSecond"));
		TripID.clear();
		TripID.sendKeys("9809808");
		
		
		//Switch Controls back to main page
		driver.switchTo().defaultContent();
		
		
		//Identify link under Page
		WebElement Trains_Link=driver.findElement(By.linkText("Trains"));
		Trains_Link.click();
		
		
		
		

	}

}
