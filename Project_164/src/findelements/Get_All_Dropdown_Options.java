package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_All_Dropdown_Options 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		
		//Using Select Class Identify Dropdown Location
		List<WebElement> All_options=new Select(driver.findElement
				(By.id("month"))).getOptions();
		
		//Get size of dropdown options
		int OptionCOunt=All_options.size();
		
		//Iterate for list of Option times
		for (int i = 0; i < OptionCOunt; i++)
		{
			//Using Get method target Each option 
			All_options.get(i).click();
			Thread.sleep(1000);
			
		}


		

	}

}
