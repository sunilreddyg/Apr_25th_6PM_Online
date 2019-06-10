package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_New_Window {

	public static void main(String[] args) 
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Current active window Dynamic ID
		String mainwindow_ID=driver.getWindowHandle();
		System.out.println(mainwindow_ID);
		
		
		
		//Identify link
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();
		
		
		//Get All window dynamic IDs, The session open throw webdriver script
		Set<String> AllwindowsIDs=driver.getWindowHandles();
		//Apply foreach loop to iterate for number of windows
		for (String Eachwindow : AllwindowsIDs) 
		{
			//Apply switch to each window
			driver.switchTo().window(Eachwindow);
			
			//Decision to accept on New window ID matches.
			if(!mainwindow_ID.equals(Eachwindow)) //!--Not
			{
				break; //Break iteration and keep window controls at new window
			}
			
		}
		
		
		
		System.out.println("Current Focused window title is => "+driver.getTitle());
		
		
	}

}
