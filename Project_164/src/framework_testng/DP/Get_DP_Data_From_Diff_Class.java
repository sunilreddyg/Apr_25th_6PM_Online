package framework_testng.DP;

import org.testng.annotations.Test;

public class Get_DP_Data_From_Diff_Class 
{
	
	
	/*
	 * Note:--> Inorder to all dataprovider annotation from diff class
	 * 			we need to add classname as well.
	 * 
	 * 		=> Dataprovider annotation should declare with static specifier
	 */

	
	@Test(dataProvider="User_info",dataProviderClass=DP_InputData.class)
	public void get_info(String User,String Mobile, String email)
	{
		
	}

}
