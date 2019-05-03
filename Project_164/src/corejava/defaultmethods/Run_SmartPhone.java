package corejava.defaultmethods;

public class Run_SmartPhone 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> Any public call methods to run or call from diff
		 * 			class we must create object..
		 * 
		 * Object Syntax:-->
		 * 
		 * 			new classname().methodname();
		 * 
		 * 			=> new is a keyword it follows instances of class.
		 * 			=> DOT [.] operator access methods and variables of class
		 */
		
		new SmartPhone().camera();
		new SmartPhone().touch();
		
		

	}

}
