package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_BetWeen_Frames 
{

	public static void main(String[] args) 
	{

		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize();
		
		
		
		//Switch To frame Using Frame ID/Name property
		driver.switchTo().frame("menuFrame");
		
		
		//Identify Fee Structure link under Frame
		WebElement Fee_Structure=driver.findElement(By.linkText("Fee Structure"));
		Fee_Structure.click();
		
		//GetControls from menu frame to mainpage
		driver.switchTo().defaultContent();
		
		
		//Identify Frame using webelement 
		WebElement Body_Frame=driver.findElement(By.xpath("//frame[@title='bodyFrame']"));
		//Switch to frame using webelement referral
		driver.switchTo().frame(Body_Frame);
		
		
		//Select University dropdown under bodyframe
		new Select(driver.findElement(By.id("univ")))
		.selectByIndex(3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
