package framework_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BeforeMethod_And_AfterMethod {
 
  @BeforeMethod //Invoke before each @Test annotation
  public void beforeMethod() 
  {
	  System.out.println("Precondition");
  }

  @AfterMethod //Invoke after each @Test annotation
  public void afterMethod() 
  {
	  System.out.println("postcondition"+"\n");
  }
  
  @Test//Invoke method to execute
  public void tc001() 
  {
	  Reporter.log("tc001 login valid executed",true);
  }
  
  @Test//Invoke method to execute
  public void tc002() 
  {
	  Reporter.log("tc002 login INvalid executed",true);
  }
  
  @Test//Invoke method to execute
  public void tc003() 
  {
	  Reporter.log("tc003 login Without data executed",true);  // true command it genarate report at Console
  }


}
