package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:-->
		 * 			Verify search job without enter selectcourse and keyword enter
		 * Steps:-->
		 * 		=> Given url https://www.firstnaukri.com/
		 * 		=> When click search button without enter Select course and Keyword Enter
		 * 		=> Then receive Alert with expected text.
		 */
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		//Identify Search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);
		
		
		//Switch to alert
		Alert alert=driver.switchTo().alert();
		
		//Capture text on alert window
		String alert_msg=alert.getText();
		System.out.println(alert_msg);
		
		//Closer alert window by accepting
		alert.accept();
		
		
		
		
		
		/*
		 * Capture text on alert window
		 * 
		 * 	driver.switchTo().alert().getText();
		 * 
		 * Accept popup window    [It close window]
		 * 	
		 * 	driver.switchTo().alert().accept();
		 * 
		 * Dismiss alert window   [It close window]
		 * 
		 * 	driver.switchTo().alert().dismiss();
		 * 
		 * Send text to popup-window  [Prompt window]
		 * 
		 * 	driver.switchTo().alert().sendkeys("text");
		 */
		
		
		/*
		 * How to identify alert presented at webpage
		 * 		=> Alert disable all page elements.
		 * 		=> We can't inspect on alert window.
		 * 		=> When alert was not handled properly we receive
		 * 				exception called "UnhandledAlertException"
		 */
		
		
		/*
		 * Alert Exception:-->
		 * 
		 * 	UnHandledAlertException   :--> When alert was not handled at webpage.
		 * 	NoAlertPresentedException :--> When Expected alert not presented at webpage
		 */
		

	}

}
