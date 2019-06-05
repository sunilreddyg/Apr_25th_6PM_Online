package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert_Using_TryCatch 
{

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
		
		
		/*
		 *   Handle survival popup when it was presented.
		 */
		
		
		try {
			

			//Switch to alert
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert window
			String alert_msg=alert.getText();
			System.out.println(alert_msg);
			
			//Closer alert window by accepting
			alert.accept();
			
			
		} catch (NoAlertPresentException e) {
			System.out.println("No alert presented at webpage");
		}
		
		
		
		

	}

}
