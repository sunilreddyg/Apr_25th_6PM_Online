package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Accept_Maximum_Selection {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Testcase:--> Verify state dropdown allowed max selection of options  3..
		 */
		

		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		//Using javascript convert single option selection dropdown to multiple option selection dropdown.
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag);
		
		
		//Write decision statement to accept on valid condition..
		if(flag==true)
		{
			Select StateDropdown=new Select(driver.findElement(By.id("customState")));
			StateDropdown.deselectAll();   //Only Deselect possible on multiple selection type
			StateDropdown.selectByIndex(3);
			StateDropdown.selectByIndex(6);
			StateDropdown.selectByIndex(9);
			
			//Get ALL selected options count
			int SelectionCount=StateDropdown.getAllSelectedOptions().size();
			//Write Nested if conditon to verify dropdown selection match with maximum selection
			if(SelectionCount == 3)
			{
				System.out.println("As expected dropdown allowed maxmimum selection");
			}
			else
			{
				System.out.println("Test fail drodown fail to accept maximum option");
			}
			
			
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type..");
		}
		
		
		
		
		
		
		
}

}
