package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_using_mouseActions 
{

	public static void main(String[] args) 
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		//Identify frame and switch to it
		WebElement Demo_Frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Demo_Frame);
		
		
		//Identify locations under frame
		WebElement Src=driver.findElement(By.id("draggable"));
		WebElement Dst=driver.findElement(By.id("droppable"));
		
		
		//Enable mouse and keyboard interactions at automation browser
		Actions action=new Actions(driver);
		
		action.clickAndHold(Src).moveToElement(Dst).release(Src).build().perform();
		
		
		
		
		
		
		
		

	}

}
