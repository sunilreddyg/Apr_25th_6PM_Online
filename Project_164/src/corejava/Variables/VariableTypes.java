package corejava.Variables;

public class VariableTypes 
{
	public String toolname="WebDriver";   //Instant variable 
	public static int val=2340;   //Class variable[Static Variables]

	public void method1()
	{
		String name="IDE";
		System.out.println(name);
		System.out.println("Instant variable from method1 => "+toolname);
	}
	
	public void method2()
	{
		System.out.println("Instant variable from method2 => "+toolname);
	}
	
	
	
	public static void main(String[] args)
	{
		/*
		 * Instant variable calling from main method. 
		 */
		VariableTypes obj=new VariableTypes();
		String first_tool=obj.toolname;
		System.out.println(first_tool);
		
		/*
		 * Static Variable calling
		 */
		int first_val=VariableTypes.val;
		System.out.println(first_val);
	}

}
