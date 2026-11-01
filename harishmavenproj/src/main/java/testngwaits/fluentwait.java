package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class fluentwait  {
	
	@Test
	public void ab() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","webdriver.chrome.driver\",\"C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	//Declare and initialise a fluent wait
			FluentWait w = new FluentWait(driver);
			//Specify the timout of the wait
			w.withTimeout(6000, TimeUnit.MILLISECONDS);
			
			//Sepcify polling time
			w.pollingEvery(2000, TimeUnit.MILLISECONDS);
			
			
			w.until(ExpectedConditions.alertIsPresent());
			
			
			driver.quit();
}
}