package framework_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class WebDriver_Testcase_Using_Testng
{
  WebDriver driver;
  
  
  
  	@Test
	void Verify_Signup_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		Reporter.log("Expected title presented => "+driver.getTitle());
	}
	
	@Test
	void Verify_SignIn_link() 
	{
		driver.findElement(By.xpath("//a[@href='/login/']")).click();
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		Reporter.log("Expected title presented => "+driver.getTitle());
	}
	
	@Test
	void Verify_Messenger_link() 
	{
		driver.findElement(By.xpath("//a[@href='https://messenger.com/']")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		Reporter.log("Expected title presented => "+driver.getTitle());
	}
	
	
	@Test
	void Verify_Games_link() 
	{
		driver.findElement(By.xpath("//a[@href='/games/']"));
		Assert.assertEquals("Games", driver.getTitle());
		Reporter.log("Expected title presented => "+driver.getTitle());
	}
	
	
	
	
	
	
 
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.get("http://facebook.com");
  }

  @AfterMethod
  public void afterMethod(Method method) throws Exception
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
	FileUtils.copyFile(src, new File("screens\\"+time+" "+method.getName()+".png"));
  }

  @BeforeClass
  public void beforeClass() 
  {
	//Set runtime environment variable for chromedriver
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(5000);
	  driver.close();
  }
  
  
  
  

}
