package method_return_types;

public class Run_Repository {

	public static void main(String[] args) 
	{
	
		//Create object for Repository class
		Repository obj=new Repository();
		obj.Launch_Browser("chrome");
		obj.Load_Webpage("http://facebook.com");
		obj.Set_timeout(30);
		
		//Write decision to verify title presented at webpage
		if(obj.isTitle_Presented("Facebook"))
			System.out.println("Expected title presented");
		else
			System.out.println("Wrong title presented");

		//Write Decision to verify url presented at webpage
		if(obj.isUrl_Presented("http://facebook.com"))
			System.out.println("url presented");
		else
			System.out.println("url not presented");
		
		
		//Close alert window
		obj.CloseAlert();
		
		
		
	}

}
