package pageobjects.With_Global_Constructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Signup 
{

	public Gmail_Signup(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//select[@aria-label='Year']")
	public WebElement CreateAccount_link;
	

}
