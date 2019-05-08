package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("http://gmail.com");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		//Identify email editbox and type valid email
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan@gmail.com"+Keys.ENTER);
		
		
		Thread.sleep(5000);  //Timeout to load password
		
		
		//IDentify password editbox
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Hello123456"+Keys.ENTER);
		
		
		
		/*
		 * Note;-->
		 * 		Sendkeys method accept "characters sequences" and "keyboard shortcuts"
		 */
		
		
		
		
	}

}
