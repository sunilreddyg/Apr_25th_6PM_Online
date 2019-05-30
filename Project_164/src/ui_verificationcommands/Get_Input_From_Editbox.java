package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Input_From_Editbox {

	public static void main(String[] args)
	{
		
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Brower initiation
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("https://www.facebook.com");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		
		//Identify Editbox
		WebElement Firstname_Editbox=driver.findElement(By.xpath("//input[@name='firstname']"));
		//Type input text to editbox
		Firstname_Editbox.clear();
		Firstname_Editbox.sendKeys("Sunil");
		
		
		//Example:--> get typed text at editbox using get Attribute.
		String runtime_input=Firstname_Editbox.getAttribute("value");
		System.out.println("Typed input value is => "+runtime_input);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
