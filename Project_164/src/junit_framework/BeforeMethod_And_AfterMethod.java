package junit_framework;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeMethod_And_AfterMethod 
{
	//Note:--> in junit beforeach knows as @BeforeMethod
	@BeforeEach//Invoke every @Test annoation before.
	void setUp() throws Exception 
	{
		System.out.println("precondition");
	}

	//Note:--> In junit aftereach known as  @AfterMethod
	@AfterEach//Invoke after every @Test annoation
	void tearDown() throws Exception 
	{
		System.out.println("post condition"+"\n");
	}

	@Test //Invoke method to run
	void test1() 
	{
		System.out.println("test1 executed");
	}
	
	
	@Test //invoke method to run
	void test2() 
	{
		System.out.println("test2 executed");
	}
	
	@Test //Invoke method to run
	void test3() 
	{
		System.out.println("test3 executed");
	}

}
