package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_Page_Title 
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
		
		
		//Capture Current window runtime title..
		String Runtime_title=driver.getTitle();
		System.out.println("Current window title is => "+Runtime_title);
		
		
		String exp_title="Selenium - Web Browser Automation";
		
		//Verify Runtime title matches with expected title
		boolean flag=Runtime_title.equals(exp_title);
		System.out.println("Hompage title status is => "+flag);
		
		
		
		//Writing decision statement to continue script on correct title presented
		if(flag==true)
		{
			System.out.println("Expected title presented at browser window");
			WebElement Download_Tab=driver.findElement(By.linkText("Download"));
			Download_Tab.click();
			
		}
		else
		{
			System.err.println("Wrong title presented");
		}
		
		
		
		
		
		//CLose browser window
		driver.close();
		
		
		
		
		
		
		

	}

}
