package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown_Selection 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Example:--> verify dropdown allow multiple option selection.
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag);
		
		/*
		 * isMultple:--> method is boolean return type it return only true/false..
		 * 		=> When method return true it means dropdown allow multiple option selection
		 * 		=> When method return false it means dropdown allow single option as selection.
		 * 		
		 */
		
		
		//Using javascript convert single option selection dropdown to multiple option selection dropdown.
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
