package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class FB_Signup 
{
		
	
	@FindBy(how=How.ID,using="u_0_l") 
	public WebElement Firsname_EB;
	
	
	@FindBy(id="u_0_n")
	public WebElement Surname_EB;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	public WebElement Mobile_or_Email_EB;
	
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	public WebElement Retype_Mobile_or_Email_EB;
	
	@FindBy(xpath = "//input[@data-type='password']")
	public WebElement Password_EB;
	
	@FindBy(xpath = "//select[@aria-label='Day']")
	public WebElement Day_DD;
	
	@FindBy(xpath = "//select[@aria-label='Month']")
	public WebElement Month_DD;
	
	@FindBy(xpath = "//select[@title='Year']")
	public WebElement Year_DD;
	
	
	@FindBys(@FindBy(xpath="//select[@aria-label='Month']/option"))
	public List<WebElement> Month_Dropdown_options;
	
	
	
	/*
	 * Method:--> User registration
	 */
	public void Select_All_Reg_Dropdowns()
	{
		
		//Select dropdown options using page object
		new Select(Day_DD).selectByVisibleText("13");
		new Select(Month_DD).selectByVisibleText("Dec");
		new Select(Year_DD).selectByVisibleText("1990");
		
	}
	
	
}
