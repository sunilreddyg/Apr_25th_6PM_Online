package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElement_PresentedAt_pageSource {

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
		
		
		//Capture entire page source of current window
		String Runtime_pagesource=driver.getPageSource();
		
		
		//Verify any expected source avaialble at rutime pageSource
		String exp_source="q";
		
		//Write decision statement to execute only expected source presented
		if(Runtime_pagesource.contains(exp_source))
		{
			WebElement Search_Editbox=driver.findElement(By.id("q"));
			Search_Editbox.clear();
			Search_Editbox.sendKeys("Automated");
		}
		else
		{
			System.out.println("Expected element not presented at source");
		}
		
		
		

	}

}
