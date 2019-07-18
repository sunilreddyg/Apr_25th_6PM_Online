package framework_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass {
  
  @BeforeClass //Invoke method before execution of first @Test annotation with in class
  public void beforeClass() 
  {
	  System.out.println("Precondition");
  }

  @AfterClass //Invoke after execution of last @Test annotaition
  public void afterClass()
  {
	  System.out.println("Postcondition");
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
