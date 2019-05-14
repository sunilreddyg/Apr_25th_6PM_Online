package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection {

	public static void main(String[] args) throws Exception 
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		//Select State Dropdown selection with visible option name
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Delhi");
		
		Thread.sleep(5000); //Timeout to load cities
		//Select City dropdown selection with Option value Property.
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("new-delhi");
		
		
		//Type area name at locality editbox
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Gandhi nagar");
		
		//Select Radius dropdown with index number
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(3);
		
		
		//Selecting brach checkbox  [Checkbox selection]
		driver.findElement(By.id("amenity_category_order_types49")).click();
		
		
		//Select  Banking services  [Checkbox selection]
		driver.findElement(By.id("amenity_service_types52")).click();
		
		
		//Identify search button using xpath locator  [Button]
		driver.findElement(By.xpath("//input[@value='SEARCH']")).click();
		
		
		
		

	}

}
