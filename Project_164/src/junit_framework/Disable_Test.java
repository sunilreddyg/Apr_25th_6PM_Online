package junit_framework;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Login Test") 
public class Disable_Test 
{
	@Disabled //Ignore method execution
	void test1()
	{
		System.out.println("test1 executed");
	}
	
	@Test //Invoke method execution
	void test2()
	{
		System.out.println("test2 executed");
	}

}
