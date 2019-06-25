package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Loop {


	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * While:-->
		 * 			=> While is a condition based loop. It iterate repeatedly
		 * 				set of intructions as long as give condition ture.
		 * 
		 * 			=> While loop accept iteration on true condition and it
		 * 				continue iteration until condition get false.
		 * 
		 * 			=> In while condition to return flase we need to arrange
		 * 				situvation other wise it get into infinity loop.
		 * 
		 */
		
		int i=0;
		while(i < 10)
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		
		
		
		
		/*
		 * Example:--> Arrange explicit wait until selected element comes to
		 * 				visible at fornt page.. Using While loop..
		 */
		
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify Retype password editbox
		WebElement Retype_password_EB=driver.findElement(By.id("u_0_t"));
		
		
		//Accept while incase element not visible at webpage and wait untile object visible at webpage
		int j=0;
		while(!Retype_password_EB.isDisplayed())
		{
			Thread.sleep(1000);
			
			if(j==30)
			{
				throw new Exception("Timeout Element not visible at webpage");
			}
			
			j=j+1;
		}
		
		
		System.out.println("loop ejected it means element visible at webpage");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
