package harishsuite1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c2 {

	@Test(groups = "one")
	public void t2()
	{
		//Step 1 :Configuring chorme driver
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("https://www.google.com");
		
		//Cookies : Temporary information stored by the browser
		
		Set<Cookie> c = ob.manage().getCookies();
		System.out.println("No of Cookies present are " + c.size());
		
		
		// Delete Cookies : Temporary delete cookies for that instance and not permentely
		ob.manage().deleteAllCookies();
		Set<Cookie> c1 = ob.manage().getCookies();
		System.out.println("No of Cookies present after deletion is  " + c1.size());
		ob.quit();	
	}
}
