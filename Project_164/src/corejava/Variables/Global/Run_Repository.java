package corejava.Variables.Global;

public class Run_Repository {

	public static void main(String[] args) 
	{
		
		//Create object for repository class
		Repository obj=new Repository();
		obj.Open_Browser();
		
		
		//Get Global variable and assign value at runtime
		obj.url="http://facebook.com";
		obj.Load_Webpage();
		
		
		//Get Username and password global variable and assign runtime values
		obj.username="qadarshan@gmail.com";
		obj.password="Hello123456";
		obj.User_login();
		
		
		
		
		
		

	}

}
