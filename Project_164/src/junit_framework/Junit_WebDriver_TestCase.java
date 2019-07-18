package junit_framework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junit_WebDriver_TestCase 
{
	static WebDriver driver;
	@Rule TestName test=new TestName();
	

	@Test
	void Verify_Signup_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		Assertions.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
	}
	
	@Test
	void Verify_SignIn_link() 
	{
		driver.findElement(By.xpath("//a[@href='/login/']")).click();
		Assertions.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
	}
	
	@Test
	void Verify_Messenger_link() 
	{
		driver.findElement(By.xpath("//a[@href='https://messenger.com/']")).click();
		Assertions.assertEquals("Messenger", driver.getTitle());
	}
	
	
	@Test
	void Verify_Games_link() 
	{
		driver.findElement(By.xpath("//a[@href='/games/']"));
		Assertions.assertEquals("Games", driver.getTitle());
	}
	
	
	
	
	@BeforeEach
	void setUp() throws Exception 
	{
		driver.get("http://facebook.com");
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		//Get system default time..
		Date d=new Date();    // import java.util;
		//Simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Convert system default time using simple date formatter
		String time=sdf.format(d);
				
		//capture screen and convert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Access local utilites to dump screen
		FileUtils.copyFile(src, new File("screens\\"+time+test.getMethodName()+".png"));
						
	}
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		//Set runtime environment variable for chromedriver
		 System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

}
