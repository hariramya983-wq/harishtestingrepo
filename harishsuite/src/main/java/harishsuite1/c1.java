package harishsuite1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {

	@Test(groups = "one")
	public void t1() throws InterruptedException
	{//Step 1 :Configuring chorme driver
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		
		//Creating object for Chrome driver
		ChromeDriver ob =new ChromeDriver();
		//setp3 : Visiting the website
		ob.get("https://www.letskodeit.com/practice");
		
		//ob.findElementById("bmwradio").click();
		//Thread.sleep(3000);
		//ob.findElementById("benzradio").click();
		//Thread.sleep(3000);
		//ob.findElementById("hondaradio").click();
		//Thread.sleep(3000);
		
		ob.findElementById("bmwcheck").click();
		Thread.sleep(3000);
		ob.findElementById("benzcheck").click();
		Thread.sleep(3000);
		ob.findElementById("hondacheck").click();
		Thread.sleep(3000);
        ob.quit();
	}
	}

