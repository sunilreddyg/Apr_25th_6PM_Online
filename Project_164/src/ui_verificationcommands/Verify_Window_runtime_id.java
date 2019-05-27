package ui_verificationcommands;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Window_runtime_id 
{

	public static void main(String[] args)
	{
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("https://www.seleniumhq.org");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		
		//Get Runtime Dynamic ID
		String DynamicID=driver.getWindowHandle();
		System.out.println(DynamicID);
		
		
		
		//Get All Runtime window ID's
		Set<String> AllWIndowIDs=driver.getWindowHandles();
		
	}

}
