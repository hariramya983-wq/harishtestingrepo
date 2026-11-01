package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class tesngwaits {
	/*testng waits/webdriver synchronisaiton technique
	 * 
	 * conditional waits: explicit wait
	 * unconditional waits: implicit wait
	 * 
	 * implicit wait : once it is declared all the code which is present afterit will take the time limit
	 * 
	 * code is correct: if it executes within time limit, it will not wait for the completion of time limit
	 * code is wrong : it will wait for the completion of time limit, then it throws error
	 * 
	 * 
	 * 
	 * */
	@Test
	public void implicit()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		ob.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(ob.getTitle());
		System.out.println(ob.getCurrentUrl());
		ob.findElementByLinkText("Images");
		ob.quit();
		
	}
}
