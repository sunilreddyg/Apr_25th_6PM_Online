package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Verify_AlertPresented_Using_Expected_Conditions {

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
		//Search_btn.click();
		Thread.sleep(5000);
		
		
		//Verify Alert presented using conditional statemenet.
		if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
		{

			//Switch to alert
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert window
			String alert_msg=alert.getText();
			System.out.println(alert_msg);
			
			//Closer alert window by accepting
			alert.accept();
		}
		else
		{
			System.out.println("alert not presented webpage");
		}
		
		

	}

}
