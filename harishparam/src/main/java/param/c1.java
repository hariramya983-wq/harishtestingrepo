package param;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class c1 {
	@Parameters({"USER","PASS"})
	@Test
		public void t1(String u,String V)
		{
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("http://www.facebook.com");
		ob.findElementByName("email").sendKeys(u);
		
		ob.findElementByName("Pass").sendKeys(v);
		
	}
		}
}
