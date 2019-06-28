package method_parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import pageobjects.FB_Signup;

public class Run_Repository_Keywords {

	public static void main(String[] args) 
	{
		
		
		//Create object for repository
		Repository obj=new Repository();
		obj.Launch_Browser("firefox");
		obj.Load_Webpage("http://facebook.com");
		obj.Set_timeout(30);
		
		
		//Type text into editbox using xpath location..
		obj.Enter_text("//input[@id='u_0_l']", "Akash");
		obj.Enter_text("//input[@name='lastname']","Saha");
		
		//Type text into editbox using Diff locators
		obj.Enter_text(By.name("reg_email__"), "AKashsaha@gmail.com");
		obj.Enter_text(By.cssSelector("#u_0_t"), "AKashsaha@gmail.com");
		
		
		//Get Page object using factory class
		FB_Signup signup=PageFactory.initElements(obj.driver, FB_Signup.class);
		obj.Enter_text(signup.Password_EB, "Hello1234");
		
		//Select dropdown using pagefactory class
		obj.Select_Dropdown(signup.Day_DD, "13");
		obj.Select_Dropdown(signup.Month_DD, "May");
		obj.Select_Dropdown(signup.Year_DD, "1990");
	}

}
