package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class testngwait1 {
	/*explicit wait : time limit is applicable for particular conditions
	 * create an object for webdriver wait class
	 * pass driver instance and time limit as input
	 * call conditions 
	 *  code is correct: if it executes within time limit, it will not wait for the completion of time limit
	 * code is wrong : it will wait for the completion of time limit, then it throws error
	 */
	@Test
	public void Explicit()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		WebDriverWait w =new WebDriverWait(ob, 5);
		//title
			//w.until(ExpectedConditions.titleIs("Google")); //5
		
		//titlecontains
			//w.until(ExpectedConditions.titleContains("oo")); //5
		
		//alert is present
			//w.until(ExpectedConditions.alertIsPresent()); //5
		
		//visiblity of elements
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));
		
		////visiblity of all elements
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		
		//Clickable
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
	
}}
