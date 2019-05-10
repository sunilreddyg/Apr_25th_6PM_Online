package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Keyboard_ShortCut {

	public static void main(String[] args) 
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("http://facebook.com");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		/*
		 * Note:--> Sendkeys method allow "characters" and "keyboard shortcuts"
		 * 
		 * 			=> Characters sequences:--->
		 * 						Element.Sendkeys("a-z");
		 * 
		 * 			=> Keyboard shortcuts:-->
		 * 						Element.Sendkeys(keys.TAB);
		 */
		
		
		//Identify firstname editbox location
		driver.findElement(By.id("u_0_j")).clear();     //only for editbox to clear input
		driver.findElement(By.id("u_0_j"))
		.sendKeys("Ajay"+Keys.TAB+"Krishna"+Keys.TAB+"Ajaykrishan@gmail.com");
		
		
		/*
		 * Note:--> Sendkeys command allow dropdown option selection and checkbox 
		 * 		radio button selection
		 */
		
		//Day Dropdown selection using keyboard shrotcuts
		driver.findElement(By.id("day")).sendKeys("15");
		
		//Month Dropdown selection using keyboard shortcuts
		driver.findElement(By.name("birthday_month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		//Year Dropdown Selection using keyboard shortcuts
		driver.findElement(By.id("year")).sendKeys("2000");
		
		
		/*
		 * Female radio button selection using keyboard shortcuts
		 *     =>space is a shrotcut for selection of radio button and checkboxes..
		 */
		driver.findElement(By.xpath("//input[@value='1']")).sendKeys(Keys.SPACE);
		
		
		
		
		
		
	}

}
