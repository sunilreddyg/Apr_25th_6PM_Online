package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Radio_button_Selected {

	public static void main(String[] args) throws Exception 
	{
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		
		/*
		 * Testcase:-->
		 * 			On return date open or selected. The roundtrip radio button
		 * 			shoule be selected
		 */
		
		
		//Just tap or click on Return date element
		WebElement Return_Data=driver.findElement(By.id("ctl00_mainContent_view_date2"));
		Return_Data.click();
		Thread.sleep(5000);
		
		
		//Verify Roundtrip radio button should be selected
		WebElement Roundtrip_btn=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		if(Roundtrip_btn.isSelected())
			System.out.println("Test pass:--> Round trip is selected on return date open");
		else
			System.out.println("Test fail:-->  Round trip is not selected on return date open");
		
		
		
		
		
		
		
		

	}

}
