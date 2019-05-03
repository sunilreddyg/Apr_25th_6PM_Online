package corejava.defaultmethods;


public class RobotActions 
{
	
	public void run()
	{
		System.out.println("run executed");
	}
	
	
	public void walk()
	{
		System.out.println("walk executed");
	}
	
	
	public static void main(String args[])
	{
		//Create object for class
		RobotActions obj=new RobotActions();
		obj.walk();
		obj.run();
		
	}
	

}
