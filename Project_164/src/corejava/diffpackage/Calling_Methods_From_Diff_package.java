package corejava.diffpackage;

import corejava.defaultmethods.RobotActions;
import corejava.staticmethods.Native_Inputs;

public class Calling_Methods_From_Diff_package 
{

	public static void main(String[] args) 
	{
		
		/*
		 * To call methods from differnet package we must follow below steps.
		 * 
		 * 	=> We must declare method with public modifier.
		 *  => We must import other package and class referrals to current package
		 *  		and class.
		 * 		
		 */
		
		//Calling default methods without static access specifier
		RobotActions obj=new RobotActions();
		obj.run();
		obj.walk();
		
		
		//Call static methods
		Native_Inputs.keyboard();
		Native_Inputs.Mouse();
		
	}

}
