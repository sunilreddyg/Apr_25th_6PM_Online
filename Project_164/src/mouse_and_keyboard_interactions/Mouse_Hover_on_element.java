package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_on_element 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
		//Enable mouse and keyboard interaction at automation browser.
		Actions action=new Actions(driver);
		
		//Identify Products menu category option
		WebElement Products=driver.findElement(By.linkText("Products"));
		//Perform hover action
		action.moveToElement(Products).perform();
		Thread.sleep(5000);
		
		
		//Identify Sub Category Cards link
		WebElement Sub_Cards=driver.findElement(By.linkText("Cards"));
		//Perform hover action
		action.moveToElement(Sub_Cards).perform();
		Thread.sleep(5000);
		
		
		//IDentify Sub Category undet Cards Category
		WebElement Credit_Cards=driver.findElement(By.linkText("Credit Cards"));
		//Perform Click Action using mouse interactions.
		action.click(Credit_Cards).perform();
		
		

	}

}
