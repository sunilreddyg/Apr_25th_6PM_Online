package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Run_FB_Signup
{
	
	public static void main(String args[])
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Identify @findby declared objects using automation browser..
		FB_Signup Signup=PageFactory.initElements(driver, FB_Signup.class);
		
		Signup.Firsname_EB.clear();
		Signup.Firsname_EB.sendKeys("Newuser");
		
		Signup.Surname_EB.clear();
		Signup.Surname_EB.sendKeys("WebDriver");
		
		Signup.Mobile_or_Email_EB.clear();
		Signup.Mobile_or_Email_EB.sendKeys("Newuserwebdriver@gmail.com");
		
		Signup.Retype_Mobile_or_Email_EB.clear();
		Signup.Retype_Mobile_or_Email_EB.sendKeys("NewuserWebDriver@gmail.com");
		
		Signup.Password_EB.clear();
		Signup.Password_EB.sendKeys("Hello12345");
		
		//Calling Pagefactory method to select dropdown options
		Signup.Select_All_Reg_Dropdowns();
		
		
		
		//Get typed characters at firstname editbox
		String Fname=Signup.Firsname_EB.getAttribute("value");
		System.out.println("Typed characters at firstname editbod is => "+Fname);
		
		//Verify Firsntame editbox is visible
		if(Signup.Firsname_EB.isDisplayed())
			System.out.println("Visible at webpage");
		else
			System.out.println("Not visible at webpage");
		
	}

}
