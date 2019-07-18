package junit_framework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Assertions_At_Junit
{
	@Test
	void test1() 
	{
		
		Assertions.assertEquals("MQ", "mq");
		System.out.println("Test1 passed");
		
	}
	
	
	@Test
	void test2()
	{
		Assertions.assertTrue(true);
		System.out.println("Test2 passed");
	}
	
	
	@Test
	void test3()
	{
		System.out.println("Test2 passed");
	}
	
	
	/*
	 * Assertion is a validation command in juit framework.
	 *	Note:--> When assertion pass only it allow to execut next
	 *			line of command, Otherwise it fail current test and
	 *			jump execution to next test under junit class..
	 */
	
	

}
