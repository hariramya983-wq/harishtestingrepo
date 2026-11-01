package harishpr1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class c1 {
	@Parameters({"USER","PASS"})//USER=u,PASS=v
	@Test
	public void t2(String u,String v)
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		ob.findElementByName("email").sendKeys(u);
		
		ob.findElementByName("pass").sendKeys(v);	
	}

}
