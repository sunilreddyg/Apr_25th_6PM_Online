package method_parameters;

import org.openqa.selenium.By;

public class Mouse_Hover_Actions 
{

	public static void main(String[] args) 
	{
		
		//Create object for repository
		Repository obj=new Repository();
		obj.Launch_Browser("chrome");
		obj.Load_Webpage("https://www.hdfcbank.com/");
		obj.Set_timeout(30);
		
		
		
		By Main_menu_Prodcuts=By.linkText("Products");
		By Cards_SubMenu=By.linkText("Cards");
		By CreditCards_FinalList=By.linkText("Credit Cards");
		
		
		obj.Mouse_hover(Main_menu_Prodcuts);
		obj.Mouse_hover(Cards_SubMenu);
		obj.Click_Element(CreditCards_FinalList);
		
		
		
		
		

	}

}
