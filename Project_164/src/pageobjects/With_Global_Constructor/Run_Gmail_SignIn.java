package pageobjects.With_Global_Constructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Gmail_SignIn 
{

	public static void main(String[] args) 
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		//Create object for Gmail Signin class
		Gmail_Signin Signin=new Gmail_Signin(driver);

		Signin.Email_Editbox.clear();
		Signin.Email_Editbox.sendKeys("qadarshan@gmail.com");
		
		Signin.Email_next_btn.click();
		
		
		//Create object for gmail signup class
		Gmail_Signup Signup=new Gmail_Signup(driver);
		Signup.CreateAccount_link.click();
		
		
		
		
		
		
	}

}
