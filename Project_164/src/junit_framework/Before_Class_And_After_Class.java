package junit_framework;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Before_Class_And_After_Class 
{
	//NOte:--> In unit4 this annotation named as "@BeforeClass"
	@BeforeAll//Invoke before execution of first @Test annotation
	static void setUpBeforeClass() throws Exception 
	{
		System.out.println("precondition");
	}

	
	//NOte:--> In unit4 this annotation named as "@AfterClass"
	@AfterAll//invoke after execution of last @Test annotation.
	static void tearDownAfterClass() throws Exception
	{
		System.out.println("post condition");
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
