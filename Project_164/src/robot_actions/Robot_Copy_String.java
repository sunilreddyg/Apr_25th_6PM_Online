package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class Robot_Copy_String {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		//Launch notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		String text="Selenium automates browsers. That's it! What you do with that power is entirely up to you";
		
	
		//Select String
		StringSelection Stext=new StringSelection(text);
		//Get system default clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set content to clipboard
		clipboard.setContents(Stext, Stext);
		
		
		//Use Ctrl+V keyboard shorcut to paste copied text into notpad file..
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release ctrl key from keydown..
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Press ctrl+S to save notepad file
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		
		

		String path="C:\\Users\\SUNIL\\git\\Apr_25th_6PM_Online\\Project_164\\src\\robot_actions\\Op.txt";
		//Select String path
		StringSelection Spath=new StringSelection(path);
		//Set content to clipboard
		clipboard.setContents(Spath, Spath);
		
		//Use Ctrl+V keyboard shorcut to paste copied text into notpad file..
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(5000); //static timegap
		
		//Press Enter shortcut
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		//Release ctrl key from keydown..
		robot.keyRelease(KeyEvent.VK_CONTROL);
				
	}

}
