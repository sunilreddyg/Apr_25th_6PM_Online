package method_parameters;

public class Local_Parameters 
{
	
	public void print_tool()
	{
		String name="WebDriver";
		System.out.println(name);
	}
	
	//Method with single parameter
	public void print_tool(String toolname)
	{
		String name=toolname;
		System.out.println("Runtime toolname is =>"+name);
	}
	
	//method with single parameter
	public void print_tool(double version)
	{
		double tool_version=version;
		System.out.println("Runtime tool version is => "+tool_version);
	}
	
	//method with multiple parameters
	public void print_tool(String toolname,double version)
	{
		System.out.println("toolname is => "+toolname +"  and  tool version is => "+version);
	}
	

	public static void main(String[] args) 
	{
		
		//Create object for class
		Local_Parameters obj=new Local_Parameters();
		//calling method without argument
		obj.print_tool();
		
		//Calling method using single agrument
		obj.print_tool("Cucumber");
		obj.print_tool(1.5);
		
		//Calling method with multiple arguments
		obj.print_tool("java", 12.1);
		
		

	}

}
