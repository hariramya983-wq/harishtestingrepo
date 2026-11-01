package testingattributes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class realexample {
	ChromeDriver ob;
	@Test(priority=0, description="visiting", groups ="one")
	public void visiting()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("http://www.mycontactform.com");
	}
	@Test(priority=1, description="maximizing", groups ="one")
	public void max()
	{
		ob.manage().window().maximize();
	}
	@Test(priority=2, description="maximizing", invocationCount = 3)
	public void refresh()
	{
		ob.navigate().refresh();
	}
	@Test(priority=3, description="clicking", dependsOnGroups = "one")
	public void clicking()
	{
		ob.findElementByLinkText("Help").click();
	}
	@Test(priority=4, description="clicking", dependsOnGroups = "one")
	public void close()
	{
		ob.quit();
	}
	

}
