package corejava.Variables.Global;

import org.openqa.selenium.By;

public class FB_Locators 
{
	
	/*
	 * public:-->
	 * 			is a access modifier it allow method or variable to access
	 * 			across packages
	 * 
	 * Static:-->
	 * 			is a access specifier it allow method or variable to call
	 * 			without object creation.
	 */
	
	
	public static By Signin_Email=By.xpath("//input[@name='email']");
	public static By Signin_password=By.xpath("//input[@id='pass']");
	public static By Signin_btn=By.xpath("//input[@value='Log In']");
	
	
	
	
	

}
