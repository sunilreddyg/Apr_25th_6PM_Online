package touch_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Smaple_Touch_Actions {

	public static void main(String[] args)
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//Enable touch interactions at automation browser
		TouchActions touch=new TouchActions(driver);
		
		//IDentify location at webpage
		WebElement Category=driver.findElement(By.xpath("//span[contains(.,'Category')]"));
		touch.singleTap(Category).perform();//Command analog to mouse click
		
		
		
		
	}

}
