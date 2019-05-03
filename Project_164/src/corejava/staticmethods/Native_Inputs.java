package corejava.staticmethods;

public class Native_Inputs
{
	
	public static void keyboard()
	{
		System.out.println("Keyboard executed");
	}
	
	
	public static void Mouse()
	{
		System.out.println("Mouse executed");
	}
	
	
	public static void main(String[] args) 
	{
		
		/*
		 * With in class any static methods to call no need of object
		 * creation. We can call methods directly using method name.
		 */
		
		keyboard();
		Mouse();
		
		

	}

}
