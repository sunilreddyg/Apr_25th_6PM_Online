package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Runtime_Element_Text {

	public static void main(String[] args) throws Exception
	{
		
		
		/*
		 * Scenario:--> Verify Email validation with invalid Email address
		 * 			Given url http://outlook.com
		 * 			And click Signin navigation button
		 * 			when user enter invalid email address
		 * 			And click next button to proceed login
		 * 			Then receive appropriate error message at webpage.
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
		Email_editbox.sendKeys("qadarshan@gmail.com");  //Entered email with wrong domain
		
		//Click Next button
		WebElement Next_btn=driver.findElement(By.xpath("//input[contains(@id,'idSIButton9')]"));
		Next_btn.click();
		Thread.sleep(5000);
		
		
		//Identify location of text
		WebElement Text_location=driver.findElement(By.id("usernameError"));
		
		// capture Element Visible text at location..
		String Error_text=Text_location.getText();
		System.out.println(Error_text);
		
		
		String Expected_text="That Microsoft account doesn't exist. Enter a different account or get a new one.";
		
		
		//Writing decision statement to accept on expected text displayed at webpage
		if(Error_text.equals(Expected_text))
		{
			System.out.println("As expected error message displayed at webpage");
		}
		else
		{
			System.out.println("Testfail expected error message not displayed at webpage");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
