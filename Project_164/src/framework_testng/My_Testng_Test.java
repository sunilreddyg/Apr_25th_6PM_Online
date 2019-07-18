package framework_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class My_Testng_Test 
{
  @Test//Invoke method to execute
  public void tc001() 
  {
	  Reporter.log("tc001 login valid executed");
  }
  
  @Test//Invoke method to execute
  public void tc002() 
  {
	  Reporter.log("tc002 login INvalid executed");
  }
  
  
  @Test//Invoke method to execute
  public void tc003() 
  {
	  Reporter.log("tc003 login Without data executed",true);  // true command it genarate report at Console
  }
 
}
