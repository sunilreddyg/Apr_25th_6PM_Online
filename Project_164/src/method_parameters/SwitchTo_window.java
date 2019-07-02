package method_parameters;

import org.openqa.selenium.By;

public class SwitchTo_window 
{

	public static void main(String[] args) throws Exception 
	{
	
		
		//Create object for repository
		Repository obj=new Repository();
		obj.Launch_Browser("chrome");
		obj.Load_Webpage("https://www.facebook.com/");
		obj.Set_timeout(30);
		obj.CaptureScreen("Facebook_page");
		
		By Instagram_extenal_link=By.linkText("Instagram");
		obj.Click_Element(Instagram_extenal_link);
		Thread.sleep(5000);
		
		obj.SwitchTo_Window("Instagram");
		Thread.sleep(2000);
		obj.CaptureScreen("Instagram_Window");
		
		//Using object referral close browser window
		obj.driver.close();
		
		
		//Switch to mainwindow 
		obj.SwitchTo_Window("Facebook");
		obj.CaptureScreen("Mainwindow_From_Instagram");
		

	}

}
