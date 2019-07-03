package method_return_types;

public class MethodTypes 
{
	//Void method doesn't return any value
	public void method1()
	{
		String name="WebDriver";
	}
	
	
	/*
	 * Note:-->
	 * 		=> Otherthan void for all method we need to write
	 * 			return keyword.
	 * 		=> Whatever we returning value it should match with
	 * 			method return type..
	 * 		=> At final it return value to method name..
	 * 		
	 */
	
	public String method2()
	{
		String toolname="Selenium";
		return toolname;
		
	}
	
	
	public int method3()
	{
		return 100;
	}

	

	public static void main(String[] args) 
	{
		//Create object for class
		MethodTypes obj=new MethodTypes();
		//Calling void mehtod
		obj.method1();
		
		//Calling other return type methods
		String val=obj.method2();
		System.out.println("retunted value is => "+val);
		
		//Calling int return type method
		int total=obj.method3();
		System.out.println("integer return value is => "+total);

	}

}
