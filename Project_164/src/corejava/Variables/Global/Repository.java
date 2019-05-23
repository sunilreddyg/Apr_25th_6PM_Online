package corejava.Variables.Global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repository 
{
	public WebDriver driver=null;
	public String url=null;
	public String username=null;
	public String password=null;
	
	public void Open_Browser() 
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		driver=new ChromeDriver();
		//maximize browser window
		driver.manage().window().maximize();
		
	
	}
	
	
	public void Load_Webpage()
	{
		driver.get(url);
	}
	
	
	public void User_login()
	{
		//Script without referral of webelement
		driver.findElement(FB_Locators.Signin_Email).clear();
		driver.findElement(FB_Locators.Signin_Email).sendKeys(username);
		
		//Script using element referral..
		WebElement Password_Element=driver.findElement(FB_Locators.Signin_password);
		Password_Element.clear();
		Password_Element.sendKeys(password);
		
		//Login button using webelemnet referral
		WebElement Login_btn_Element=driver.findElement(FB_Locators.Signin_btn);
		Login_btn_Element.click();
	}
	

}
