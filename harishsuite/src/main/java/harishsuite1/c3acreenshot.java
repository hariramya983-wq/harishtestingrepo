package harishsuite1;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3acreenshot 
{
	@Test(groups="one")
	public void t1() throws IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
	
	//Creating object for Chrome driver
	ChromeDriver ob =new ChromeDriver();
	//setp3 : Visiting the website
	ob.get("http://www.google.com");
	
	//create an object for point cls
	//pass desired  x and y value in it
	//apply it on window
	Point pt =new Point(100,200);
	ob.manage().window().setPosition(pt);
	
	File f =ob.getScreenshotAs(OutputType.FILE);
	//Copy and Paste ->FileUtils'
	FileUtils.copyFile(f,new File("abc.png"));
	ob.quit();
}

}
