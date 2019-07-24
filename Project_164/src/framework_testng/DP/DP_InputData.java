package framework_testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DP_InputData 
{
  @Test(dataProvider = "dp",enabled=false)
  public void test(Integer n, String s) 
  {
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
    };
  }
  
  
  
  @Test(dataProvider="User_info")
  public void get_user_info(String Username, String mobile,String email)
  {
	  
  }
  
  
  
  
  @DataProvider
  public static Object[][] User_info() 
  {
    return new Object[][] 
    {
      new Object[] { "user1","9030248855","user1.info@gmail.com" },
      new Object[] { "user2","9030848855","user2.info@gmail.com" },
      new Object[] { "user3","9030268855","user3.info@gmail.com" },
      new Object[] { "user4","9030168855","user4.info@gmail.com" },
    };
  }
  
  
}
