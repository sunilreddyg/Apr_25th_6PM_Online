package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchTo_Multiple_Windows
{

	public static void main(String[] args) throws InterruptedException
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
	
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//Get All window dynamic IDs, The session open throw webdriver script
		Set<String> AllwindowsIDs=driver.getWindowHandles();
		//Apply foreach loop to iterate number of windows
		for (String EachwindowID : AllwindowsIDs) 
		{
			//Apply switcht to all windows using dynamic IDs
			driver.switchTo().window(EachwindowID);
			//Get Each window Title
			String Runtime_title=driver.getTitle();
			System.out.println(Runtime_title);
			
			//Decision to accept on expected window title matches
			if(Runtime_title.contains("Cancel Train Bookings"))
			{
				break; //break iteration and it keep controls at window where expected title matches.
			}
			
		}
		
		
	
		System.out.println("Current focus window title is => "+driver.getTitle());

	}

}
