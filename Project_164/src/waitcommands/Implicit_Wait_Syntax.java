package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Syntax 
{

	public static void main(String[] args) 
	{	
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Browser initiation and loading webpage..
		WebDriver driver=new ChromeDriver();
		
		//Manage implicit timegaps at automation browser.
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS)
		.pageLoadTimeout(50, TimeUnit.SECONDS)
		.setScriptTimeout(50, TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Maximized");
		
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Automated");

		System.out.println("timeout released element identified");
	}

}
