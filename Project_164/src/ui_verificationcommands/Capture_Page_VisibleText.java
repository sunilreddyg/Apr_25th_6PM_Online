package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Page_VisibleText {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:--> Verify Email validation with invalid Email address
		 * 			Given url http://outlook.com
		 * 			And click Signin navigation button
		 * 			when user enter valid email address
		 * 			And click next button to proceed login
		 * 			Then navigate to password entry page.
		 * 			
		 */
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("https://www.outlook.com");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		
		//Identify Signin Button
		WebElement SignIn_Nav_btn=driver.findElement(By.xpath("//a[@class='linkButtonSigninHeader'][contains(.,'Sign in')]"));
		SignIn_Nav_btn.click();
		
		
		//Identify email 
		WebElement Email_editbox=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email_editbox.clear();
		Email_editbox.sendKeys("sunilreddy.gajjala@outlook.com");  //Entered valid email
		
		//Click Next button
		WebElement Next_btn=driver.findElement(By.xpath("//input[contains(@id,'idSIButton9')]"));
		Next_btn.click();
		Thread.sleep(5000);
		
		
		
		//Target page using BODY tag..
		WebElement Webpage=driver.findElement(By.tagName("body"));
		//Capture visible text on webpage
		String Page_Visible_text=Webpage.getText();
		//System.out.println(Page_Visible_text);
		
		
		//Writing decision to accept on expected text visible at webpage
		if(Page_Visible_text.contains("Enter password"))
		{
			System.out.println("As expected text visible at webpage");
			
		}
		else
		{
			System.out.println("Testfail , Password page not navigated");
		}
		
		
		
		
		

	}

}
